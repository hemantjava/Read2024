                                                =====Asking Questions in Interview=====
                                                =======================================
 My current project is Text Extraction service(TES). And It is Based on Health care domain.
 Client: Gaurdand health
 
TES is a OCR based text extraction service it is basically extracting 
data from Scanned pdf Document/TRF(Test Requisition Form)
by helping of amazon textract service. Amazon Textract is a machine learning (ML) Amazon service that automatically 
extracts text from handwriting or digitally filled documents. It extract structured data such as tables,form,Blocks,Lines,Words etc. 

here we are applying validation, business implementation, mapping and 
converting Client Specific CDM(Canonical Data Model) data from raw data. then we send CDM data to outbound queue.
     In my Project there ara 3 microservices and we are using even-driven microservices architecture.
     1)MFAX , 2)TES, 3)AUDIT, 3)SFDC
            MFX is responsible for upload patient filled scanned document to S3 bucket 
            and send to inbound queue.
                                 (In inbound queue having 3 details of s3 bucket URL, Tracking id and Document type)
    And then TES is listening that event and processed the pdf file by helping textract service after that we create 
    CDM(Canonical Data Model) response from raw data. And push the cdm response to the outbound queue. 
    Then outbound queue listen by SFDC portal end user.
    
Purpose of this architecture: Gathering the information from Cancer Patient and creating the data lake,
for cure the cancer patient in early stage.
    
Note:- (TRF form contains cancer patients blood sample details.) 
     
My project is TES(Text Extraction Service). this is based on Health care domain. Here we are using 
event driven microservice architecture. and this project having 4 microservices: MFAX, TES,AUDIT, SFDC portal.
     MFAX: Is responsible to upload patient filled scanned pdf document file to S3 bucket and then send an event to inbound queue. 
     In this event having/contain 3 properties: URL address of S3, tracking id, document type.
     After that TES listening that event.TES is OCR based extraction service. TES extracting data by helping of Amazon Textract service.
     After that we are applying some business logic, implementation, mapping and then converting that raw data to client specific CDM(Canonical Data Model)
     data and send to Outbound queue. after that finally data display in SFDC portal. 
      
    
My Roles and responsibility:-
------------------------------ 
● Involved in all phases of project SDLC Agile Methodology.
● Responsible for writing the client specific rest API and Exception Handling, Business Exception Handling.
● Responsible for configuring the new Services and Controllers as well.
● Responsible for writing the Junit 5 test cases with Mockito and Code Coverage.
● Responsible for swagger documentation for exposing resources to the client.
● Responsible for writing Bean validations (Controllers and Services) and Code validation.
● Responsible for deployment in lower environments using codeFresh(CI/CD tool);

 
    
Imp-Q:2). Difference between ArrayLIst and LinkedList ?
   **ArrayList:-->** 
      ArrayList is a implemented class of List.
      ArrayList is a resizable or growable array.
      ArrayList is the best for retrieval operation. /best for read operation.
      ArrayList is the worst for insertion or deletion in the middle. /worst for write operation.
      ArrayList implements Random Access interface.
      
   **LinkedList:-->**
      LinkedList is a implemented class of list.
      LinkedList is a Doubly linkedlist.
      LinkedList is the worst for retrieval operation. /worst for read operation.
      linkedlist is the best for insertion or deletion in the middle. /best for write operation.
      LinkedList doesn't implement Random Access interface.
       
      
Imp-Q:3).  Difference between Stream(Sequential Stream) and Parallel Stream?
Ans). Stream: "If we want to process collection of object in a single CPU core then we should go for Sequential Stream".
              Runs on a single-core of the computer.
              Performance is poor.
              Order is maintained.
              More reliable and less error-prone,
              Platform independent.
              
Parallel Stream: "If we want to process collection of object in multiple CPU cores then we should go for Parallel Stream."
                 Runs on multiple-core of the computer.
                 The performance is high.
                 Doesn't care about order.
                 Less reliable and more error(error-prone).
                 Platform dependent.
                 

