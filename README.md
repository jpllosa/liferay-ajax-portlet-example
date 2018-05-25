# Liferay AJAX Portlet Example

What will this example demonstrate?
1. How to submit a form in liferay without reloading the page?
This example does not reload the entire page when a FORM HTTP POST/GET request is invoked.

2. How to get the parameters passed in an AJAX request from `javax.portlet.ResourceRequest`?
Use `com.liferay.portal.kernel.util.ParamUtil` and `com.liferay.portal.util.PortalUtil`.

3. How to update the page without reloading it?
DOM manipulation using JQuery.

## Development Environment
* Liferay Portal Community Edition 6.2 CE GA5
* Liferay IDE Eclipse Mars.2 Release (4.5.2)
* Liferay v6.2 CE Server (Tomcat 7)
* JDK1.8.0_151
* Liferay Plugins SDK 6.2

## Creating the Project
* File -> New -> Liferay Portlet
* Liferay MVC
* liferay-plugins-sdk-6

## Important Steps
* Add jQuery to liferay-portlet.xml for DOM manipulation
* Change portlet-class in portlet.xml

## Build and Deploy
* Build a war file. In Eclipse, right click on the project -> Liferay -> SDK -> deploy.
* The created war file is located in liferay-portal-6.2/dist. Copy/Deploy the war file to the hot deploy directory of the Application and Web Servers.

## Notes
* The liferay dev environment should have the following diretories: *Liferay_codebase, liferay_IDE, liferay-portal-6.2*
* Edit *portal-ide.properties'* in liferay-portal-6.2. Change *auto.deploy.tomcat.conf.dir* to point to the correct local path in your system.
* Edit *build.username.properties* in liferay-plugins-sdk-6.2. Change *app.server.parent.dir* to point to the correct path in your system.
* Run *eclipse.exe* in liferay_IDE/eclipse. You may be prompted for a workspace location. Make it point to your local *Liferay_codebase* path.
* On a clean Eclipse IDE, add a server. Choose *Liferay v6.2 CE Server (Tomcat 7).* Make sure it uses Tomcat found in */liferay-portal-6.2/tomcat-7.0.62.* You might need to change the JRE to point to your local system.
* Import the *liferay-plugins-sdk-6.2* project found in Liferay_codebase.
* You can now run the Tomcat server (*<nowiki>http://localhost:8080</nowiki>*). Test username: *test@liferay.com*, password: *test*
* You can now import or create the portlets you want. Eclipse may ask you to change to the *Liferay Plugins Perspective.*
* The **portlets** repository should be in the *liferay-plugins-sdk-6.2*.