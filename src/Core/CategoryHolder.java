package Core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class CategoryHolder {
	static final String fileName = "assets/taxonomy.txt";
	private Map<String, CategoryData> mapOfValues = new HashMap<String, CategoryData>();
	static int TOPRESULTSNUM = 10;

	CategoryHolder() {
		loadMap();
	}

	private void parseLine(String line) {
		int start = line.indexOf('[');
		int end = line.indexOf("]");
		char[] buff = new char[200];
		int buffIndex = 0;
		String word;
		for (int i = start + 1; i != end; i++) {
			if (line.charAt(i) == ',') {
				buff[buffIndex] = '\0';
				word = String.valueOf(buff, 0, buffIndex);
				buffIndex = 0;
				if (!mapOfValues.containsKey(word))
					this.mapOfValues.put(word, new CategoryData(word));
			} else {
				buff[buffIndex] = line.charAt(i);
				buffIndex++;
			}
		}
	}

	private void loadMap() {
		String currLine;
		try (BufferedReader reader = new BufferedReader(
				new FileReader(fileName))) {
			while ((currLine = reader.readLine()) != null) {
				this.parseLine(currLine);
			}
		} catch (IOException e) {

		}
	}

	void addValues(Data d) {
		for (String key : d) {
			mapOfValues.get(key).add(new Link(d.link, d.get(key)));
		}
	}

	Map<String, CategoryData> getTrending() {
		PriorityQueue<CategoryData> top = new PriorityQueue<CategoryData>(
				TOPRESULTSNUM);
		for (String key : mapOfValues.keySet()) {
			top.add(mapOfValues.get(key));
		}
		HashMap<String, CategoryData> result = new HashMap<String, CategoryData>(
				TOPRESULTSNUM);
		for (CategoryData temp : top){
			result.put(temp.name, temp);
		}
		return result;

	}

	public static void main(String[] args) {
		CategoryHolder test = new CategoryHolder();
	}
}
