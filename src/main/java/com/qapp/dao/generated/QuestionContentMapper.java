package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.QuestionContent;
import com.qapp.model.generated.QuestionContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionContentMapper extends MapperRootInterface {
  int countByExample(QuestionContentExample example);

  int deleteByExample(QuestionContentExample example);

  int deleteByPrimaryKey(Long questionId);

  int insert(QuestionContent record);

  int insertSelective(QuestionContent record);

  List<QuestionContent> selectByExampleWithBLOBs(QuestionContentExample example);

  List<QuestionContent> selectByExample(QuestionContentExample example);

  QuestionContent selectByPrimaryKey(Long questionId);

  int updateByExampleSelective(@Param("record") QuestionContent record,
      @Param("example") QuestionContentExample example);

  int updateByExampleWithBLOBs(@Param("record") QuestionContent record,
      @Param("example") QuestionContentExample example);

  int updateByExample(@Param("record") QuestionContent record,
      @Param("example") QuestionContentExample example);

  int updateByPrimaryKeySelective(QuestionContent record);

  int updateByPrimaryKeyWithBLOBs(QuestionContent record);

  int updateByPrimaryKey(QuestionContent record);
}
