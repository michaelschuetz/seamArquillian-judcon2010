package com.acme.it.util;

import org.jboss.seam.Component;
import org.jboss.seam.contexts.Contexts;
import org.jboss.seam.contexts.Lifecycle;

/**
 * Helper Class for accessing Seam API.
 *
 * @author <a href="mailto:michaelschuetz83@gmail.com">Michael Schuetz</a>
 */
public class SeamUtil {

    private SeamUtil() {
    }

    /**
     * Manually initializes Seam Contexts.
     */
    public static void initializeSeam() {
        if (Contexts.getApplicationContext() == null) {
            Lifecycle.beginCall();
        }
    }

    /**
     * Get Seam component by Class.
     */
    public static Object getInstance(Class clazz){
        return Component.getInstance(clazz);
    }

    /**
     * Get Seam component by Seam component name.
     */
    public static Object getInstance(String componentName){
        return Component.getInstance(componentName);
    }

}
