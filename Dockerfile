FROM amazoncorretto:17
MAINTAINER ASF
COPY target/APBack-0.0.1-SNAPSHOT.jar asf-app.jar
ENTRYPOINT ["java", "-jar", "/asf-app.jar"]
