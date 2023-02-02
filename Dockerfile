#RUN ./create-package.sh
FROM openjdk:11
VOLUME /tmp
ADD target/currency-configure_server-0.0.1-SNAPSHOT.jar currency-configure_server-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","currency-configure_server-0.0.1-SNAPSHOT.jar", "-Dspring.profiles.active=prod"]