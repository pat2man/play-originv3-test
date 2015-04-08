FROM dockerfile/java
MAINTAINER patrickt@ticketfly.com
ADD files /
WORKDIR /opt/docker
RUN ["chown", "-R", "daemon", "."]
USER daemon
ENTRYPOINT ["bin/play-originv3-test"]
CMD ["activator","docker:stage"]
