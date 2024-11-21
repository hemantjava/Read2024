**Memory Areas in JVM**

The JVM memory is divided into several parts:

1. Heap Memory
   This is the runtime memory where objects are allocated. The heap is further divided into generations to optimize GC performance:

  * **Young Generation (Young Gen):**

Contains newly created objects.
Divided into:
   * Eden Space: Where most new objects are initially allocated.
   * Survivor Spaces (S0 and S1): Hold objects that survive garbage collections in the Eden space.
   * Garbage Collection: Minor GC reclaims memory by removing short-lived objects.


  * **Old Generation (Tenured Gen):**

* Stores long-lived objects that survived multiple GC cycles in the young generation.
* Garbage Collection: Major GC (or Full GC) occurs here, which is more expensive in terms of time.
MetaSpace (since Java 8):

Replaces PermGen (used in earlier Java versions).
Stores class metadata and is allocated from native (non-heap) memory.
No fixed size; grows dynamically.

**2. Non-Heap Memory**

   Includes memory for JVM internals:

Thread Stacks: Contains method call frames, local variables, and partial results for threads.
Program Counter (PC) Registers: Tracks the current instruction being executed for each thread.
Native Method Stacks: Supports native methods via the Java Native Interface (JNI).
Garbage Collection (GC) Process
Garbage collection in Java is the process of identifying and reclaiming memory occupied by objects that are no longer reachable. The JVM uses a combination of techniques to achieve this:

1. Mark-and-Sweep Algorithm
   Mark Phase: The GC identifies all reachable objects by traversing object references starting from "roots" (e.g., static fields, local variables).
   Sweep Phase: Memory occupied by unreachable objects is reclaimed.
2. Generational Collection
   Java uses generational garbage collection to optimize performance:

Minor GC: Reclaims memory from the young generation.
Major GC (Full GC): Reclaims memory from both the young and old generations.
3. Reference Types
   GC behavior depends on the type of object references:

Strong References: Prevent GC unless explicitly set to null.
Soft References: Cleared before OutOfMemoryError.
Weak References: Cleared during the next GC cycle.
Phantom References: Used for post-mortem cleanup; requires explicit reference queue.
 