package com.acme.logic.model;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;

import junit.framework.Assert;

import org.junit.Test;

import com.acme.model.Gender;
import com.acme.model.Person;
import de.akquinet.jbosscc.needle.AbstractTestcase;
import de.akquinet.jbosscc.needle.db.InMemoryDatabaseUtil;

public class PersonServiceBeanTest extends AbstractTestcase<PersonServiceBean> {

	@Test
	public void findTest() throws Exception {
		Person person = getDatabaseUtil().saveObject(createPerson());
		Person find = getObjectUnderTest().find(person.getId());
		Assert.assertEquals(person.getId(), find.getId());
	}

	@Test
	public void deleteTest() throws Exception {
		final Person person = createPerson();

		getDatabaseUtil().executeInTransaction(
				new InMemoryDatabaseUtil.VoidRunnable() {

					@Override
					public void doRun(EntityManager entityManager)
							throws Exception {
						getObjectUnderTest().saveOrUpdate(person);
						getObjectUnderTest().delete(person);

					}
				});

		Assert.assertNull(getObjectUnderTest().find(person.getId()));
	}

	@Test
	public void saveTest() throws Exception {

		getDatabaseUtil().executeInTransaction(
				new InMemoryDatabaseUtil.VoidRunnable() {

					@Override
					public void doRun(EntityManager entityManager)
							throws Exception {

						Person person = createPerson();
						getObjectUnderTest().saveOrUpdate(person);
						Person find = getObjectUnderTest().find(person.getId());
						Assert.assertEquals(person.getId(), find.getId());

					}
				});

	}

	@Test
	public void updateTest() throws Exception {
		this.getDatabaseUtil().getEntityManager().setFlushMode(
				FlushModeType.AUTO);

		final Person person = createPerson();
		final String firstname = "newfirstname";

		getDatabaseUtil().executeInTransaction(
				new InMemoryDatabaseUtil.VoidRunnable() {

					@Override
					public void doRun(EntityManager entityManager)
							throws Exception {
						getObjectUnderTest().saveOrUpdate(person);
						person.setFirstname(firstname);
						getObjectUnderTest().saveOrUpdate(person);

					}
				});

		Person find = getObjectUnderTest().find(person.getId());
		Assert.assertEquals(firstname, find.getFirstname());
	}

	private Person createPerson() {
		return new Person("firstname", "lastname", new Date(), Gender.FEMALE);
	}

}
