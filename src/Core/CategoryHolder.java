package Core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CategoryHolder {
	static final String fileName = "assets/taxonomy.txt";
	private Map<String, Double> mapOfValues = new HashMap<String, Double>();

	CategoryHolder() {
		loadMap();
	}

	private void parseLine(String line) {
		int start = line.indexOf('[');
		int end = line.indexOf("]");
		char[] buff = new char[200];
		int buffIndex = 0;
		String word;
		for (int i = start+1; i != end; i ++){
			if (line.charAt(i) == ','){
				buff[buffIndex] = '\0';
				word = String.valueOf(buff,0,buffIndex);
				buffIndex = 0;
				this.mapOfValues.put(word, (double) 0);
			}else{
				buff[buffIndex] = line.charAt(i);
				buffIndex ++;
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
	
	void addValues(Data d){
		
	}
	
	
	public static void main(String[] args){
		CategoryHolder test = new CategoryHolder();
	}
}
