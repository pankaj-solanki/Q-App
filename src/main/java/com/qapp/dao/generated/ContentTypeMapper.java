package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.ContentType;
import com.qapp.model.generated.ContentTypeExample;
import com.qapp.model.generated.ContentTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentTypeMapper extends MapperRootInterface {
  int countByExample(ContentTypeExample example);

  int deleteByExample(ContentTypeExample example);

  int deleteByPrimaryKey(ContentTypeKey key);

  int insert(ContentType record);

  int insertSelective(ContentType record);

  List<ContentType> selectByExample(ContentTypeExample example);

  ContentType selectByPrimaryKey(ContentTypeKey key);

  int updateByExampleSelective(@Param("record") ContentType record,
      @Param("example") ContentTypeExample example);

  int updateByExample(@Param("record") ContentType record,
      @Param("example") ContentTypeExample example);

  int updateByPrimaryKeySelective(ContentType record);

  int updateByPrimaryKey(ContentType record);
}
