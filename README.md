# Microservices_NetflixOSS_Kafka_Demo

![alt text](https://github.com/Hitman007IN/Microservices_NetflixOSS_Kafka_Demo/blob/master/screenshots/microservice_netflixOSS_kafka_architecture.png)
 
- Step1:- MsServer - http://localhost:8761 (Default port)
- Step2:- MsConfigServer - http://localhost:8761 (Default port)
test with 
http://localhost:8888/ms-service/dev and it should return some config details

- Step 3:- sh bin/zookeeper-server-start.sh config/zookeeper.properties

- Step 4:- Configure the Kafka Server
You need to update server.properties file. By default deleting topics is disabled so it is good to enable it, adding delete.topic.enable at the end of the file.

$ nano ~/kafka/config/server.properties
delete.topic.enable = true
sh bin/kafka-server-start.sh config/server.properties

- Step 5:- Verify Kafka is running
$ echo dump | nc localhost 2181 | grep brokers


Reference :- https://dreamix.eu/blog/java/building-microservices-with-netflix-oss-apache-kafka-and-spring-boot
