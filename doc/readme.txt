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

agenda
--> focus on practical experiences.
introduction
live demo
status

##########

seam2

#3.1 Seam2?? In think it's out??
Seam3, CDI, Weld, Java EE 6, JSF 2, JBossAS 6

##########

#4 arquillian
-- Aslak Knutsen

##########

#5 Java EE testing
combination

##########

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

##########

#CODE live code

##########

#7
whats next | Roadmap--
--> API support --> where to put it?
--> Extending --> @In Enricher
--> Arquillian base in lots of open source porjects CDI/Weld Jboss EJBimpl,...

############

what'S next:
- @In Enricher
- JSFUnit/HTMLUnit
- Selenium
- more containers
- multiple deploy against containers
