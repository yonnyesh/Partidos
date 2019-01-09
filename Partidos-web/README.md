# Build
mvn clean package && docker build -t org.certificatic/Partidos-web .

# RUN

docker rm -f Partidos-web || true && docker run -d -p 8080:8080 -p 4848:4848 --name Partidos-web org.certificatic/Partidos-web 