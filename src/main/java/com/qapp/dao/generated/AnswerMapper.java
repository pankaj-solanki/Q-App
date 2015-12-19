package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.Answer;
import com.qapp.model.generated.AnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerMapper extends MapperRootInterface {
  int countByExample(AnswerExample example);

  int deleteByExample(AnswerExample example);

  int deleteByPrimaryKey(Long id);

  int insert(Answer record);

  int insertSelective(Answer record);

  List<Answer> selectByExample(AnswerExample example);

  Answer selectByPrimaryKey(Long id);

  int updateByExampleSelective(@Param("record") Answer record,
      @Param("example") AnswerExample example);

  int updateByExample(@Param("record") Answer record, @Param("example") AnswerExample example);

  int updateByPrimaryKeySelective(Answer record);

  int updateByPrimaryKey(Answer record);
}
