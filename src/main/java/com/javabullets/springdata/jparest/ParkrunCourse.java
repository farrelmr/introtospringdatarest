package com.javabullets.springdata.jparest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ParkrunCourse {
	@Id
	@GeneratedValue
	private Long id;
	
	private String courseName;
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