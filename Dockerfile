FROM openjdk:8-jre-alpine3.9
EXPOSE 9091
ADD ship-management/target/ship-management-0.0.1-SNAPSHOT.jar ship-management-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","ship-management-0.0.1-SNAPSHOT.jar" ]
