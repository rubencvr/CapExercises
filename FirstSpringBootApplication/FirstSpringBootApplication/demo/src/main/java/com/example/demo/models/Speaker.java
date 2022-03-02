package com.example.demo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="speakers_rcv")
public class Speaker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long speaker_id;
	@Column(name = "FIRST_NAME")
	private String first_name;
	@Column(name = "LAST_NAME")
	private String last_name;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "COMPANY")
	private String company;
	@Column(name = "SPEAKER_BIO")
	private String speaker_bio;
	
	
	//@ManyToMany(mappedBy = "Speaker")
	//private List<Session> sessions;
	
	String getFirst_name() {
		return first_name;
	}

	void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	String getLast_name() {
		return last_name;
	}

	void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	String getCompany() {
		return company;
	}

	void setCompany(String company) {
		this.company = company;
	}

	String getSpeaker_bio() {
		return speaker_bio;
	}

	void setSpeaker_bio(String speaker_bio) {
		this.speaker_bio = speaker_bio;
	}

	public Speaker() {}

	/*public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

*/

}
