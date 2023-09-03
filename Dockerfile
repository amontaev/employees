FROM bellsoft/liberica-openjdk-alpine:17.0.7 as build

WORKDIR /app

COPY build.gradle .
COPY settings.gradle .
COPY gradlew .
COPY gradlew.bat .

COPY gradle gradle
COPY src src

RUN ./gradlew build

FROM bellsoft/liberica-openjdk-alpine:17.0.7

WORKDIR /app

COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 80

ENTRYPOINT ["java", "-jar", "app.jar"]