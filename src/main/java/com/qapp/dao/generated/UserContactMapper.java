package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.UserContact;
import com.qapp.model.generated.UserContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserContactMapper extends MapperRootInterface {
  int countByExample(UserContactExample example);

  int deleteByExample(UserContactExample example);

  int deleteByPrimaryKey(Long id);

  int insert(UserContact record);

  int insertSelective(UserContact record);

  List<UserContact> selectByExample(UserContactExample example);

  UserContact selectByPrimaryKey(Long id);

  int updateByExampleSelective(@Param("record") UserContact record,
      @Param("example") UserContactExample example);

  int updateByExample(@Param("record") UserContact record,
      @Param("example") UserContactExample example);

  int updateByPrimaryKeySelective(UserContact record);

  int updateByPrimaryKey(UserContact record);
}
