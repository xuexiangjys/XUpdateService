FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER tengxun@163.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /jeecg-boot/config/jeecg/

WORKDIR /jeecg-boot

EXPOSE 8080

#ADD ./src/main/resources/jeecg ./config/jeecg
ADD build/libs/xupdateservice-1.0.0.jar ./

CMD sleep 2;java -Djava.security.egd=file:/dev/./urandom -jar xupdateservice-1.0.0.jar