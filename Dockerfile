FROM maven:3.8.3-openjdk-17

WORKDIR /app

#COPY .mvn/ .mvn
COPY pom.xml ./
COPY src ./src
RUN mvn clean install
EXPOSE 8080
CMD ["mvn", "spring-boot:run"]