FROM java:11
EXPOSE 8080
ADD target/ms-identity-management-0.0.1-SNAPSHOT.jar ms-identity-management-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "ms-identity-management-0.0.1-SNAPSHOT.jar"] 