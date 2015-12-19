/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.QuestionMapper;
import com.qapp.model.generated.Question;
import com.qapp.model.generated.QuestionExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("questionService")
public class QuestionServiceImpl extends AbstractBaseService<Question, QuestionExample> implements
    IService<Question, QuestionExample> {

  @Autowired
  QuestionMapper questionMapper;

  @Override
  public MapperRootInterface getDAO() {
    return questionMapper;
  }
}
