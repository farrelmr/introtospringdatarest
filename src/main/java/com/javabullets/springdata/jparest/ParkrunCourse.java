package com.javabullets.springdata.jparest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ParkrunCourse {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String courseName;
	
	@JsonIgnore
	private String url;
	private Long averageTime;
		
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Long getAverageTime() {
		return averageTime;
	}
	public void setAverageTime(Long averageTime) {
		this.averageTime = averageTime;
	}
}