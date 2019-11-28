package com.dario.demo.model;

public class CommentText {

	private String value;
    private String matchLevel;
    private Boolean fullyHighlighted;
    private String[] matchedWords;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getMatchLevel() {
		return matchLevel;
	}
	public void setMatchLevel(String matchLevel) {
		this.matchLevel = matchLevel;
	}
	public Boolean getFullyHighlighted() {
		return fullyHighlighted;
	}
	public void setFullyHighlighted(Boolean fullyHighlighted) {
		this.fullyHighlighted = fullyHighlighted;
	}
	public String[] getMatchedWords() {
		return matchedWords;
	}
	public void setMatchedWords(String[] matchedWords) {
		this.matchedWords = matchedWords;
	}
    
    
}
