/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.SharingEntityTypeMapper;
import com.qapp.model.generated.SharingEntityType;
import com.qapp.model.generated.SharingEntityTypeExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("sharingEntityTypeService")
public class SharingEntityTypeServiceImpl extends
    AbstractBaseService<SharingEntityType, SharingEntityTypeExample> implements
    IService<SharingEntityType, SharingEntityTypeExample> {

  @Autowired
  SharingEntityTypeMapper sharingEntityTypeMapper;

  @Override
  public MapperRootInterface getDAO() {
    return sharingEntityTypeMapper;
  }
}
