/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.DeviceMapper;
import com.qapp.model.generated.Device;
import com.qapp.model.generated.DeviceExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("deviceService")
public class DeviceServiceImpl extends AbstractBaseService<Device, DeviceExample> implements
    IService<Device, DeviceExample> {

  @Autowired
  DeviceMapper deviceMapper;

  @Override
  public MapperRootInterface getDAO() {
    return deviceMapper;
  }
}
