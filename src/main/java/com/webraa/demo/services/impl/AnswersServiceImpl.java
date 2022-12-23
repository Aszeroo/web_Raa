package com.webraa.demo.services.impl;

import com.webraa.demo.entities.Answers;
import com.webraa.demo.repositories.AnswersRepository;
import com.webraa.demo.services.AnswersService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AnswersServiceImpl implements AnswersService {

    @Autowired
    AnswersRepository answersRepository;

    @Override
    public List<Answers> saveAll(JSONArray answersList) {
        Answers saveAnswer = new Answers();
        List<Answers> answers = new ArrayList<>();

        for (Object o : answersList) {
            JSONObject object = new JSONObject(o.toString());
            saveAnswer.setAnswerId(UUID.randomUUID().toString());
            saveAnswer.setQuestionId(object.getString("question_id"));
            saveAnswer.setAnswer(object.getString("answer"));
            saveAnswer.setAnswerStatus(object.getString("answer_status"));
            saveAnswer.setCreateBy(object.getString("create_by"));
            saveAnswer.setCreateDate(new Date());
            answers.add(saveAnswer);

            saveAnswer = new Answers();
        }

        return (List<Answers>) answersRepository.saveAll(answers);
    }

    @Override
    public JSONArray summaryAnswer(String username) {
        List<String> summation = answersRepository.summaryAnswer(username);

        JSONArray sumArray = new JSONArray();
        JSONObject subSum = new JSONObject();

        for (String s : summation) {
            List<String> detail = Arrays.asList(s.split(","));
            subSum.put("topic_id", detail.get(0)).put("yes", detail.get(1)).put("no", detail.get(2));
            sumArray.put(subSum);
            subSum = new JSONObject();
        }

        return sumArray;
    }
}
