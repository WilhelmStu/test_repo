FROM openjdk:17-alpine
ARG JAR_FILE=*.jar
COPY target/${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]