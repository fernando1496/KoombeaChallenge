CONTENTS OF THIS FILE
---------------------

 * Introduction
 * Requirements
 * Recommended modules
 * Installation
 * Configuration


INTRODUCTION
------------

This project was created with the purpose to complete the different point of the challenge. The framework was built using
a keyword driven approach, the framework cover UI and API features. This project was developed using Java as coding language,
Appium to locate the UI elements, TestNG to manage test cases, Extent reports for reports, Restassured for API testing and POM
as a design pattern.


REQUIREMENTS
------------

This module requires the following modules:

  * Java 8 (uiautomatorviewer is required to locate the elements on the app)


INSTALLATION
------------
Every dependency is already configured in the projec, so only external configurations are needed in order to set it up in a new environment. The
only thing that will be need to be set manually is the Android emulator, and the name must be changed on Base.java in desired capabilities section.


CONFIGURATION
-------------

  * The projects need java 8 in order to run uiautomatorviewer, so JAVA_HOME variable need to be set to Java 8.
  * The default IP is used to run Appium service, if your service is in a different port, must be set at Base.java
