package com.novlion.appquiz.service;

import com.novlion.appquiz.Question;
import com.novlion.appquiz.dao.QueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuestionService {
    @Autowired
    QueDao queDao;


    public List<Question> getAllQuestions() {
        return queDao.findAll();
    }
    public Question getRandomQuestion() {
        List<Question> allQuestions = queDao.findAll();
        int randomIndex = new Random().nextInt(allQuestions.size());
        return allQuestions.get(randomIndex);
    }

    public boolean checkAnswer(Integer questionId, String answer) {
        // Получите вопрос из базы данных по идентификатору
        Question question = queDao.findById(questionId).orElse(null);

        // Проверьте ответ на вопрос
        if (question != null && question.getAnswer().equals(answer)) {
            return true;
        } else {
            return false;
        }
    }
}