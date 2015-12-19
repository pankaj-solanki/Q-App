package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.QuestionType;
import com.qapp.model.generated.QuestionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionTypeMapper extends MapperRootInterface {
  int countByExample(QuestionTypeExample example);

  int deleteByExample(QuestionTypeExample example);

  int deleteByPrimaryKey(Integer id);

  int insert(QuestionType record);

  int insertSelective(QuestionType record);

  List<QuestionType> selectByExample(QuestionTypeExample example);

  QuestionType selectByPrimaryKey(Integer id);

  int updateByExampleSelective(@Param("record") QuestionType record,
      @Param("example") QuestionTypeExample example);

  int updateByExample(@Param("record") QuestionType record,
      @Param("example") QuestionTypeExample example);

  int updateByPrimaryKeySelective(QuestionType record);

  int updateByPrimaryKey(QuestionType record);
}
