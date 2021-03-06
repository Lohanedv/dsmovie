package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

public class ScoreDTO {
	
	
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;

  public ScoreDTO() {
	
}

public ScoreDTO(Long id, String title, Double score, Integer count, String image) {
	
	this.id = id;
	this.title = title;
	this.score = score;
	this.count = count;
	this.image = image;
}
public ScoreDTO(Movie movie) {
	
	id =movie.getId();
	title = movie.getTitle();
	score = movie.getScore();
	count = movie.getCount();
	image = movie.getImage();
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public Double getScore() {
	return score;
}

public void setScore(Double score) {
	this.score = score;
}

public Integer getCount() {
	return count;
}

public void setCount(Integer count) {
	this.count = count;
}

public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}

public Long getMovieId() {
	// TODO Auto-generated method stub
	return null;
}

public String getEmail() {
	// TODO Auto-generated method stub
	return null;
}
  
}
