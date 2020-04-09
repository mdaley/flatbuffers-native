FROM centos/devtoolset-7-toolchain-centos7

USER 0
RUN yum install -y --setopt=tsflags=nodocs git cmake java-1.8.0-openjdk-devel wget && yum update -y && yum clean all -y
RUN wget https://downloads.gradle-dn.com/distributions/gradle-6.3-bin.zip && unzip gradle-6.3-bin.zip && mv gradle-6.3 /opt/gradle
RUN ln -s /usr/bin/cmake /usr/local/bin/cmake
RUN ln -s /opt/gradle/bin/gradle /usr/local/bin/gradle
RUN mkdir /build
RUN ln -s $(readlink -f /usr/bin/java | sed 's:/jre/bin/java::') /usr/lib/jvm/java
ENV JAVA_HOME=/usr/lib/jvm/java
