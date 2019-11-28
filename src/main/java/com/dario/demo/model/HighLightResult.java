package com.dario.demo.model;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HighLightResult {

	@Id
	private Integer id;
	private Author author;
	@JsonProperty("comment_text")
	private CommentText commentText;
	@JsonProperty("story_title")
	private StoryTitle storyTitle;
	@JsonProperty("story_url")
	private StoryTitle storyUrl;
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public CommentText getCommentText() {
		return commentText;
	}
	public void setCommentText(CommentText commentText) {
		this.commentText = commentText;
	}
	public StoryTitle getStoryTitle() {
		return storyTitle;
	}
	public void setStoryTitle(StoryTitle storyTitle) {
		this.storyTitle = storyTitle;
	}
	public StoryTitle getStoryUrl() {
		return storyUrl;
	}
	public void setStoryUrl(StoryTitle storyUrl) {
		this.storyUrl = storyUrl;
	}
	
	
}
