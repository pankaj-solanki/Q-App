/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.QuestionSharingMapper;
import com.qapp.model.generated.QuestionSharing;
import com.qapp.model.generated.QuestionSharingExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("questionSharingService")
public class QuestionSharingServiceImpl extends
    AbstractBaseService<QuestionSharing, QuestionSharingExample> implements
    IService<QuestionSharing, QuestionSharingExample> {

  @Autowired
  QuestionSharingMapper questionSharingMapper;

  @Override
  public MapperRootInterface getDAO() {
    return questionSharingMapper;
  }
}
