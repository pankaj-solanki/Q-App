/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.AnswerMapper;
import com.qapp.model.generated.Answer;
import com.qapp.model.generated.AnswerExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("answerService")
public class AnswerServiceImpl extends AbstractBaseService<Answer, AnswerExample> implements
    IService<Answer, AnswerExample> {

  @Autowired
  AnswerMapper answerMapper;

  @Override
  public MapperRootInterface getDAO() {
    return answerMapper;
  }
}
