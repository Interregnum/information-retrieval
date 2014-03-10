package hw1;

import java.util.List;

public class IndexBuilder {
	
	private IndexBuilder() {
		super();
	}

	public static void buildIndexByFile(List<String> tokens, String filePath) {
		Long fileIndex = 0L;
		
		if(Run.fileIndexMap.containsKey(filePath)) {
			fileIndex = Long.parseLong(Run.fileIndexMap.get(filePath));
		
			for(String token : tokens) {
				if(Run.index.containsKey(token)) {
					Run.index.get(token).getFiles().add(fileIndex);
				}
				else {
					Run.index.put(token, new Index(fileIndex));
				}
			}
		}
	}
}
