package com.acme.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.NotNull;
import org.jboss.seam.annotations.Name;

import com.acme.model.Gender;

@Entity
@Name("person")
public class Person extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Column(nullable = false)
	private String firstname;
	
	@NotNull
	@Column(nullable = false)
	private String lastname;
	
	@NotNull
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date birthday;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Gender gender;
	
	//required for jpa
	public Person(){
		super();
	}
	
	public Person(String firstname, String lastname, Date birthday, Gender gender) {
		this();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
		this.gender = gender;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String toString() {

		StringBuilder values = new StringBuilder();
		values.append("firstname = " + firstname);
		values.append("lastname = " + lastname);

		return values.toString();
	}

}
