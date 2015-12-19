/**
 * 
 */
package com.qapp.service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.ServiceResponse;

/**
 * @author Pankaj Solanki
 */
public interface IService<RECORD, RECORDEXAMPLE> {

  public MapperRootInterface getDAO();

  public ServiceResponse add(RECORD record);

  public ServiceResponse addSelective(RECORD record);

  public ServiceResponse deleteByPrimaryKey(Long id);

  public ServiceResponse deleteByExample(RECORDEXAMPLE example);

  public ServiceResponse getByExample(RECORDEXAMPLE example);

  public ServiceResponse getByPrimaryKey(Long id);

  public ServiceResponse updateByExampleSelective(RECORD record, RECORDEXAMPLE example);

  public ServiceResponse updateByExample(RECORD record, RECORDEXAMPLE example);

  public ServiceResponse updateByPrimaryKeySelective(RECORD record);

  public ServiceResponse updateByPrimaryKey(RECORD record);

}
