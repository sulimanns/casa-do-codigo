FROM maven:3.8.4-openjdk-17-slim AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-slim
WORKDIR /app
COPY --from=builder /app/target/casadocodigo-0.0.1-SNAPSHOT.jar ./casadocodigo.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "/app/casadocodigo.jar"]