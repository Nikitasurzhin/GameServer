@echo off
call mvn clean package
call docker build -t com.mycompany/gameServer .
call docker rm -f gameServer
call docker run -d -p 9080:9080 -p 9443:9443 --name gameServer com.mycompany/gameServer