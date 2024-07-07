1). What is OOPS ? 
->oops is an Object-Oriented Programming System Language
*) There are 4 Pillars of OOPs:-

a)Abstraction 
=> Abstraction is a process of hides/hiding the implementation details
from users. We can achieve this       
functionality by using interface and the abstract class.

b)Encapsulation 
=> Encapsulation is a process of wraps (binds) data and code into a single unit. like a setter getter
method in a single unit ex: Pojo class and DTO class
> Tightly encapsulated class = Each and every class variable data is declared private that is tightly encapsulated.

c)Inheritance 
=> > It is important part of OOPs, when Child class inherits the all properties and behaviour from parent
class.
> Inheritance also known as "IS-A Relationship."
> By using "extends" keyword we can implement "IS-A Relationship" or inheritance.

Advantage - > Inheritance increases the "code re-usability".

Types > 1). Single Inheritance, 2). Multiple Inheritance not support., 3). Multilevel Inheritance, 4).Hierarchical
Inheritance, 5). Hybrid- Inheritance Not supported because multiple inheritance is not supported.

d)Polymorphism 
=> same(one) name multiple(different) form. its two types:- 
d.1)Compile-time polymorphism/static binding(method overloading) 
->  Means "methods name are same but arguments are different" in same class.
d.2)Runtime/Dynamic Binding (method overriding) method signature are same but parent to child class

### 2). method overloading Vs method overriding?
*) Method overloading:
a). Method name are same but Arguments are different. 
b). Method overloading is a Compile-time polymorphism.
d). Private and final methods can be overloaded. 
e). It occurs within the class. 

*) Method overriding.
a). Methods name are same  Arrangements are also same.
c). Method overriding is a Run-time polymorphism.
d). Private and final methods can't be overridden.
e). It is performed in two classes with inheritance relationships.
f). Method overriding always needs inheritance.

3). Final, Finally, Finalize() ?
Ans). Final: Final is a modifier(keyword) applicable for methods, variables and classes. 
A). If a variable declare as final then it is a become constant & we can not perform reassignment that variable.
B). If a method declare as a final then we can't override that method in the child class.
C). If a class declare as a final then we can't create child class of that class.

Finally: finally is a block, always associated with try and catch to maintain cleanup the code.
      try {
      // risky code
      }
      catch (x, e){
      // handeling code
      }
      finally {
      //cleanup code
     //bd connection close etc...
      }
      
Finalize(): finalize is a method which is always innovated by garbage collector,
                  just before destroying an object to perform cleanup activity. 

4). "==" vs .equals() ?
Ans). "==" : We use == operator for reference comparison.
  whereas ".equals()" : We use for content comparison.

5). String vs StringBuffer vs StringBuilder ?
Ans). String: 
=>A String is a sequence of characters. In java, objects of String are immutable which means a constant and
cannot be changed once created.
(OR)
If the content is fixed and won't change frequently then we should go for String.

StringBuffer: 
=>If the content is not fixed and keep on changing frequently, 
                    but thread safety is required then we should go for StringBuffer.
      
StringBuilder: 
=>If the content is not fixed keep on changing frequently 
                     but thread safety is not required then we should go for StringBuilder.

6). Abstract Class In Java?
=> When we declared any class with "abstract" keyword is known as abstract class. In abstract class we can keep
abstract method (without body) and non-abstract method (with body). An Abstract class cannot be instantiated.
For example:
```html
abstract class Demo { 
abstract void show();//abstract method void show(){}//non-abstract method
}
```
7). Interface In Java?
Ans : An interface in java is a blueprint of a class that has static constants and abstract method by default.

8). What Is A Marker Interface?
Ans : Marker interface is an interface with no fields or methods in Java.

9). How Do We Use Comparator And Comparable Interfaces?
Ans: Comparator:
Present in java.util.Comparator package. It is meant for customized sorting order. This interface defines two methods-
.compare(), .equal()
Comparable:
Present in java.lang.Comparable package. It is meant for default natural sorting order. this interface defines only one
method- compareTo().

