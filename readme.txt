                        seamArquillian-judcon2010
                        =========================

Where to start? Maven Archetype

We start with a simple Seam 2 maven archetype
http://seam-archetype.sourceforge.net/jbosscc-seam-archetype/1.2/

mvn archetype:generate -DarchetypeGroupId=de.akquinet.jbosscc -DarchetypeArtifactId=jbosscc-seam-archetype -DarchetypeVersion=1.2 -DarchetypeCatalog=http://seam-archetype.sourceforge.net/jbosscc-seam-archetype/1.2/archetype-catalog.xml

Versions
* Seam 2.2.1.CR2
* Maven3 beta2

Application successful runs against jboss-5.1.0.GA.

Does not run against against jboss-6.0.0.20100911-M5. Issues with JSF2.

Than: adding it test harness:
arquillian version 1.0.0.Alpha3

 Hudson: "mvn verify -Pit-tests,managed" (Container will be started and stopped)
        local: "mvn verify -Pit-tests,remote" (runs against running container)
        
#############

focus on practical experiences

szenarios:
1)
Seam

2)
JMS
JMS 4.2.4 - AS 5.1 

3)
SAP-Anbindung