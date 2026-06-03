FROM eclipse-temurin:21-jdk
COPY target/ecommerce.jar app.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "/app.jar"]
