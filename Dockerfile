FROM openjdk:8
ADD target/spring-boot-docker-demo.jar spring-boot-docker-demo.jar
EXPOSE 9090
CMD ["java", "-jar", "spring-boot-docker-demo.jar"]