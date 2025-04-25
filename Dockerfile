FROM eclipse-temurin:17.0.3_7-jre-focal

COPY build/libs/harnessdemoservice*.jar /harnessdemoservice.jar

ENTRYPOINT ["java", "-jar", "/harnessdemoservice.jar"]