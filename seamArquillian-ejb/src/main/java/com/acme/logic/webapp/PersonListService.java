package com.acme.logic.webapp;

import javax.ejb.Local;

import com.acme.logic.framework.AbstractEntityListService;
import com.acme.model.Gender;
import com.acme.model.Person;

@Local
public interface PersonListService extends AbstractEntityListService<Person> {

	String NAME = "personListService";
	String QUERY_RESULT = "select person from Person person";

	Gender[] getGender();
}
