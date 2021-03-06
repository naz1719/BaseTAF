# ------- Execution -------
# 1. docker build --tag=taf/man:v1 .  --file=./Dockerfile.dockerFile
# 2. docker run -it taf/man:v1 sh
FROM openjdk:8u212-jdk-stretch
MAINTAINER Nazar Khimin <nazar.khimin@gmail.com>

WORKDIR /usr/src/project

COPY . .

RUN apt-get update && apt-get install jq -y && apt install dos2unix
RUN chmod +x wait-for-grid.sh && dos2unix wait-for-grid.sh
RUN chmod +x gradlew
RUN ./gradlew wrapper