/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.UserStatusMapper;
import com.qapp.model.generated.UserStatus;
import com.qapp.model.generated.UserStatusExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("userStatusService")
public class UserStatusServiceImpl extends AbstractBaseService<UserStatus, UserStatusExample>
    implements IService<UserStatus, UserStatusExample> {

  @Autowired
  UserStatusMapper userStatusMapper;

  @Override
  public MapperRootInterface getDAO() {
    return userStatusMapper;
  }
}
