== Compilar

./mvnw clean package -Dmaven.test.skip=true

== Crear la imagen de docker 

docker build -t springboot-kafka-example:v1 .

== Listar las imagenes

docker image list

== Docker compose

docker-compose up

== Entrar en la consola Web y crear el topic inbound

http://localhost:9000/

== Entrar en el navegador web y esperar los mesanjes replicados via Socket

http://localhost:4900

== Publicar mensajes usando la consola

````
curl --location --request POST 'localhost:4900/kafka/publish' \
--header 'Content-Type: application/json' \
--data-raw '{
	"id": 1,
	"text": "Hola Mundo",
	"date": "2020-04-07T22:00:00.000Z"
}'

````