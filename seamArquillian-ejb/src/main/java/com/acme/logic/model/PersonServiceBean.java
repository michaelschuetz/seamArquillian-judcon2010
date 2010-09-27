package com.acme.logic.model;

import javax.ejb.Stateless;

import org.jboss.seam.annotations.Name;

import com.acme.logic.framework.AbstractEntityServiceBean;
import com.acme.model.Person;

@Stateless
@Name(PersonService.NAME)
public class PersonServiceBean extends AbstractEntityServiceBean<Person>
		implements PersonService {
}
