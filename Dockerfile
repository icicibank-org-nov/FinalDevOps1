FROM maven:3.6.0-jdk-8-alpine as maven
# copy application WAR (with libraries inside)
COPY target/maven-web-app.jar /DevOpsProject.jar
# specify default command
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=test", "/DevOpsProject.war"]
