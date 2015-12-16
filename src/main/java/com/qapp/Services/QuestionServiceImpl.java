package com.qapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.Question;
import com.qapp.dao.QuestionDAO;

@Service
public class QuestionServiceImpl implements QuestionService {

  @Autowired
  QuestionDAO questionDAO;

  @Override
  public List<Question> getQuestions() {
    return questionDAO.getQuestionList();
  }

}
