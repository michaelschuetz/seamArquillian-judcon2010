package com.acme.it;

import com.acme.it.util.AbstractSeamItTest;
import com.acme.logic.security.AuthenticatorService;
import org.jboss.arquillian.api.Deployment;
import org.jboss.seam.security.Credentials;
import org.jboss.seam.security.Identity;
import org.jboss.shrinkwrap.api.Archive;
import org.junit.Test;

import static com.acme.it.util.SeamUtil.getInstance;
import static com.acme.it.util.SeamUtil.initializeSeam;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Accesssing Seam components directly.
 * 
 * @author <a href="mailto:michaelschuetz83@gmail.com">Michael Schuetz</a>
 */
public class LogInTest extends AbstractSeamItTest {
    private static final String LOGIN_NAME = "Tim";

    @Deployment
    public static Archive<?> getDeployment() {
        return getTestArchive(LogInTest.class, AuthenticatorService.class);
    }

    @Test
    public void testLogIn() {

        initializeSeam();

        Credentials credentials = (Credentials) getInstance(Credentials.class);
        Identity identity = (Identity) getInstance(Identity.class);

        assertFalse(identity.isLoggedIn());
        credentials.setUsername(LOGIN_NAME);

        identity.login();

        assertEquals(LOGIN_NAME, credentials.getUsername());
        assertTrue(identity.isLoggedIn());
    }
}
