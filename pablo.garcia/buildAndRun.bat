@echo off
call mvn clean package
call docker build -t pablo.inacap/pablo.garcia .
call docker rm -f pablo.garcia
call docker run -d -p 9080:9080 -p 9443:9443 --name pablo.garcia pablo.inacap/pablo.garcia