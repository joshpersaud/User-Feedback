package com.simplilearn.phase3hw2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.phase3hw2.model.FeedbackEntity;
import com.simplilearn.phase3hw2.repository.FeedbackRepository;

@RestController
public class FeedbackController {
	
	private static Logger logger = LoggerFactory.getLogger(FeedbackController.class);

	@Autowired
	FeedbackRepository repo;

	@GetMapping("/feedback/{id}")
	public FeedbackEntity showFeedbackById(@PathVariable Integer id) {
		logger.info("Inside showFeedbackById: file name FeedbackController.java");
		logger.info("Showing feedback for id "+ id);
		return repo.findById(id).get();
	}
	
	@PostMapping("/addfeedback")
	public FeedbackEntity addFeedback(FeedbackEntity feedback) {
		logger.info("Inside addFeedback file name FeedbackController.java");
		if(feedback.getComment() == "" || feedback.getRating()<1 || feedback.getUser() =="") {
			logger.error("feedback field cannot be null");
			throw new IllegalStateException();
		}
		
		logger.info("Saving feedback to database");
		return repo.save(feedback);
	}
}
