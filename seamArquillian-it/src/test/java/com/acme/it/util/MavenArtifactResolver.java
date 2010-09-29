package com.acme.it.util;

import java.io.File;

/**
 * Maven Artifact Resolver by Dan Allen. A workaround, still. This code will move straight into ShrinkWrap API
 * https://jira.jboss.org/browse/SHRINKWRAP-140
 * <p/>
 * Property maven.repo.local needs to be defined within surefire plugin config. If repo location differ from default, Test execution will succeed from command line, only. IDE support wouldn't be available than.
 *
 * @author <a href="mailto:michaelschuetz83@gmail.com">Michael Schuetz</a>
 */
public class MavenArtifactResolver {
    private static final String LOCAL_MAVEN_REPO =
            System.getProperty("maven.repo.local") != null ?
                    System.getProperty("maven.repo.local") :
                    (System.getProperty("user.home") + File.separatorChar +
                            ".m2" + File.separatorChar + "repository");

    public static File resolve(final String groupId, final String artifactId, final String version) {
        return new File(LOCAL_MAVEN_REPO + File.separatorChar +
                groupId.replace(".", File.separator) + File.separatorChar +
                artifactId + File.separatorChar +
                version + File.separatorChar +
                artifactId + "-" + version + ".jar");
    }

    public static File resolve(final String groupId, final String artifactId, final String classifier,
                               final String version) {
        return new File(LOCAL_MAVEN_REPO + File.separatorChar +
                groupId.replace(".", File.separator) + File.separatorChar +
                artifactId + File.separatorChar +
                version + File.separatorChar +
                artifactId + "-" + version + "-" + classifier + ".jar");
    }

    public static File resolve(final String qualifiedArtifactId) {
        String[] segments = qualifiedArtifactId.split(":");
        return resolve(segments[0], segments[1], segments[2]);
    }

    public static File[] resolve(final String[] qualifiedArtifactIds) {
        File[] files = new File[qualifiedArtifactIds.length];

        for (int i = 0; i < files.length; i++) {
            String[] segments = qualifiedArtifactIds[i].split(":");
            files[i] = resolve(segments[0], segments[1], segments[2]);
        }

        return files;
    }
}