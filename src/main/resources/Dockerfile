# Use the official OpenJDK base image
FROM openjdk:17-jdk-slim

# Copy the jar file into the container
ADD target/consumer-service.jar consumer-service.jar

# Expose the port on which the application will run
EXPOSE 9002

# Command to run the application
ENTRYPOINT ["java", "-jar", "consumer-service.jar"]
