# Use a lightweight base image with OpenJDK
FROM openjdk:23-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file from the target directory to the container
COPY target/spring-kubernetes-oomkilled-tutorial.jar /app/spring-kubernetes-oomkilled-tutorial.jar

# Expose the default port for Spring Boot
EXPOSE 8080

# Run the Spring Boot application
CMD ["java", "-jar", "/app/spring-kubernetes-oomkilled-tutorial.jar"]
