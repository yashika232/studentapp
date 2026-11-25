FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 6969

ENTRYPOINT ["java","-jar","app.jar"]