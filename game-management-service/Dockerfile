FROM openjdk:17-oracle
WORKDIR /app
COPY build/libs/*.jar app.jar
EXPOSE 8119
ENTRYPOINT ["java", "-jar", "app.jar"]