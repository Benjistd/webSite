FROM ubuntu:trusty

RUN apt-get update && apt-get install sl

RUN echo 'Hello World ! '
