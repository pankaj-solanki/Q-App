/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.FriendNetworkMapper;
import com.qapp.model.generated.FriendNetwork;
import com.qapp.model.generated.FriendNetworkExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("friendNetworkService")
public class FriendNetworkServiceImpl extends
    AbstractBaseService<FriendNetwork, FriendNetworkExample> implements
    IService<FriendNetwork, FriendNetworkExample> {

  @Autowired
  FriendNetworkMapper friendNetworkMapper;

  @Override
  public MapperRootInterface getDAO() {
    return friendNetworkMapper;
  }
}
