/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.FriendGroupMemberMapper;
import com.qapp.model.generated.FriendGroupMember;
import com.qapp.model.generated.FriendGroupMemberExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("friendGroupMemberService")
public class FriendGroupMemberServiceImpl extends
    AbstractBaseService<FriendGroupMember, FriendGroupMemberExample> implements
    IService<FriendGroupMember, FriendGroupMemberExample> {

  @Autowired
  FriendGroupMemberMapper friendGroupMemberMapper;

  @Override
  public MapperRootInterface getDAO() {
    return friendGroupMemberMapper;
  }
}
