**What is record ?**
-> In Java, record is a special kind of class introduced in Java 14 (preview) and fully standardized in Java 16

**Key Properties of record**

 * Fields in a record are final and cannot be reassigned after initialization.
 * This makes records ideal for storing immutable data.
 * The Java compiler automatically generates the constructor, equals(), hashCode(), and toString() methods 
   based on the fields declared in the record.
 * Records are implicitly final, meaning you cannot extend a record.
 * any getter and no setter methods
 * we can create custom methods and static fields but not allow instance fields
 * it not allow inheritance we can't extend another class