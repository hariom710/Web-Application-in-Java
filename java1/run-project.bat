@echo off
echo Setting up environment...
set JAVA_HOME=C:\Program Files\Java\jdk-21
set MAVEN_HOME=C:\Users\Hp\Downloads\apache-maven-3.9.9-bin\apache-maven-3.9.9
set PATH=%JAVA_HOME%\bin;%MAVEN_HOME%\bin;%PATH%

echo Building project with Maven...
call mvn clean package

echo.
echo Copying WAR file to Tomcat...
copy target\employee-login-1.0-SNAPSHOT.war "C:\Users\Hp\Downloads\apache-tomcat-10.0.27\webapps\employee-login.war"

echo.
echo Starting Tomcat...
cd "C:\Users\Hp\Downloads\apache-tomcat-10.0.27\bin"
startup.bat

echo.
echo Project is being deployed. Please wait a few moments...
echo Once Tomcat is started, open your browser and go to:
echo http://localhost:8080/employee-login/
echo.
echo Press any key to stop Tomcat when you're done...
pause

echo.
echo Stopping Tomcat...
shutdown.bat 