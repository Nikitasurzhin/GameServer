#!/bin/sh
mvn clean package && docker build -t com.mycompany/gameServer .
docker rm -f gameServer || true && docker run -d -p 9080:9080 -p 9443:9443 --name gameServer com.mycompany/gameServer