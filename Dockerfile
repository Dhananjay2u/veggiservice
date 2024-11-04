# base docker file image name
FROM openjdk:17-jdk-slim
LABEL maintainer="com.test"
ADD target/veggiservice-0.0.1-SNAPSHOT.jar veggiservice.jar
ENTRYPOINT [ "java", "-jar", "veggiservice.jar" ]
EXPOSE 8000