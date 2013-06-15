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

	private void parseLine(String parseLine) {

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
}
