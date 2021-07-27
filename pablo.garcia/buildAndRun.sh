#!/bin/sh
mvn clean package && docker build -t pablo.inacap/pablo.garcia .
docker rm -f pablo.garcia || true && docker run -d -p 9080:9080 -p 9443:9443 --name pablo.garcia pablo.inacap/pablo.garcia