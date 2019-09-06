FROM maven:3-alpine AS builder
WORKDIR /usr/src/app
COPY pom.xml .
COPY src src
RUN mvn clean package -B

FROM openjdk:8-jre
WORKDIR /usr/app
COPY --from=builder /usr/src/app/target/app.jar .
EXPOSE 8080  
ENTRYPOINT [""]  
CMD ["java","-jar","/usr/app/app.jar"]