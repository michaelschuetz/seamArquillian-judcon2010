package com.acme.bootstrap.testdata;

import java.util.Calendar;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;

import com.acme.model.Gender;
import com.acme.model.Person;

@Stateless
@Name(PersonTestdata.NAME)
public class PersonTestdataBean implements PersonTestdata {

	@In
	private EntityManager entityManager;

	public void insert() {
		for (int i = 1; i <= ANZAHL; i++) {
			entityManager.persist(createPerson(i));
		}
	}

	private Person createPerson(final int number) {
		final Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR ) - number);
		final Gender[] gender = Gender.values();
		final Person person = new Person("Max" + number, "Mustermann" + number,
				calendar.getTime(), gender[number % 2]);

		return person;
	}

}
