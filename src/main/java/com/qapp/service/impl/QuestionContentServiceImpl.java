/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.QuestionContentMapper;
import com.qapp.model.generated.QuestionContent;
import com.qapp.model.generated.QuestionContentExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("questionContentService")
public class QuestionContentServiceImpl extends
    AbstractBaseService<QuestionContent, QuestionContentExample> implements
    IService<QuestionContent, QuestionContentExample> {

  @Autowired
  QuestionContentMapper questionContentMapper;

  @Override
  public MapperRootInterface getDAO() {
    return questionContentMapper;
  }
}
