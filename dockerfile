# -------------------------------
# FINAL IMAGE
# -------------------------------

FROM docker.io/library/ubuntu:25.04

COPY target/*-runner /usr/local/bin/app

CMD ["/usr/local/bin/app"]
