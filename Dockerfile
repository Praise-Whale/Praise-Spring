FROM openjdk:11
ADD target/*.jar *.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "*.jar"]
