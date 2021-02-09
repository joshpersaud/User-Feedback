package com.simplilearn.phase3hw2.repository;

import org.springframework.data.repository.CrudRepository;

import com.simplilearn.phase3hw2.model.FeedbackEntity;

public interface FeedbackRepository extends CrudRepository<FeedbackEntity, Integer> {
}
