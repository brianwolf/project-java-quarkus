FROM registry.access.redhat.com/ubi8/ubi-minimal:8.6

WORKDIR /home

COPY mvnw .
COPY src .
COPY pom.xml .

# RUN mvn clean install -DskipTests=true
RUN ./mvnw package -Pnative