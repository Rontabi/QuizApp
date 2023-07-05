package com.novlion.appquiz.controller;

import com.novlion.appquiz.Question;
import com.novlion.appquiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QueController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions() {

        return questionService.getAllQuestions();

    }
    @GetMapping("randomQuestion")
    public Question getRandomQuestion() {

        return questionService.getRandomQuestion();

    }

}
