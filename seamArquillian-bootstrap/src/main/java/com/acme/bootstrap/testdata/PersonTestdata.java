package com.acme.bootstrap.testdata;

import javax.ejb.Local;

@Local
public interface PersonTestdata {
	String NAME = "PersonTestdata";
	int ANZAHL = 64;

	void insert();
}
