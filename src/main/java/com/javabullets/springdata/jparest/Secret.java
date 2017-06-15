package com.javabullets.springdata.jparest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties({"mySecret"})
@Entity
public class Secret {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	//@JsonIgnore
	private String mySecret;
		
	public String getMySecret() {
		return mySecret;
	}
	public void setMySecret(String mySecret) {
		this.mySecret = mySecret;
	}
}