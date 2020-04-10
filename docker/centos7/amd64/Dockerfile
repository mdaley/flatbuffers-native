FROM amd64/cento:centos7

RUN yum groupinstall -y --setopt=tsflags=nodocs "Development Tools" && yum install -y --setopt=tsflags=nodocs cmake && yum update -y && yum clean all -y
RUN mkdir /build && mkdir /out

