FROM openjdk
MAINTAINER yuvrajpgore@gmail.com
COPY target/sb-graphql-0.0.1-SNAPSHOT.jar sb-graphql.jar
ENTRYPOINT ["java", "-jar", "/sb-graphql.jar"]