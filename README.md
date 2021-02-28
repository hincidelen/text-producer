# Text Producer 

This project uses Artemis JMS with Quarkus.

## Artemis server

First you need an Artemis server. You can follow the instructions from the [Apache Artemis web site](https://activemq.apache.org/components/artemis/) or run via docker:
```bash
docker run -it --rm -p 8161:8161 -p 61616:61616 vromero/activemq-artemis

```

## Start the application

The application can be started using:

```bash
mvn quarkus:dev
```

Then, open your browser to `http://localhost:8081/send?text=yourtext`, and you will send yourtext content to JMS queue

## Running in native

You can compile the application into a native binary using:

`mvn clean install -Pnative`

and run with:

`./target/jms-quickstart-1.0.0-SNAPSHOT-runner`
