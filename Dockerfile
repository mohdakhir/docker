FROM openjdk:8
COPY target/dcoker-demo-0.0.1-SNAPSHOT.jar dcoker-demo-0.0.1-SNAPSHOT.jar
CMD java .jar dcoker-demo-0.0.1-SNAPSHOT.jar