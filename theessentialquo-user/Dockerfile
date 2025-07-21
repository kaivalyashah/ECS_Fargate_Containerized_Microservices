# Build stage
FROM 605134445572.dkr.ecr.us-east-2.amazonaws.com/theessentialquo/maven-base-image:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Package stage
FROM 605134445572.dkr.ecr.us-east-2.amazonaws.com/theessentialquo/eclipse-temurin:17-jdk-alpine
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/app.jar"]
