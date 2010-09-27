package com.acme.model;

import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.akquinet.jbosscc.needle.db.InMemoryDatabaseUtil;

public class PersonTest {

	private InMemoryDatabaseUtil databaseUtil;

	@Before
	public void setUp() {
		databaseUtil = new InMemoryDatabaseUtil();
	}

	@Test
	public void persistPersonTest() throws Exception {

		Person person = new Person("firstname", "lastname", new Date(),
				Gender.FEMALE);

		Assert.assertNull(person.getId());

		person = databaseUtil.saveObject(person);

		Assert.assertNotNull(person.getId());

		List<Person> allPersons = databaseUtil.loadAllObjects(Person.class);

		Assert.assertEquals(1, allPersons.size());
		Assert.assertEquals(allPersons.get(0).getLastname(), person
				.getLastname());

	}

	@After
	public void tearDown(){
		databaseUtil.deleteAll();
	}

}
