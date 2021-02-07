package com.simplilearn.phase3hw2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "feedback")
@Entity
public class FeedbackEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "rating")
	int rating;
	
	@Column(name = "user")
	String user;
	
	@Column(name = "comment")
	String comment;

}
