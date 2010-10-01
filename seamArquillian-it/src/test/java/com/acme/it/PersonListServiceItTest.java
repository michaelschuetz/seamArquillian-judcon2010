package com.acme.it;

import static junit.framework.Assert.assertEquals;

import java.util.List;

import javax.ejb.EJB;

import com.acme.it.util.AbstractSeamItTest;
import com.acme.logic.webapp.PersonListService;
import com.acme.logic.webapp.PersonListServiceBean;
import com.acme.model.Gender;
import com.acme.model.Person;
import org.jboss.arquillian.api.Deployment;
import org.jboss.seam.Component;
import org.jboss.seam.deployment.ComponentsXmlDeploymentHandler;
import org.jboss.seam.security.Credentials;
import org.jboss.shrinkwrap.api.Archive;
import org.junit.Test;

/**
 * Integration test for handling person.
 *
 * @author <a href="mailto:michaelschuetz83@gmail.com">Michael Schuetz</a>
 */
public class PersonListServiceItTest extends AbstractSeamItTest {

    @EJB
    private PersonListService personListService;

    @Deployment
    public static Archive<?> getDeployment() {
        return getTestArchive(PersonListServiceItTest.class,
                PersonListService.class, PersonListServiceBean.class, Person.class, Gender.class);
    }

    @Test
    public void testGetAll() {
        List<Person> results = personListService.getResultList();
        assertEquals(64, results.size());
        LOG.info(results.toString());

        Credentials credentials = (Credentials)Component.getInstance("credentials");

        credentials.setUsername("sdfds");

        assertEquals(credentials.getUsername(), "sdf");


    }
}
