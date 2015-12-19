package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.Event;
import com.qapp.model.generated.EventExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventMapper extends MapperRootInterface {
  int countByExample(EventExample example);

  int deleteByExample(EventExample example);

  int deleteByPrimaryKey(Long id);

  int insert(Event record);

  int insertSelective(Event record);

  List<Event> selectByExample(EventExample example);

  Event selectByPrimaryKey(Long id);

  int updateByExampleSelective(@Param("record") Event record, @Param("example") EventExample example);

  int updateByExample(@Param("record") Event record, @Param("example") EventExample example);

  int updateByPrimaryKeySelective(Event record);

  int updateByPrimaryKey(Event record);
}
