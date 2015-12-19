package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.Question;
import com.qapp.model.generated.QuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionMapper extends MapperRootInterface {
  int countByExample(QuestionExample example);

  int deleteByExample(QuestionExample example);

  int deleteByPrimaryKey(Long id);

  int insert(Question record);

  int insertSelective(Question record);

  List<Question> selectByExample(QuestionExample example);

  Question selectByPrimaryKey(Long id);

  int updateByExampleSelective(@Param("record") Question record,
      @Param("example") QuestionExample example);

  int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);

  int updateByPrimaryKeySelective(Question record);

  int updateByPrimaryKey(Question record);
}
