FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/openlegacytest-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ADD ${JAR_FILE} openlegacytest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/openlegacytest-0.0.1-SNAPSHOT.jar"]