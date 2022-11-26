FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} fourdollar-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/fourdollar-0.0.1-SNAPSHOT.jar"]