4). How to use/ implement JDBC in java ?
Ans). In Old way There are 5 keys to use/implement JDBC in java:
        a). Register the driver class.==> forName()
        b). Create Connection.==> getConnection()
        c). Create Statement.==> createStatement() 
        d). Execute Queries.==> executeQuery()
        e). Close Connections.==> close()
New way: spring boot yml/properties file configuration
        
Imp-Q:5). Features of Java8 ?
a). Functional interface
b). Lambda Expression (()->)
c). Stream API
d). date & Time API 
e). default & static method in interface
f). Optional class
g). Method reference (::)

6). What is functional interface ?

Ans). Functional interface:  Functional interface has only one abstract method.
 Some predefined functional interfaces as below:-

  a.1) Predicate -> test() It's's having only 1 argument and applying manipulation return "boolean value".
       BiPredicate: It having 2 arguments.
       
  a.2) Function  -> apply(): having only 1 argument.
       BiFunction: having 2 arguments.
       
  a.3) Consumer -> accept(): having only 1 argument.
       BiConsumer: having 2 arguments.
       
  a.4) Supplier -> get()
  
  functional Interface vs BiFunctional Interface:
  > If we want to only 1 argument and do manipulation logics then we should go for functional Interface.
  > If we want to 2 arguments and do manipulation logics then we should go for BiFunctional Interface.
  
  
7). Difference between Spring and SpringBoot ?

Ans). Spring: Widely used for building enterprise Java applications.
              Involves writing lots of boilerplate code.
              Needs dependencies to be defined manually.
              The most important feature of the Spring Framework is dependency injection.
              Involves setting up server manually.
              It helps to create a loosely coupled application.
              
Spring Boot : Widely used for building REST APIs.
              Reduces boilerplate code.
              Starters take care of dependencies.
              The most important feature of the Spring Boot is Autoconfiguration.
              Includes embedded server like Tomcat and Jetty.
              It helps to create a stand-alone application.
               
                 
                 
9). How to create a class immutable in java?/What is immutable class and how we can create immutable class?
   
Ans). Immutable class in java means that once an object is created, we cannot change its content. In Java, 
      all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable.
      
    To create an immutable class in Java, we need to follow these general principles:

      ->Declare the class as final so it can’t be extended.
      ->Make all of the fields private so that direct access is not allowed.
      ->Don’t provide setter methods for variables.
      ->Make all mutable fields final so that a field’s value can be assigned only once.
      ->Initialize all fields using a constructor method performing deep copy.
      ->Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
                 
                 
10). Can overloading and overriding static method ?

Ans). We can overloading static method but not overriding.
      Because, overloading support class level context and static method also. By compiler. 
        And overriding support Object level context. By JVM         
                 
11). Date & Time API in java8 ?

Ans). 5 Useful Features of the Java 8 Date and Time API

      Getting Your Local Time. The Java 8 date and time API comes with a class called LocalTime. ...
      Get Your Local Date. ...
      Check if the Current Year Is a Leap Year. ...
      Get Your Local Date and Time. ...
      Get the Current Date and Time of a Location Using Its Time Zone.
      
      
Q). Collection vs Collections ?
Ans). Collection:
                 -Collection is an interface.
                 -It is used to represent a group of individual objects as a single unit. 
                 -It contains static method, also contain abstract and default methods.
                 
     Collections:
                 -Collections is a utility class.  
                 -It defines several utility methods that are used to operate on collection.
                 -It contains only static methods.
      
                 
    ===========================================================         
             SQL============================
1). Difference between where and having ?

Ans). Where Clause in SQL:	                                                
Filter table based data catering to specific condition	               
Applicable without GROUP BY clause	                                   
Row functions	                                                       
Select, update and delete statements	                               
Applied before GROUP BY clause	                                       
Used with single row operations such as Upper, Lower and so on	       

Having Clause in SQL:
Group based data under set condition
Does not function without GROUP BY clause
Column functions
Only select statement
Used after GROUP BY clause
Applicable with multiple row functions such as Sum, count and so on

