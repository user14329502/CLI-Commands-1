FROM openjdk:17
ADD target/spring-boot-rest-api.jar spring-boot-rest-api.jar
ENTRYPOINT ["java", "-jar","spring-boot-rest-api.jar"]
EXPOSE 8080