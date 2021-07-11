# FROM adoptopenjdk/openjdk11
FROM mcr.microsoft.com/openjdk/jdk:11-ubuntu

RUN mkdir /opt/app
COPY target/demo-msopenjdk-1.0-jar-with-dependencies.jar /opt/app
CMD ["java", "-jar", "/opt/app/demo-msopenjdk-1.0-jar-with-dependencies.jar"]