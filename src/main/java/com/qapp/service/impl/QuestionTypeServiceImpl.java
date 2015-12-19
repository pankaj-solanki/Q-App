/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.QuestionTypeMapper;
import com.qapp.model.generated.QuestionType;
import com.qapp.model.generated.QuestionTypeExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("questionTypeService")
public class QuestionTypeServiceImpl extends AbstractBaseService<QuestionType, QuestionTypeExample>
    implements IService<QuestionType, QuestionTypeExample> {

  @Autowired
  QuestionTypeMapper questionTypeMapper;

  @Override
  public MapperRootInterface getDAO() {
    return questionTypeMapper;
  }
}
