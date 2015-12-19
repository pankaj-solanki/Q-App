/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.FriendGroupMapper;
import com.qapp.model.generated.FriendGroup;
import com.qapp.model.generated.FriendGroupExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("friendGroupService")
public class FriendGroupServiceImpl extends AbstractBaseService<FriendGroup, FriendGroupExample>
    implements IService<FriendGroup, FriendGroupExample> {

  @Autowired
  FriendGroupMapper friendGroupMapper;

  @Override
  public MapperRootInterface getDAO() {
    return friendGroupMapper;
  }
}
