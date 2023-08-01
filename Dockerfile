FROM openjdk:17
WORKDIR /app

COPY ./target/playlist-service-0.0.1-SNAPSHOT.jar ./target/playlist-service-0.0.1-SNAPSHOT.jar

EXPOSE 8086

CMD ["java", "-jar", "./target/playlist-service-0.0.1-SNAPSHOT.jar"]