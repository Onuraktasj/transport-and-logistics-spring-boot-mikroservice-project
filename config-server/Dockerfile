ARG APP_JAR=config-server-0.0.1.jar
FROM gradle:8.5-jdk21 AS build
COPY . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build -x test

FROM ubuntu
RUN mkdir /app
COPY ../config-server-data /app
RUN cd /app; chmod 400 config-server-data

FROM openjdk:21
LABEL maintainer="Onur Aktas"
ARG APP_JAR
ENV APP_JAR=$APP_JAR
EXPOSE 8833
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/${APP_JAR_ENV} /app/${APP_JAR_ENV}
ENTRYPOINT java -jar /app/${APP_JAR_ENV}
