FROM openjdk:17-jdk-slim
COPY target/ecommerce-1.0.0.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/app.jar"]
