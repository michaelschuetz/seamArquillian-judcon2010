package com.acme.logic.model;

import javax.ejb.Local;

import com.acme.logic.framework.AbstractEntityService;
import com.acme.model.Person;

@Local
public interface PersonService extends AbstractEntityService<Person>{
	String NAME = "personService";
}