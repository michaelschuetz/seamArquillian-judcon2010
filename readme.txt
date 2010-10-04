                        seamArquillian-judcon2010
                        =========================

Sample code of Seam Arquillian talk at JUDCon 2010. This demo application brings Arquillian integration tests into Seam 2 application.
Based on Seam 2 Maven Archetype (http://seam-archetype.sourceforge.net) this project was easily extended with "seamArquillian-it" Maven module. As this module is selfcontained, it might therefore easily be integrated into your Seam 2 application.

Versions
* Seam 2.2.1.CR2
* Arquillian 1.0.0.Alpha4
* Maven3 beta2 (version 2.2* is supported also)

Application successfully tested against JBoss-5.1.0.GA container.
Hint: Does not run against JBoss-6.0.0.20100911-M5 container by default as Seam2 has troubles with JSF2 libs.

This project uses git for version control and is publically available at github.

Getting started:
1) Git checkout or download sources from: http://github.com/michaelschuetz/seamArquillian-judcon2010 .
2) Synchronize repository configuration. See sample settings.xml. Need to config local repository.
3) Go to root directory and run "mvn install".
4) Start tests - JBoss 5.1 ist configured by default:
   remote container:  "mvn verify -Pit,jbossas51_remote"  (against running container)
   managed container: "mvn verify -Pit,jbossas51_managed" (container will be started and stopped)
5) Additionally, test may be run from IDE, directly.





