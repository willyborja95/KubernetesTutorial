FROM mysql/mysql-server:latest
FROM openjdk:12
EXPOSE 8080
ADD target/ms-identity-managment-0.0.1-SNAPSHOT.jar ms-identity-managment-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "ms-identity-managment-0.0.1-SNAPSHOT.jar"] 