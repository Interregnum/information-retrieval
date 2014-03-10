package hw1;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {

	private Tokenizer() {
		super();
	}
	
	public static List<String> tokenizeByPunctuationsAndSpaces(String input) {
		String[] tokenizedArray = input.split("\\p{Punct}|\\p{Space}");
		List<String> tokens = new ArrayList<String>();
		for(int i = 0; i < tokenizedArray.length; ++i) {
			if(!tokenizedArray[i].isEmpty()) {
				tokens.add(tokenizedArray[i].trim().toLowerCase());
			}
		}
		return tokens;
	}
}