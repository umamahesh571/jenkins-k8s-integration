FROM eclipse-temurin:21-jdk
COPY target/ecommerce-1.0.0.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/app.jar"]
