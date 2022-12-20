package com.webraa.demo.services;

import com.webraa.demo.entities.Questions;
import com.webraa.demo.entities.User;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.json.JSONObject;

import java.util.List;
import java.util.Optional;

public interface QuestionService {


    List<Questions> findAll();
}
