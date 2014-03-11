package hw1;

import java.util.ArrayList;
import java.util.List;

public class IndexSearchEngine {

	private final List<List<Long>> inputList;

	public IndexSearchEngine(List<List<Long>> inputList) {
		super();
		this.inputList = inputList;
	}

	public List<List<Long>> getInputList() {
		return inputList;
	}
	
	public List<Long> search() {
		List<Long> result = new ArrayList<Long>();
		List<Long> targetList = findShortestQueue();
		
OUTTER:	for(Long docId : targetList) {
			for(int i = 0; i < this.inputList.size(); ++i) {
				if(!this.inputList.get(i).contains(docId)) {
					continue OUTTER;
				}
			}
			result.add(docId);
		}
		
		return result;
	}
	
	private List<Long> findShortestQueue() {
		List<Long> shortestQueue = new ArrayList<Long>();
		int minSize = Integer.MAX_VALUE;
		
		for(int i = 0; i < this.inputList.size(); ++i) {
			if(inputList.get(i).size() < minSize) {
				shortestQueue = inputList.get(i);
				minSize = inputList.get(i).size();
			}
		}
		
		return shortestQueue;
	}
}