iMP-Q). Circuit breaker ?````

  Circuit breaker comes under fault taulerance. we can implement through resilience4j.

there are some methods/Core modules of resiliency4j:
resilience4j-circuitbreaker: Circuit breaking
resilience4j-ratelimiter: Rate limiting
resilience4j-bulkhead: Bulkheading
resilience4j-retry: Automatic retrying (sync and async)
resilience4j-cache: Result caching
resilience4j-timelimiter: Timeout handling

There are 2 types of circuit breaker patterns, Count-based and Time-based.

3 states of circuit breaker: closed, Open, half-Closed.


Q:). Spring Bean scope ?
Ans). Spring Bean Scopes allows us to have more granular control of the bean instances creation.

           There are five types of spring bean scopes:
a). Singleton: Only one instance of the spring bean will be created for the spring container.            
                "This is the default spring bean scope".
                
b). Prototype: A new instance will be created every time the bean is requested from the spring container. 

c). Request: This is same as prototype scope, A new instance of the bean will be created for each HTTP request.
    
d). Session: A new bean will be created for each HTTP session by the container.   

e). Global-Session: This is used to create global session beans for Portlet applications.
           
           
Q). JPA ?
Ans). The Java Persistence API (JPA) is the specification of Java that is used to persist data between Java object and relational database. JPA acts as a bridge between object-oriented domain models and relational database systems.           
        
       
Q). REQUEST methods for REST API ?

Ans). There are 5 REQUEST methods for REST API :

1). GET: Retreive details of a resource.
2). PUT: Create a new resource.
3). POST: Update an existing resource.
4). DELETE: Delete a resource.
5). PATCH: Update part of a resource.
           
             
Q). Marker/tag Interface ?

Ans). An interface doesn't have methods, fields and constants is called Marker/tag interface. 
      or "An empty interface is known as marker/tag interface.
     
      Following types of marker interface:
      a). Serializable interface > belong to java.io package.
      b). Clonable interface > belomg to java.lang package.
      c). Remote interface > belong to java.rmi package.
      
      
Q). Memory Management in Java ?

Ans). In Java, memory management is the process of allocation and de-allocation of objects, called Memory management.
      Java uses an automatic memory management system called a garbage collector.


Q). Collection vs Collections ?

Ans). Collection is an interface. 
      Which can be used to represent a group of individual object as a single entity.
      
      Collections is a utility class present in util package. to define several utility methods(like sorting, searching) 
      for collection object.

Q). How to desable autoconfiguration in springboot?
Ans). "In Spring Boot, you can disable auto-configuration by using the @SpringBootApplication annotation with the exclude             parameter. "
     
Q). What is HashMap ?

Ans). HashMap is a implemented class of map.
      It's present in util package.
      It store data in kay, value pair.
      It's provide the basic implementation of map interface.
      It allow to store a null value.
      
Q). from Where do you gether/get the requirement?  
Ans). From User Story on Agile Go through the User Story and if any doubt so clearify with the leader, 
      If the User story is big then i divide it into subtasks. 
      
Q). Working process?

Ans). We are following Agile methedology in that we had sprint of 2 weeks. In begenning of sprint We get task on user story
      and discussed about the task and then complete the task end of the sprint.
      And every morning was conducted stand-up call for discussed about updates: 
      Like What did do yesterday? and What to do today? 
      If any facing problem so we discussed with team leader.  


Q).public class Practice {
    public static void main(String[] args) {
        System.out.println(value());
    }
    static int value() {
      //final int data = 0;
         static int data = 0; // static not allowed here: illegal start of expression
       // int data = 0;
        return data;
    }
}
Ans). static keyword can not allowed inside method body.(If we use inside then we should compilation Error)

Q). What are @RequestParam, @RequestBody, @PathVariable ?

Ans). @RequestParam: Is used to extract the fixed value from the query string.
      @RequestBody: Is used to extract the entire request body from an incomming HTTP.
      @PathVariable: Is used to extract dynamic values from the URI/URL path.








    