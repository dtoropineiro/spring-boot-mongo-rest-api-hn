package com.dario.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hits {
	
	
    @Transient
    public static final String SEQUENCE_NAME = "sequence";
    @Id
    private Long id;
	private String created_at;
	private String title;
	private String url;
	private String author;
	private String points;
	private String story_text;
	private String comment_text;
	private String num_comments;
	private Integer story_id;
	private String story_title;
	private String story_url;
	private Integer parent_id;
	private Integer created_at_i;
	@JsonProperty("_tags")
	private String[] tags;
	private String objectID;
	private HighLightResult _highlightResult;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPoints() {
		return points;
	}
	public void setPoints(String points) {
		this.points = points;
	}
	public String getStory_text() {
		return story_text;
	}
	public void setStory_text(String story_text) {
		this.story_text = story_text;
	}
	public String getComment_text() {
		return comment_text;
	}
	public void setComment_text(String comment_text) {
		this.comment_text = comment_text;
	}
	public String getNum_comments() {
		return num_comments;
	}
	public void setNum_comments(String num_comments) {
		this.num_comments = num_comments;
	}
	public Integer getStory_id() {
		return story_id;
	}
	public void setStory_id(Integer story_id) {
		this.story_id = story_id;
	}
	public String getStory_title() {
		return story_title;
	}
	public void setStory_title(String story_title) {
		this.story_title = story_title;
	}
	public String getStory_url() {
		return story_url;
	}
	public void setStory_url(String story_url) {
		this.story_url = story_url;
	}
	public Integer getParent_id() {
		return parent_id;
	}
	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}
	public Integer getCreated_at_i() {
		return created_at_i;
	}
	public void setCreated_at_i(Integer created_at_i) {
		this.created_at_i = created_at_i;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public String getObjectID() {
		return objectID;
	}
	public void setObjectID(String objectID) {
		this.objectID = objectID;
	}
	public HighLightResult get_highlightResult() {
		return _highlightResult;
	}
	public void set_highlightResult(HighLightResult _highlightResult) {
		this._highlightResult = _highlightResult;
	}
	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
	
	
}
