FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/backend-api-0.0.1-SNAPSHOT.jar backend-api.jar
ENTRYPOINT ["java","-jar","/backend-api.jar"]
