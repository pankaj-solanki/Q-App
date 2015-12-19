package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.AnswerContent;
import com.qapp.model.generated.AnswerContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerContentMapper extends MapperRootInterface {
  int countByExample(AnswerContentExample example);

  int deleteByExample(AnswerContentExample example);

  int deleteByPrimaryKey(Long answerId);

  int insert(AnswerContent record);

  int insertSelective(AnswerContent record);

  List<AnswerContent> selectByExampleWithBLOBs(AnswerContentExample example);

  List<AnswerContent> selectByExample(AnswerContentExample example);

  AnswerContent selectByPrimaryKey(Long answerId);

  int updateByExampleSelective(@Param("record") AnswerContent record,
      @Param("example") AnswerContentExample example);

  int updateByExampleWithBLOBs(@Param("record") AnswerContent record,
      @Param("example") AnswerContentExample example);

  int updateByExample(@Param("record") AnswerContent record,
      @Param("example") AnswerContentExample example);

  int updateByPrimaryKeySelective(AnswerContent record);

  int updateByPrimaryKeyWithBLOBs(AnswerContent record);

  int updateByPrimaryKey(AnswerContent record);
}
