                        seamArquillian-judcon2010
                        =========================

Versions
* Seam 2.2.1.CR2
* Arquillian 1.0.0.Alpha3
* Maven3 beta2

Application successful runs against jboss-5.1.0.GA.

Hint: Does not run against against jboss-6.0.0.20100911-M5. Not supported by Seam2 yet, issues with JSF2.

Getting started:
1) git checkout or download sources from: http://github.com/michaelschuetz/seamArquillian-judcon2010
2) check repository configuration. see sample settings.xml. Need to config local repository
3) go to root directory and run; mvn install
4) start tests: JBoss 5.1 ist configured by default
   remote container:  "mvn verify -Pit,jbossas51_remote" (against running container)
   managed container: "mvn verify -Pit,jbossas51_managed" (container will be started and stopped)

        
TODO:
* AS 5.1 managed container config
* Glassfish/OpenEJB container config




