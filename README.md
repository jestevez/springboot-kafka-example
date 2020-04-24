# springboot-kafka-example

Sample kafka using springboot

Clone repository

```
git@github.com:jestevez/springboot-kafka-example.git
```

Build

```
cd springboot-kafka-example
./mvnw clean package -Dmaven.test.skip=true
```
Build Docker Image

```
docker build -t springboot-kafka-example:v1 .
```

Checking Docker Image

```
docker image list
```

Docker compose

```
docker-compose up
```

Configure Kafka: 

Enter the Web console and create the topic inbound

http://localhost:9000/

Enter the web browser and wait for the messages replicated via Socket

http://localhost:4900

Publish test message using restfull endpoind

````
curl --location --request POST 'localhost:4900/kafka/publish' \
--header 'Content-Type: application/json' \
--data-raw '{
	"id": 1,
	"text": "Hola Mundo",
	"date": "2020-04-07T22:00:00.000Z"
}'

````
