FROM openjdk:8-jre
COPY dist /dist
EXPOSE 9000 9443
CMD /dist/bin/start -Dhttps.port=9443 -Dplay.crypto.secret=kuku