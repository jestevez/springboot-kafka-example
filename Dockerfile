FROM openjdk:11
VOLUME /tmp
EXPOSE 4900
ADD ./target/springboot-kafka-example-0.0.1-SNAPSHOT.jar springboot-kafka-example.jar
ENTRYPOINT ["java", "-jar", "/springboot-kafka-example.jar"]
