# Simple Spring Infinispan Demo

Demonstrate the usage of an Infinispan replicated embedded cache within a Spring Application.

# Run the demo

## 1. Build Application

```shell
$ mvn clean package
```

## 2. Start instances
Start two instances on port 8081 and 8082.

instance 1: 
- Port 8081
- Spring Profile p1

instance 2: 
- Port 8082
- Spring Profile p2

```shell
$ java -jar target/spring-infinispan-embedded-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=p1,replicated-cache
```

```shell
$ java -jar target/spring-infinispan-embedded-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=p2,replicated-cache
```

## 3. Verify bi-directional Cache Replication
Verify the cache replication between the two started instances 

3a. Create a demo entry on instance 1

```shell
$ http localhost:8081/1
```

3b. Call instance 2 and verify that the created entry which was created on instance 1 is replicated

```shell
$ http localhost:8082/1
```

3c. Create and entry on instance 2 and verify that the created entry is replicated to instance 1

```shell
$ http localhost:8082/2
``` 

```shell
$ http localhost:8081/2
``` 

## 4. Verify Cache replication for a new cluster member

4a. Start instance 

instance 3: 
- Port 8083
- Spring Profile p3

```shell
$ java -jar target/spring-infinispan-embedded-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=p3,replicated-cache
```

4b. Verify that the new cluster members cache is replicated

```shell
$ http localhost:8083/2
``` 

