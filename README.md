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


PROJECT EXECUTION GUIDE
-------------
The project helps keeping a high quality product, therefore the objectives of having an automation framework are the following:

  * Ensure that the features of the App are working as expected.
  * Ensure that nothing affected in a negative way after a deployment.
  * Provide stakeholders with rapid and accurate feedback in the status of the product.
  * Ensure that the endpoints are working properly.

In order to fulfill these objectives, the automation framework need to be executed as described below:
  * API regression tests must be executed 2 times a day to verify endpoints status.
  * UI and API regression tests must be executed after a big deployment to the environments.
  * UI regression tests must be executed before publishing the application.
  * UI smoke tests must be executed after doing a change to a feature that may affect other features(I.E: left menu).

After every execution reports will be created, they must be published and shared with the stakeholders and team working
 in th project.

In the case of a test failure, the test must be run isolated to verify if it was a flaky test or a bug 
in the application. Data will be provided by the logs and the reports that are generated after every execution.