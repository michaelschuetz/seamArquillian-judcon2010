                        presentation
                        =========================
slides

#1
Whom am I?
contributor, twitter, profile

#2
- agenda
--> focus on practical experiences
introduction
live demo
status


#3 seam2

#4 arquillian
-- Aslak Knutsen

#5 Java EE testing
combination

#6 Real practice
3 szenarios
1)SAP-Anbindung
2) JMS 4.2.4 - AS 5.1
3) Seam-Integration --> focus

### --> anzeige von CODE, demo das Archiv auf Platte zeigen 

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




############

repository configuration see sample settings.xml. Need to config local repository

########

live demo:
* creating PersonListServiceItTest
* using arquillian for tdd
* changed PersonListService class

Seam2 injection --> component.getInstance

Show addPackage
add JAr

Remote container

add repo

