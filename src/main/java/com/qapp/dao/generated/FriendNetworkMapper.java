package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.FriendNetwork;
import com.qapp.model.generated.FriendNetworkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendNetworkMapper extends MapperRootInterface {
  int countByExample(FriendNetworkExample example);

  int deleteByExample(FriendNetworkExample example);

  int deleteByPrimaryKey(Long id);

  int insert(FriendNetwork record);

  int insertSelective(FriendNetwork record);

  List<FriendNetwork> selectByExample(FriendNetworkExample example);

  FriendNetwork selectByPrimaryKey(Long id);

  int updateByExampleSelective(@Param("record") FriendNetwork record,
      @Param("example") FriendNetworkExample example);

  int updateByExample(@Param("record") FriendNetwork record,
      @Param("example") FriendNetworkExample example);

  int updateByPrimaryKeySelective(FriendNetwork record);

  int updateByPrimaryKey(FriendNetwork record);
}
