#!/bin/sh
mvn clean package && docker build -t org.certificatic/Partidos-jaxws .
docker rm -f Partidos-jaxws || true && docker run -d -p 8080:8080 -p 4848:4848 --name Partidos-jaxws org.certificatic/Partidos-jaxws 
