FROM openjdk:17-jdk-slim

WORKDIR /app
COPY . .
RUN ./gradlew clean build -x test

EXPOSE 8080
CMD ["java", "-jar", "./build/libs/sandbox-0.1.0-SNAPSHOT.jar"]