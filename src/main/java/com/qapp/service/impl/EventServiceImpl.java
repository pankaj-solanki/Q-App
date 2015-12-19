/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.EventMapper;
import com.qapp.model.generated.Event;
import com.qapp.model.generated.EventExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("eventService")
public class EventServiceImpl extends AbstractBaseService<Event, EventExample> implements
    IService<Event, EventExample> {

  @Autowired
  EventMapper eventMapper;

  @Override
  public MapperRootInterface getDAO() {
    return eventMapper;
  }
}
