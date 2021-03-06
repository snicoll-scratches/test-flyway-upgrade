package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Speaker implements java.io.Serializable {

	@GeneratedValue
	@Id
	private Long id;

	private String firstName;

	private String lastName;

	private String twitter;

	private String github;

	@Column(columnDefinition = "TEXT")
	@Lob
	private String bio;

	public Speaker() {
	}

	public Speaker(String firstName, String lastName, String twitter, String github) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.twitter = twitter;
		this.github = github;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getGithub() {
		return this.github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	@Override
	public String toString() {
		return "Speaker{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
	}

}
