/**
 * 
 */
package com.qapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qapp.dao.MapperRootInterface;
import com.qapp.dao.generated.TemplateMapper;
import com.qapp.model.generated.Template;
import com.qapp.model.generated.TemplateExample;
import com.qapp.service.AbstractBaseService;
import com.qapp.service.IService;

/**
 * @author Pankaj Solanki
 */
@Service("templateService")
public class TemplateServiceImpl extends AbstractBaseService<Template, TemplateExample>
		implements IService<Template, TemplateExample> {

	@Autowired
	TemplateMapper templateMapper;

	@Override
	public MapperRootInterface getDAO() {
		return templateMapper;
	}
}
