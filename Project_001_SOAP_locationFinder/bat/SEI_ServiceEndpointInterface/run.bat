REM JDK- 	C:\Program Files\Java\jdk1.8.0_51\bin\wsimport 

REM RUN command line 
REM 1- use wsimport with the http of the service (in porperties must be a JDK not jre)
wsimport -keep -s src http://www.webservicex.net/geoipservice.asmx?WSDL
