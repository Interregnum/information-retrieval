package hw1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IndexReader {

	private IndexReader() {
		super();
	}
	
	@SuppressWarnings("resource")
	public static String readFile(String basePath, String filePath) {
		StringBuilder stringBuilder = new StringBuilder();

		try {
			BufferedReader bufferedReader = new BufferedReader(
					new FileReader(basePath + filePath));
			String currentLine = bufferedReader.readLine();
			
			while(null != currentLine) {
				stringBuilder.append(currentLine);
				stringBuilder.append(" ");
				currentLine = bufferedReader.readLine();
			}
			
			Run.fileIndexMap.put(filePath, Run.fileIndex.toString());
			System.out.println("File read successfully: " + (Run.fileIndex++));
		}
		catch (IOException e) {
			System.out.println("File not found");
		}
		
		return stringBuilder.toString();
	}
}
