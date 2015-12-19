package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.DistributionList;
import com.qapp.model.generated.DistributionListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DistributionListMapper extends MapperRootInterface {
  int countByExample(DistributionListExample example);

  int deleteByExample(DistributionListExample example);

  int deleteByPrimaryKey(Long id);

  int insert(DistributionList record);

  int insertSelective(DistributionList record);

  List<DistributionList> selectByExample(DistributionListExample example);

  DistributionList selectByPrimaryKey(Long id);

  int updateByExampleSelective(@Param("record") DistributionList record,
      @Param("example") DistributionListExample example);

  int updateByExample(@Param("record") DistributionList record,
      @Param("example") DistributionListExample example);

  int updateByPrimaryKeySelective(DistributionList record);

  int updateByPrimaryKey(DistributionList record);
}
