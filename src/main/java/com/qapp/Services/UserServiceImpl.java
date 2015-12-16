package com.qapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserDAO userDAO;

  @Override
  public String getName(Long id) {
    String name = userDAO.get(id);
    return name;
  }

  @Override
  public void saveInstanceId(String instanceId) {
    userDAO.saveInstanceId(instanceId);
  }

  @Override
  public List<String> getInstanceIdList() {
    return userDAO.getInstanceIdList();
  }

}
