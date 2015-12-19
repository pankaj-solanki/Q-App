/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.AnswerContentMapper;
import com.qapp.model.generated.AnswerContent;
import com.qapp.model.generated.AnswerContentExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("answerContentService")
public class AnswerContentServiceImpl extends
    AbstractBaseService<AnswerContent, AnswerContentExample> implements
    IService<AnswerContent, AnswerContentExample> {

  @Autowired
  AnswerContentMapper answerContentMapper;

  @Override
  public MapperRootInterface getDAO() {
    return answerContentMapper;
  }
}
