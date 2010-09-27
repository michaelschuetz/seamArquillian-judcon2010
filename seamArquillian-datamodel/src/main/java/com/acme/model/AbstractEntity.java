package com.acme.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * Class implementing the basic properties of all entities.
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final Long id = null;
	
	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	@Version
	private Date lastChange;
	
	public final Long getId() {
		return id;
	}
	
	public final Date getLastChange() {
		return lastChange;
	}
}
