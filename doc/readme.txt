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

not final: Seam3, JBossAS6 

experiences
Seam 3 modules far away from Seam 2 complexity (security)

##########

#4 arquillian
-- Aslak Knutsen
Archives
– ShrinkWrap
Multiple Test frameworks
– JUnit, TestNG
Multiple Run modes
– In container, as client
Multiple Enrichers
– CDI, EJB, Resources, MC
Multiple Containers

##########

ShrinkWrap, Skip the Build!
Programmatic archive creation 
Simple API
Micro deployments
IDE incremental compilation
– Save and re-run
– Skip the Build!

##########

#5 Java EE testing
combination --> picture "Arquillian Architecture" , ppt, slide10

##########

#6 Real practice
3 szenarios
1) SAP-Integration --> JCA container configuration
2) JMS 4.2.4 - AS 5.1 --> multiple containers, tests against AS5.1
3) Seam 2 -Integration --> focus

##########

practice: usecase 3)

focus on
container profiles uses -->
local deployment: remote --> fast (against running AS)
continous deployment (hudson): managed --> lifecycle support, starts and stops container
we do use Hudson
AS 5.1/GateIn

##########

#CODE live code
1) ejb injected Seam test
2) native Seam injection

##########

Seam 2 + Arquilliab Roadmap
--> API support --> where to put it?
--> Extending --> @In Enricher
--> Arquillian base in lots of open source porjects CDI/Weld Jboss EJBimpl,...

############

Multiple containers:

http://docs.jboss.org/arquillian/reference/latest/en-US/html/containers.html#d0e708

############

Future:
More containers
–  Weblogic, Spring, GlassFish Remote, Hibernate, Drools...

- Frameworks: JSFUnit/HTMLUnit, Selenium
- more containers
- multiple deploy against containers
- cloud deployment

CirrAS, JClouds
– Start and deploy your test cloud
Performance Monitor
GUI - Component Coverage
Package-time class manipulation (Byteman, Javassist, AOP)
– Exception, Callback, Assertion injection
Tooling – JBoss Developer Studio
Framework integration ?
– JSFUnit, Selenium, HTTPUnit, easyB, DBUnit

############

Q&A