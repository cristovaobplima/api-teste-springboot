FROM maven:3.8.7-openjdk-18-slim AS build
COPY /src /api/src
COPY pom.xml /api
RUN mvn -f /api/pom.xml clean package -Dmaven.test.skip

FROM openjdk:21-jdk-slim
EXPOSE 9080
COPY --from=build /api/target/*.jar api.jar
ENTRYPOINT ["java", "-jar", "/api.jar"]