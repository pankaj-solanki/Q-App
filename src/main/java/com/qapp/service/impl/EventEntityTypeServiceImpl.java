/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.EventEntityTypeMapper;
import com.qapp.model.generated.EventEntityType;
import com.qapp.model.generated.EventEntityTypeExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("eventEntityTypeService")
public class EventEntityTypeServiceImpl extends
    AbstractBaseService<EventEntityType, EventEntityTypeExample> implements
    IService<EventEntityType, EventEntityTypeExample> {

  @Autowired
  EventEntityTypeMapper eventEntityTypeMapper;

  @Override
  public MapperRootInterface getDAO() {
    return eventEntityTypeMapper;
  }
}
