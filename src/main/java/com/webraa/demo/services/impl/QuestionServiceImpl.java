package com.webraa.demo.services.impl;

import com.webraa.demo.entities.Questions;
import com.webraa.demo.repositories.QuestionRepository;
import com.webraa.demo.services.QuestionService;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    @Override
    public List<Questions> findAll() {
        return questionRepository.findAll();
    }
}
