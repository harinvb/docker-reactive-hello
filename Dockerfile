FROM openjdk:11
COPY target/docker_reactive_hello-1.0.0-RELEASE.jar docker_reactive_hello-1.0.0-RELEASE.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/docker_reactive_hello-1.0.0-RELEASE.jar"]