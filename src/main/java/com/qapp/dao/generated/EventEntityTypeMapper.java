package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.EventEntityType;
import com.qapp.model.generated.EventEntityTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventEntityTypeMapper extends MapperRootInterface {
  int countByExample(EventEntityTypeExample example);

  int deleteByExample(EventEntityTypeExample example);

  int deleteByPrimaryKey(Integer id);

  int insert(EventEntityType record);

  int insertSelective(EventEntityType record);

  List<EventEntityType> selectByExample(EventEntityTypeExample example);

  EventEntityType selectByPrimaryKey(Integer id);

  int updateByExampleSelective(@Param("record") EventEntityType record,
      @Param("example") EventEntityTypeExample example);

  int updateByExample(@Param("record") EventEntityType record,
      @Param("example") EventEntityTypeExample example);

  int updateByPrimaryKeySelective(EventEntityType record);

  int updateByPrimaryKey(EventEntityType record);
}
