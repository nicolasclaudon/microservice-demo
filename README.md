# microservices-demo

## Run des services
````
gradlew --parallel api-gateway:bootRun service-interlocuteurs:bootRun
Ou bien utiliser IDEA pour lancer les deux projets
````
## Accéder aux services

Le service interlocuteurs se lance en [local sur le port 9000](http://localhost:9000/interlocuteurs)

Le service supporte un [get sur un id](http://localhost:9000/interlocuteurs/2)

L'API Gateway est accessible en [local sur le port 8080](http://localhost:8080/interlocuteurs)
