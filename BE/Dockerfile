#FROM openjdk:17-alpine
#ARG JAR_FILE=BE/target/*.jar
#COPY ${JAR_FILE} /app.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/app.jar"]

FROM maven:3.8.5-openjdk-17-slim AS build
RUN mkdir -p /app
WORKDIR /app
COPY BE/pom.xml /app
COPY BE/src /app/src
RUN mvn -B -f pom.xml clean test

FROM openjdk:17-alpine
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]