package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.FriendGroupMember;
import com.qapp.model.generated.FriendGroupMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendGroupMemberMapper extends MapperRootInterface {
  int countByExample(FriendGroupMemberExample example);

  int deleteByExample(FriendGroupMemberExample example);

  int deleteByPrimaryKey(Long groupId);

  int insert(FriendGroupMember record);

  int insertSelective(FriendGroupMember record);

  List<FriendGroupMember> selectByExample(FriendGroupMemberExample example);

  FriendGroupMember selectByPrimaryKey(Long groupId);

  int updateByExampleSelective(@Param("record") FriendGroupMember record,
      @Param("example") FriendGroupMemberExample example);

  int updateByExample(@Param("record") FriendGroupMember record,
      @Param("example") FriendGroupMemberExample example);

  int updateByPrimaryKeySelective(FriendGroupMember record);

  int updateByPrimaryKey(FriendGroupMember record);
}