10). Explain: public static void main(String[] args) ?
Ans: public- It is access modifier from anywhere we can access it.  
static- It is a keyword we can call the methods directly by class name without creating its objects. void- It is the
return type, it means the method does not return anything. main- It is a method name that the JVM looks for as the
starting point of the java program. String[] args- In java we accept only the String type of argument and store it.

11). Jar vs Var vs Ear ?
Ans). jar: "Java archive" file. It contains a group of ".class files". war: "Web Archive" file. It is represented one "
web application". "Use only web related applications". ear: "Enterprise Archive" file. It's represent enterprise
application.

**12). JDK, JRE & JVM & JIT ?**
Ans). JDK: "Java Development kit". It is provides environment to develop and run java applications. JRE: "Java Run Time
Environment". It is provides environment only run java applications. JVM: "Java Virtual Machine". JVM is an Interpreter
and JVM is responsible to run our java programme line by line. JIT: The Just-In-Time (JIT) compiler is a component of
the Java™ Runtime Environment that improves the performance of Java applications at run time.

13). classpath vs Path ?
Ans). Class Path: Class path describe the location where required .class files are available.
      Path: Path describe the location where binary(bin) executable(.exe) files are available.

14). ArrayList vs Generic ArrayList ?
Ans). ArrayList:
-> AL l = new AL(); - It is non-Generic/normal object. - Type safety is not there. - Type casting required.

Generic ArrayList:  
-> AL<String> l = new AL<String> (); - It is generic object. - Type sefty is there. - No Type casting required.

15).Checked and unChecked Exception ?
Ans). Exception:- Exception is abnormal termination of program or unwanted event is called Exception. 
**Checked Exception:**
It is checked by compiler for smooth execution of programme at runtime are called Checked Exception. Example: "
fileNotFoundException".
**Unchecked Exception:** 
Which are not checked by compiler are called Unchecked Exception.
example: "ArithmaticException", "NullPointerException".


17). Method Hiding vs Method Overriding ?
**Method Hiding:**
=>In method Hiding both the method parent class and child class are static. In method Hiding method
resolution always takes care by the compiler based on the Reference type. Method Hiding is known as compile-time
polymorphism or static polymorphism or early binding. and it seems to method overloading.
**Method Overriding:** 
In method overriding both the method parent class and child class are non-static.
In method Overriding method resolution always takes care by JVM based on the Run-time Object. 
It is considered as runtime polymorphism or dynamic polymorphism or late binding.

18). List vs Set ?
**List:** 
List is a child interface of collection. duplicate are allowed and insertion order is preserved
The List implementation classes are LinkedList, ArrayList Vector, Stack.
**Set:** 
Set is a child interface of collection.
Set doesn't support duplication. or duplicate are not allowed.
Set allows us to add at least one null value in it. 
The Set implementation classes are TreeSet, HashSet and LinkedHashSet.

19). what is Stream ?
Ans). Introduced in Java-8. The stream-API are used to process collection of objects.
Stream performs different operations divided into two category -> 
i). Intermediate operations: map(), filter(), shorted(). 
ii). Terminal operations: collect(), forEach(), reduce().

20). Difference between Comparable vs Comparator?
-> Comparable meant for Natural sorting -> compareTo()
-> Comparator meant for Customised sorting -> compare()

21) Difference between Arraylist vs LinkedList? -> Both are list implemented classes ->When our frequent operation is
    data read then ArrayList is the best option but worst for write/delete ->When our frequent operation is data
    write/delete then LinkedList is the best option but worst for read

22) What is String constant pool? -> String Pool in Java is a special storage space in Java Heap memory where string
    literals are stored. It is also known by the names - String Constant Pool or String Intern Pool. Whenever a string
    literal is created, the JVM first checks the String Constant Pool before creating a new String object.

Others================================================

Q-1). What is classloader? 
Ans). Classloader is a subsystem of JVM which is used to load class files. Whenever we run
the java program, it is loaded first by the classloader. There are three built-in classloaders in Java.

