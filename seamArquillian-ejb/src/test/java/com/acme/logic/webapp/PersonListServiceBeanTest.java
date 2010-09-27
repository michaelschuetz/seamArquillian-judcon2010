package com.acme.logic.webapp;

import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.acme.model.Gender;
import com.acme.model.Person;
import de.akquinet.jbosscc.needle.AbstractTestcase;

public class PersonListServiceBeanTest extends AbstractTestcase<PersonListServiceBean>{


	@Test
	public void getResultListTest() throws Exception{
		List<Person> resultList = getObjectUnderTest().getResultList();
		Assert.assertTrue(resultList.isEmpty());

		createPersons();

		getObjectUnderTest().refresh();

		resultList = getObjectUnderTest().getResultList();
		Assert.assertEquals(10, resultList.size());

	}


	private void createPersons() throws Exception{
		for(int i=0; i<10; i++){
			Person person = new Person("firstname" +i, "lastname" +i, new Date(), Gender.FEMALE);
			getDatabaseUtil().saveObject(person);
		}
	}
}
