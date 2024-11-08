## New features introduced in Java 11, along with brief explanations and examples
* Local-Variable Syntax for Lambda Parameters
  * Java 11 allows the var keyword to be used for lambda expressions, improving readability and type inference.
* String API Additions
  * Java 11 introduced several new methods in the String class, including isBlank(), lines(), strip(),
   repeat(),stripLeading() and stripTrailing() etc.
* The Files API Enhancements
  * Java 11 added new methods to the Files class to read/write strings directly from/to files.
* Optional.isEmpty() Method
  * This method provides a more readable way to check if an Optional is empty.
* HttpClient API
  * Java 11 standardized the HttpClient API, making HTTP requests easier and more intuitive.
* New Pattern Matching with Predicate.not()
  * A new static method **Predicate.not()** allows for easier negation in predicates.
* Collection.toArray Method
  * Java 11 simplified converting collections to arrays by adding an overload of toArray.
* Unicode 10 Support
  * Java 11 supports Unicode 10, adding symbols like new currency signs and emojis.
* Deprecated Nashorn JavaScript Engine
  * The Nashorn JavaScript engine is deprecated in Java 11 and scheduled for removal in a future release.
    The engine allowed running JavaScript within Java applications.
* Java Command Enhancements
  * Java 11 allows running single-file Java programs directly from the command line without compilation, simplifying quick scripting tasks.
* New Collection Factories in Collectors
  * Java 11 added convenience methods for unmodifiable collections in Collectors, like toUnmodifiableList, toUnmodifiableSet, and toUnmodifiableMap.
[Java11Examples.java](..%2Fsrc%2Fmain%2Fjava%2Forg%2Fdsa%2Finterview%2Ffeature%2Fjava11%2FJava11Examples.java)