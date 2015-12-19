/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.UserContactMapper;
import com.qapp.model.generated.UserContact;
import com.qapp.model.generated.UserContactExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("userContactService")
public class UserContactServiceImpl extends AbstractBaseService<UserContact, UserContactExample>
    implements IService<UserContact, UserContactExample> {

  @Autowired
  UserContactMapper userContactMapper;

  @Override
  public MapperRootInterface getDAO() {
    return userContactMapper;
  }
}
