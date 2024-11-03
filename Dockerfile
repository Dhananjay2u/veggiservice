# base docker file image name
FROM openjdk:17-jdk-slim
LABEL maintainer="com.test"
ADD target/tealightservice-0.0.1-SNAPSHOT.jar tealightservicev3.jar
ENTRYPOINT [ "java", "-jar", "tealightservicev3.jar" ]
EXPOSE 8000