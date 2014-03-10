package hw1;

import java.util.ArrayList;
import java.util.List;

public class Index {
	
	private List<Long> files;

	public Index() {
		super();
		this.files = new ArrayList<Long>();
	}
	
	public Index(Long fileIndex) {
		super();
		this.files = new ArrayList<Long>();
		files.add(fileIndex);
	}

	/**
	 * @return the frequency
	 */
	public int getFrequency() {
		return files.size();
	}

	/**
	 * @return the files
	 */
	public List<Long> getFiles() {
		return files;
	}

	/**
	 * @param files the files to set
	 */
	public void setFiles(List<Long> files) {
		this.files = files;
	}
}