a). Bootstrap ClassLoader: This is the first classloader which is the superclass of Extension classloader. 
      It loads the rt.jar file which contains all class files of Java Standard Edition like java.lang package classes, 
      java.net package classes, java.util package classes, java.io package classes, java.sql package classes, etc.
b). Extension ClassLoader: This is the child classloader of Bootstrap and parent classloader of System classloader. 
      It loads the classes from jar files located inside $JAVA_HOME/jre/lib/ext directory.
c). System/Application ClassLoader: This is the child classloader of Extension classloader. 
      It loads the class files from the classpath. By default, the classpath is set to the current directory. 
      We can change the classpath using "-cp" or "-classpath" switch. It is also known as Application classloader.

Q-2). What are the various access specifiers/modifiers in Java?
Ans). In Java access specifiers are the keywords which are used to define the access scope of the method, class, or a
variable. In Java, there are four access specifiers given below.

> Public: The classes, methods, or variables which are defined as public, can be accessed by any class or method. 
> Protected: Protected can be accessed by the class of the same package, or by the subclass of this class, or within the same class.
> Default: Default are accessible within the package only. By default, all the classes, methods, and variables are of default scope.
> Private: The private class, methods, or variables defined as private can be accessed within the class only.     

). Difference Between the static method and instance method ?
**Instance Methods:**
It requires an object of the class.	                                
It can access all attributes of a class.	                       
The methods can be accessed only using object reference.	         
Syntax: Objref.methodname()	                                         
It’s an example of pass-by-value programming.

**Static Methods:**
It does’t require an object of the class. It can access only the static attribute of a class. The method is only
accessed by class name. Syntax: className.methodname()
It is an example of pass-by-reference programming.

Q). How to declare constant variables in Java?
Ans). “final “ keyword is used to declare constants in Java. The following statement declares and initializes a constant
named PI with value 3.14. final int PI=3.14;

Q). What is a static keyword in Java? How it will be used?
Ans).The static in Java is used for memory management mainly. The static keyword can be:
static variable static method static block static class as well

Q). Is String a data type in java? 
Ans). The String is not a primitive data type in java. When a string is created in
java, it’s actually an object of Java.Lang.String class that gets created. After creation of this string object, all
built-in methods of String class can be used on the string object.

Q). - What gives Java its ‘write once and run anywhere’ feature? 
Ans). The bytecode in java give this feature to Java.
Java compiler converts the Java programs source file (.java) into the bytecode (.class) which is the intermediate 
language between source code and machine code. The bytecode is not platform specific and can be executed on any computer.

Q). Why Java does not support multiple inheritance?
Ans).Java does not support multiple inheritance. Suppose C is the child class extending from both parent class A and
parent class B with some methods defined in them. Then, the child class cannot understand which class method to call. so
there is a confusion here which leads to ambiguity and leads to a compile-time error. This is the reason why Java does
not support multiple inheritance.

Q) Java is a "call by value" or "call by reference" language?
-> **Java is a "call by value"** language, which means that when a method is called, the values of the arguments are copied
and passed to the method. This means that changes made to the parameter values within the method have no effect on the original 
arguments outside the method.
However, when passing objects as arguments, the reference to the object is passed by value. 
This means that although the reference is copied, **both the original reference and the copy** still refer to the same object
in memory. Changes made to the object's state within the method will be reflected in the original object outside the method.
This can sometimes create confusion and make it appear as though Java is using "call by reference," but in reality,
it is still "call by value."

Q)Create Immutable classes:-
To create a custom immutable class in Java, you need to follow these steps:

a)Declare the class as final to prevent inheritance and overriding of methods.
b)Declare all instance variables as private and final to ensure they cannot be modified once assigned.
c)Provide a constructor that initializes all the instance variables.
d)Do not provide any setter methods to modify the instance variables.
e)If necessary, provide getter methods to access the values of the instance variables.
f)If the class contains mutable objects, ensure they are deeply copied or made immutable as well.
e)Override the equals(), hashCode(), and toString() methods for proper object comparison and string representation.