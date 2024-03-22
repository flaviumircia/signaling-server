FROM openjdk:21

WORKDIR /app

COPY target/signaling-api-0.0.1-SNAPSHOT.jar /app/


LABEL name="signaling-api"

ENV SPRING_PROFILES_ACTIVE dev

EXPOSE 8090

CMD ["java","-jar","/app/signaling-api-0.0.1-SNAPSHOT.jar"]