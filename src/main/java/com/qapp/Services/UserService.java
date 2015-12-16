package com.qapp.Services;

import java.util.List;

public interface UserService {
  public String getName(Long id);

  public void saveInstanceId(String instanceId);

  public List<String> getInstanceIdList();

}
