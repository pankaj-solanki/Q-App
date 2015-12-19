package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.Device;
import com.qapp.model.generated.DeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceMapper extends MapperRootInterface {
  int countByExample(DeviceExample example);

  int deleteByExample(DeviceExample example);

  int deleteByPrimaryKey(Long imei);

  int insert(Device record);

  int insertSelective(Device record);

  List<Device> selectByExample(DeviceExample example);

  Device selectByPrimaryKey(Long imei);

  int updateByExampleSelective(@Param("record") Device record,
      @Param("example") DeviceExample example);

  int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);

  int updateByPrimaryKeySelective(Device record);

  int updateByPrimaryKey(Device record);
}
