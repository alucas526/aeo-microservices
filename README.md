# Microservices Exercises

This repo is the coding work that I did while following along with the "Microservices with Spring Boot and Spring Cloud. From config server to OAuth2 server (without inMemory things)" article on ITNEXT (https://itnext.io/microservices-with-spring-boot-and-spring-cloud-16d2c056ba12)

Within the repo, there are four individual microservices that need to be opened as their own projects in IntelliJ. The auth-service will not run, because I got to the part where I needed to add MongoDB and start using Docker, and that was further along than I had time to do. The other three services will start and run.

When startng the services, they should be started in this order:
1. config-server (verify at http://localhost:8888/actuator/health)
2. registry-service (verify at http://localhost:8761/)
3. gateway-service (can be seen at http://localhost:8761/ when it is running)
