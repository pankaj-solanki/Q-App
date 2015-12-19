package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.FriendGroup;
import com.qapp.model.generated.FriendGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendGroupMapper extends MapperRootInterface {
  int countByExample(FriendGroupExample example);

  int deleteByExample(FriendGroupExample example);

  int deleteByPrimaryKey(Long id);

  int insert(FriendGroup record);

  int insertSelective(FriendGroup record);

  List<FriendGroup> selectByExample(FriendGroupExample example);

  FriendGroup selectByPrimaryKey(Long id);

  int updateByExampleSelective(@Param("record") FriendGroup record,
      @Param("example") FriendGroupExample example);

  int updateByExample(@Param("record") FriendGroup record,
      @Param("example") FriendGroupExample example);

  int updateByPrimaryKeySelective(FriendGroup record);

  int updateByPrimaryKey(FriendGroup record);
}
