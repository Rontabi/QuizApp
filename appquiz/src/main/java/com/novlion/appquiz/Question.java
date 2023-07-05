package com.novlion.appquiz;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
public class Question {
    @Id
    private Integer id;
    private String question;
    private String category;
    private Integer difficulty;
    private String right_answer;
    private String wrong_answer;
    public String getAnswer() {
        return right_answer;
    }
}



