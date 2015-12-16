package com.qapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author Pankaj Solanki
 */
public interface UserDAO {

  public String get(@Param("id") Long id);

  public void saveInstanceId(@Param("instanceId") String instanceId);

  public List<String> getInstanceIdList();
}
