                                                        Microservices
                                                        ==============
1). What is Microservices ?
Ans). Microservices are an architectural design for building a distributed application using containers.
       an application as a collection of services that are-
       Independently deployable
       Loosely coupled
       Organized around business capabilities
       Owned by a small team
       Highly maintainable and testable

 ((Microservices are an architectural style that develops a single application as a set of small services. 
      Each service runs in its own process. The services communicate with clients, and often each other, 
      using lightweight  protocols, often over messaging or HTTP.))
                                                 
2). What is a popular Java framework to develop microservices?
Ans). Spring Boot is a popular Java framework to develop Microservices.   

3). How to communicate one microservice to another microservice
Ans). there are many ways to communicate one microservice to another microservice
     a). Using RestTemplate
     b). WebClient
     c). Feign Client
     d). Queue (in even-driven microservice architecture)
     
4). How to implement microservices in Java?
Ans). Microservices are a set of loosely coupled small services, and we can use frameworks like Spring Boot, Play Framework,
     Jersey, and Restlet to implement and develop microservices in Java.  

5). How to deploy microservices in Java?
Ans). Docker is a top choice for deploying microservices. We can deploy microservices on containers and 
also use the Function as a Service (FaaS) approach.

6). Differentiate (Monolith)/Monolithic architecture and Microservice architecture.
 **Monolithic architecture:** 
                    - Monolithic architecture is built as one large system and is usually one code-base.
                    - It is not easy to scale based on demand.
                    - It has shared database. 
                    - Large code base makes IDE slow and build time gets increase.
                    - It extremely difficult to change technology or framework because everything is tightly coupled.
                    
 **Microservice architecture:**
                    - Microservices architecture is built as small independent module based on business functionality.
                    - It is easy to scale based on demand.
                    - Each project and module has their own database.
                    - Each project is independent and small in size. So overall build and development time gets decrease.
                    - Easy to change technology or framework because every module and project is independent & loosly coupled.
                    
**7).What is load balancing?**
Ans). Load balancing is the process of distributing the traffic among different instances of the same application. 
Two types of load balancing in microservices architecture are used: server side load balancing and client side load balancing.
      a) server side load balancing:- Amazon EKS 
      c) client side load balancing :- Ribbon

**8)What is circuit breaker**
In the context of microservices architecture, a circuit breaker is a design pattern used to prevent cascading failures in distributed systems. 
It is a software component that monitors the calls to a service and detects if the service is unavailable or experiencing high latency. 
When the circuit breaker detects a problem with the service, it "trips" and temporarily stops making further requests to the service.

The circuit breaker has three states: open, closed, and half-open. In the closed state, 
the circuit breaker allows calls to pass through to the service as normal. In the open state, 
the circuit breaker prevents any calls from being made to the service and returns an error message to the calling application immediately,
without making the call. In the half-open state, the circuit breaker allows a limited number of calls to be made to the service,
to check if it has recovered, and if the calls succeed, it switches back to the closed state. If the calls fail, it returns to the open state.

The circuit breaker pattern is used to increase the fault tolerance and resilience of microservices by preventing cascading failures. By using a circuit breaker, a failing service can be isolated and prevented from causing problems for other services that depend on it. The circuit breaker also provides a way to degrade gracefully in the event of a failure, allowing the application to continue to function with reduced functionality rather than crashing completely.

In summary, in the context of microservices architecture, the open state refers to the circuit breaker preventing calls to a failing service, while the closed state refers to the circuit breaker allowing calls to the service as normal.