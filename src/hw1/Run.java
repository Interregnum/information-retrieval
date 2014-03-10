package hw1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Run {

	protected static Long fileIndex = 0L;
	
	private static final String basePath = "G:\\Workspace\\Information Storage and Retrieval\\nsf award abstracts\\";
	
	protected static Map<String, String> fileIndexMap = new HashMap<String, String>();
	
	protected static Map<String, Index> index = new HashMap<String, Index>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		iterateFilesLevelOne("awards_1999\\awd_1999_00\\a", 9900003L, 9900988L, 1L);
		System.out.println(index.toString());
	}
	
	private static void generateIndexByFile(String filePath) {
		String currentFile = IndexReader.readFile(basePath, filePath);
		List<String> currentTokens = Tokenizer.tokenizeByPunctuationsAndSpaces(currentFile);
		IndexBuilder.buildIndexByFile(currentTokens, filePath);
		System.out.println("Index Generated Successfully for: " + filePath);
	}
	
	private static void iterateFilesLevelOne(String base, Long start, Long end, Long increment) {
		for(Long i = start; i <= end; i += increment) {
			generateIndexByFile(base + i.toString() + ".txt");
		}
	}
}
