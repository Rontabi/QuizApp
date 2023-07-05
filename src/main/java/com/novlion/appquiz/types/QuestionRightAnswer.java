package com.novlion.appquiz.types;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class QuestionRightAnswer {
    @Id
    private Integer id;
    private Boolean iscorrect;
    private String right_answer;

}
