package com.webraa.demo.services;

import com.webraa.demo.entities.Answers;
import org.json.JSONArray;

import java.util.List;

public interface AnswersService {

    List<Answers> saveAll(JSONArray answersList);

    List<String> summaryAnswer(String username);

}
