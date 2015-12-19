package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.SharingEntityType;
import com.qapp.model.generated.SharingEntityTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SharingEntityTypeMapper extends MapperRootInterface {
  int countByExample(SharingEntityTypeExample example);

  int deleteByExample(SharingEntityTypeExample example);

  int deleteByPrimaryKey(Integer id);

  int insert(SharingEntityType record);

  int insertSelective(SharingEntityType record);

  List<SharingEntityType> selectByExample(SharingEntityTypeExample example);

  SharingEntityType selectByPrimaryKey(Integer id);

  int updateByExampleSelective(@Param("record") SharingEntityType record,
      @Param("example") SharingEntityTypeExample example);

  int updateByExample(@Param("record") SharingEntityType record,
      @Param("example") SharingEntityTypeExample example);

  int updateByPrimaryKeySelective(SharingEntityType record);

  int updateByPrimaryKey(SharingEntityType record);
}
