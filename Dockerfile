FROM openjdk:8u252-jdk-slim-buster

COPY target/openshift-0.0.1-SNAPSHOT.jar app.jar
COPY src/main/resources/application.properties application.properties

ENV TZ=Asia/Jakarta

EXPOSE 8282

CMD ["java", "-jar", "app.jar"]
