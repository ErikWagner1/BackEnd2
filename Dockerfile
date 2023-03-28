FROM amazoncorretto:11-alpine-jdk
MAINTAINER ErikWagner
COPY target/ErikWagner.jar ew.jar
ENTRYPOINT ["java","-jar","/ew.jar"]