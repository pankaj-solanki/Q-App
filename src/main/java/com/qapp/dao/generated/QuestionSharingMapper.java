package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.QuestionSharing;
import com.qapp.model.generated.QuestionSharingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionSharingMapper extends MapperRootInterface {
  int countByExample(QuestionSharingExample example);

  int deleteByExample(QuestionSharingExample example);

  int deleteByPrimaryKey(Long id);

  int insert(QuestionSharing record);

  int insertSelective(QuestionSharing record);

  List<QuestionSharing> selectByExample(QuestionSharingExample example);

  QuestionSharing selectByPrimaryKey(Long id);

  int updateByExampleSelective(@Param("record") QuestionSharing record,
      @Param("example") QuestionSharingExample example);

  int updateByExample(@Param("record") QuestionSharing record,
      @Param("example") QuestionSharingExample example);

  int updateByPrimaryKeySelective(QuestionSharing record);

  int updateByPrimaryKey(QuestionSharing record);
}
