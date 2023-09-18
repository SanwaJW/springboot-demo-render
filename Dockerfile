FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/springboot-demo-render-0.0.1-SNAPSHOT.jar springboot-demo-render.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "springboot-demo-render.jar"]

