## Java 17, as a Long-Term Support (LTS) release, brings many new features and improvements,particularly in performance, language enhancements, and updates to libraries and APIs

* 1. Lambda expression in switch
   This feature allows Lambda expression in switch statements, making code more concise and expressive.
   * [SwitchExample.java](..%2Fsrc%2Fmain%2Fjava%2Forg%2Fdsa%2Finterview%2Ffeature%2Fjava17%2FSwitchExample.java)
* 2. Sealed Classes (Standard)
   * Sealed classes allow you to control which classes can extend or implement a class/interface,
   * improving encapsulation and security.
```java

public sealed class Shape permits Circle, Square {}

final class Circle extends Shape {}
final class Square extends Shape {}

```
* 3. Enhanced RandomGenerator Interface
    * Java 17 introduces a new RandomGenerator interface and several implementations,
      providing better random number generation options.
    * [RandomExample.java](..%2Fsrc%2Fmain%2Fjava%2Forg%2Fdsa%2Finterview%2Ffeature%2Fjava17%2FRandomExample.java)
* 4. Text Blocks
     * Introduced in Java 13 as a preview(""" ... """), are now fully integrated and allow multi-line string literals, which improve readability.
     * [TextBlock.java](..%2Fsrc%2Fmain%2Fjava%2Forg%2Fdsa%2Finterview%2Ffeature%2Fjava17%2FTextBlock.java)
* 5. Removal of the Applets API
     * Java 17 finally removes the deprecated Applets API, reflecting its diminished use and security vulnerabilities in modern applications.