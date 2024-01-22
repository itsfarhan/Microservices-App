package com.farhan.quizservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farhan.quizservice.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
