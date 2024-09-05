### SOLID Design Principles

# Single Responsibility Principle:-
Every software component should have one and only one responsibility (one reason to change)
              OR
  A class should have one reason to change.
SRP:- 1)High Cohesion and 2) loose coupling
# Open/Close Principle:-
Every software component should have Open for extension but close for modification.

OCP:- a software component should be extendable but should not modifiable existing behavior
# Lisov Substitution Principle:-
** Objects should be replaceable with their subtypes without effecting the correctness of the programming **
                            OR
  If class B is subtype of class A then we should be able to replace
  class A object with class B object. Without breaking the behavior
  of the program.
  * solution Breaking the hierarchy of components
# Interface Segregation Principle:-
  interface segregation simply means that we should break larger interfaces into smaller ones.
  client do not forced to implement unwanted interfaces
# Dependency Inversion Principle:-
  High level modules should not depend on low level modules both should depend on abstractions.
                      OR
  Class should be depended on interfaces rather than concrete class

## Advantages of SOLID:-
* Easy to maintain
* Loose Coupling
* Increase Flexibility and Reduce Complexity
