/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.ContentTypeMapper;
import com.qapp.model.generated.ContentType;
import com.qapp.model.generated.ContentTypeExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("contentTypeService")
public class ContentTypeServiceImpl extends AbstractBaseService<ContentType, ContentTypeExample>
    implements IService<ContentType, ContentTypeExample> {

  @Autowired
  ContentTypeMapper contentTypeMapper;

  @Override
  public MapperRootInterface getDAO() {
    return contentTypeMapper;
  }
}
