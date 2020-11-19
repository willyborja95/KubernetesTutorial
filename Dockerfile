FROM openjdk:11
EXPOSE 8080
ADD target/ms-identity-managment-0.0.1-SNAPSHOT.jar ms-identity-managment-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "ms-identity-managment-0.0.1-SNAPSHOT.jar"] 