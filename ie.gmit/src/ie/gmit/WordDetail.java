/*
 * Keith Williams (G00324844)
 * 18/03/2016
 */

package ie.gmit;

import java.util.*;

public class WordDetail {
	private String definition = "undefined";
	private Set<Integer> pages = new TreeSet<Integer>();
	
	public WordDetail() { }
	
	public WordDetail(String definition) {
		this.definition = definition;
	}
	
	public WordDetail(int page) {
		addIndex (page);
	}
	
	public String getDefinition () {
		return definition;
	}
	
	public void setDefinition (String definition) {
		this.definition = definition;
	}
	
	public void addIndex(int page) {
		pages.add(page);
	}
	
	public Set<Integer> getIndices() {
		return pages;
	}
	
	public String toString() {
		StringBuilder details = new StringBuilder(definition);
		
		details.append("\nPages:");
		
		for (int page : pages) {
			details.append(" " + page);
		}
		
		return details.toString();
	}
}
