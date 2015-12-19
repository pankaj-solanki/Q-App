/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.UserMapper;
import com.qapp.model.generated.User;
import com.qapp.model.generated.UserExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("userService")
public class UserServiceImpl extends AbstractBaseService<User, UserExample> implements
    IService<User, UserExample> {

  @Autowired
  UserMapper userMapper;

  @Override
  public MapperRootInterface getDAO() {
    return userMapper;
  }
}
