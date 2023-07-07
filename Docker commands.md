# Dino Enterprise - Running 11 Microservices

## 1. Create the network in Docker

    docker network create --subnet=172.18.0.0/16 dino-enterprise-microservice-network

- To check all my networks

```
docker network ls
```

- To get JSON data of my network

```
docker network inspect <network_id>
docker network inspect <network_name>
```

## 2. Create docker container

`--name config-service-container` => Set the container's name <br>
`--network dino-enterprise-microservice-network` => Specify the network to which the container should be connected <br>
`--ip 172.18.0.2` => Assigns the IP address to the container. Check if IP address is within the subnet range of the network.<br>
`-p 8081:8081` => Maps port 8081 to the host machine to port 8081 inside the container.<br>
This allow to us to access the container's service using the host's IP address and port 8081.<br>
`profet15746/config-service-image` => Specify the docker image to use for the container

```
docker create --name config-service-container --network dino-enterprise-microservice-network --ip 172.18.0.2 -p 8081:8081 profet15746/config-service-image
```

```
docker create --name registry-service-container-02 --network dino-enterprise-microservice-network --ip 172.18.0.3 -p 8099:8099 profet15746/registry-service-image
```

```
docker create --name admin-service-container --network dino-enterprise-microservice-network --ip 172.18.0.4 -p 8086:8086 profet15746/admin-service-image
```

```
docker create --name gateway-service-container-02 --network dino-enterprise-microservice-network --ip 172.18.0.5 -p 8080:8080 profet15746/gateway-service-image
```

```
docker create --name security-service-container --network dino-enterprise-microservice-network --ip 172.18.0.6 -p 8098:8098 profet15746/security-service-image
```

```
docker create --name profile-service-container --network dino-enterprise-microservice-network --ip 172.18.0.7 -p 8092:8092 profet15746/profile-service-image
```

```
docker create --name payment-service-container --network dino-enterprise-microservice-network --ip 172.18.0.8 -p 8094:8094 profet15746/payment-service-image
```

```
docker create --name game-management-service-container --network dino-enterprise-microservice-network --ip 172.18.0.9 -p 8119:8119 profet15746/game-management-service-image
```

```
docker create --name guide-management-service-container --network dino-enterprise-microservice-network --ip 172.18.0.10 -p 8095:8095 profet15746/guide-management-service-image
```

```
docker create --name coaching-session-service-image --network dino-enterprise-microservice-network --ip 172.18.0.11 -p 8102:8102 profet15746/coaching-session-service-image
```

```
docker create --name coach-report-service-image --network dino-enterprise-microservice-network --ip 172.18.0.12 -p 8101:8101 profet15746/coach-report-service-image
```

![](https://media.giphy.com/media/1iTH1WIUjM0VATSw/giphy.gif)

3. Specify the network when running the container

```
docker run --network dino-enterprise-microservice-network --ip 172.18.0.2 -p 8081:8081 -d profet15746/config-service-image
```

```
docker run --network dino-enterprise-microservice-network --ip 172.18.0.3 -p 8099:8099 -d profet15746/registry-service-image
```

```
docker run --network dino-enterprise-microservice-network --ip 172.18.0.4 -p 8086:8086 -d profet15746/admin-service-image
```

```
docker run --network dino-enterprise-microservice-network --ip 172.18.0.5 -p 8080:8080 -d profet15746/gateway-service-image
```

```
docker run --network dino-enterprise-microservice-network --ip 172.18.0.6 -p 8098:8098 -d profet15746/security-service-image
```

```
docker run --network dino-enterprise-microservice-network --ip 172.18.0.7 -p 8092:8092 -d profet15746/profile-service-image
```

```
docker run --network dino-enterprise-microservice-network --ip 172.18.0.8 -p 8094:8094 -d profet15746/payment-service-image
```

```
docker run --network dino-enterprise-microservice-network --ip 172.18.0.9 -p 8119:8119 -d profet15746/game-management-service-image
```

```
docker run --network dino-enterprise-microservice-network --ip 172.18.0.10 -p 8095:8095 -d profet15746/guide-management-service-image
```

```
docker run --network dino-enterprise-microservice-network --ip 172.18.0.11 -p 8102:8102 -d profet15746/coaching-session-service-image
```

```
docker run --network dino-enterprise-microservice-network --ip 172.18.0.12 -p 8101:8101 -d profet15746/coach-report-service-image
```
