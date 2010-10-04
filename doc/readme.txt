                        presentation
                        ============
abstract
Michael Schuetz - Seam2: Real integration testing with Arquillian

The main focus of JBoss' Open Source project Arquillian is to provide an all in one test harness that abstracts away all container lifecycle and deployment from the test logic so developers can easily produce a broad range of integration tests for their enterprise Java applications.

First, I'll present features of Arquillian, and its advantages over common Java EE testing approaches.

Then I'll show how to setup an Arquillian-based integration test within JBoss Seam/EJB environment.

Finally, I'll perform some live coding to develop simple integration test which will than be executed both from command line and IDE against multiple containers.

Attendees will be able to easily try out the code for their own as complete sample project will be hosted at github.
########################
slides

##########
Whom am I?
contributor, twitter, profile

##########
- agenda
--> focus on practical experiences. success story
introduction
live demo
status


#3 seam2

#3.1 Seam2?? In think it's out??
Seam3, CDI, Weld, Java EE 6, JSF 2, JBossAS 6

#4 arquillian
-- Aslak Knutsen

#5 Java EE testing
combination

#6 Real practice
3 szenarios
1)SAP-Anbindung
2) JMS 4.2.4 - AS 5.1
3) Seam-Integration --> focus

focus on
container profiles uses -->
local deployment: remote --> fast (against running AS)
continous deployment (hudson): managed --> lifecycle support, starts and stops container
we do use Hudson


#CODE live code

#7
whats next | Roadmap--
--> API support --> where to put it?
--> Extending --> @In Enricher
--> Arquillian base in lots of open source porjects CDI/Weld Jboss EJBimpl,...


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
arquillian version 1.0.0.Alpha4

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

30 mins

1) ejb based injection
2) seam based          --> integration. perform log in    [wouldn't be alowed to access seam ejb component,]

Seam2 injection --> component.getInstance

Show addPackage
add JAr

Remote container

add repo
############
what'S next:
- @In Enricher
- JSFUnit/HTMLUnit
- Selenium
- more containers
- multiple deploy against containers
