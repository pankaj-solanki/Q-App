/**
 * 
 */
package com.qapp.service;

import java.util.List;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.ModelRootClass;
import com.qapp.model.ServiceResponse;

/**
 * @author Pankaj Solanki
 */
public abstract class AbstractBaseService<RECORD extends ModelRootClass, RECORDEXAMPLE> implements
    IService<RECORD, RECORDEXAMPLE> {

  @Override
  public abstract MapperRootInterface getDAO();

  @Override
  public ServiceResponse add(RECORD record) {
    getDAO().insert(record);
    return new ServiceResponse(true, record);
  }

  @Override
  public ServiceResponse addSelective(RECORD record) {
    getDAO().insertSelective(record);
    return new ServiceResponse(true, record);
  }

  @Override
  public ServiceResponse deleteByPrimaryKey(Long id) {
    getDAO().deleteByPrimaryKey(id);
    return new ServiceResponse(true, null);
  }

  @Override
  public ServiceResponse deleteByExample(RECORDEXAMPLE example) {
    getDAO().deleteByExample(example);
    return new ServiceResponse(true, null);
  }

  @Override
  public ServiceResponse getByExample(RECORDEXAMPLE example) {
    List<? extends ModelRootClass> results = getDAO().selectByExample(example);
    return new ServiceResponse(true, results);
  }

  @Override
  public ServiceResponse getByPrimaryKey(Long id) {
    ModelRootClass record = getDAO().selectByPrimaryKey(id);
    return new ServiceResponse(true, record);
  }

  @Override
  public ServiceResponse updateByExampleSelective(RECORD record, RECORDEXAMPLE example) {
    getDAO().updateByExampleSelective(record, example);
    return new ServiceResponse(true, null);
  }

  @Override
  public ServiceResponse updateByExample(RECORD record, RECORDEXAMPLE example) {
    getDAO().updateByExample(record, example);
    return new ServiceResponse(true, null);
  }

  @Override
  public ServiceResponse updateByPrimaryKeySelective(RECORD record) {
    getDAO().updateByPrimaryKeySelective(record);
    return new ServiceResponse(true, null);
  }

  @Override
  public ServiceResponse updateByPrimaryKey(RECORD record) {
    getDAO().updateByPrimaryKey(record);
    return new ServiceResponse(true, null);
  }
}
