package com.acme.logic.security;

import junit.framework.Assert;

import org.junit.Test;

import com.acme.logic.security.AuthenticatorService;
import de.akquinet.jbosscc.needle.AbstractTestcase;

public class AuthenticatorServiceTest extends AbstractTestcase<AuthenticatorService>{

	@Test
	public void authenticateTest(){
		boolean authenticate = getObjectUnderTest().authenticate();

		Assert.assertTrue(authenticate);
	}


}
