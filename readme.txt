                        seamArquillian-judcon2010
                        =========================

Versions
* Seam 2.2.1.CR2
* Arquillian 1.0.0.Alpha3
* Maven3 beta2

Application successful runs against jboss-5.1.0.GA.

Does not run against against jboss-6.0.0.20100911-M5. Not supported by Seam2 yet, issues with JSF2.

Getting started:
1) git checkout or download sources from: http://github.com/michaelschuetz/seamArquillian-judcon2010
2) check repository configuration. see sample settings.xml. Need to config local repository
3) go to root directory and run; mvn install
4) start tests: JBoss 5.1 ist configurated by default
   managed container: "mvn verify -Pit-tests,managed" (Container will be started and stopped)
   remote container:  "mvn verify -Pit-tests,remote" (runs against running container)
        
TODO: Glassfish container config




