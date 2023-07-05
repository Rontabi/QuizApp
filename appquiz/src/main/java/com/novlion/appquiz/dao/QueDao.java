package com.novlion.appquiz.dao;

import com.novlion.appquiz.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueDao extends JpaRepository<Question, Integer> {

}
