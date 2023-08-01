FROM openjdk:17
WORKDIR /app

COPY . .
RUN mkdir ~/.m2 && mkdir ~/.m2/repository
ADD ~/.m2/settings.xml ~/.m2/settings.xml

RUN ./mvnw clean package

EXPOSE 8086

CMD ["java", "-jar", "./target/playlist-service-0.0.1-SNAPSHOT.jar"]