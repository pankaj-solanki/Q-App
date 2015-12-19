/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.DistributionListMapper;
import com.qapp.model.generated.DistributionList;
import com.qapp.model.generated.DistributionListExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("distributionListService")
public class DistributionListServiceImpl extends
    AbstractBaseService<DistributionList, DistributionListExample> implements
    IService<DistributionList, DistributionListExample> {

  @Autowired
  DistributionListMapper distributionListMapper;

  @Override
  public MapperRootInterface getDAO() {
    return distributionListMapper;
  }
}
