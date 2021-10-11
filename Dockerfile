FROM ubuntu:trusty

RUN apt-get update && apt-get install sl

WORKDIR /usr/games

ADD train.sh .

RUN chmod +x train.sh

ENV N=2

ENTRYPOINT [ "./train.sh" ]
