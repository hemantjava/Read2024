## SAAS vs PAAS

* SaaS (Software as a Service) provides fully managed,
ready-to-use software applications over the internet, 
like Gmail or Salesforce, aimed at end-users.

* PaaS (Platform as a Service) offers a platform for developers to build, test,
and deploy applications without managing the underlying infrastructure, 
like AWS Elastic Beanstalk or Heroku. SaaS is for using software, 
while PaaS is for developing software.

## why should be override hashcode and equals methods in pojo and hashmap
Overriding hashCode() and equals() in POJOs is essential when using objects as keys in collections like HashMap, HashSet, or Hashtable. Here's why:
Consistency in HashMap: The hashCode() method determines which bucket an object goes into, and equals() checks if two keys are identical. If these methods aren't overridden, two logically equal objects (based on their attributes) might have different hash codes, 
causing issues in retrieval or duplicate entries in a HashMap.
Efficient Lookup: Properly overriding hashCode() ensures that equal objects have the same hash code, allowing fast access to objects in hash-based collections.
Avoid Unexpected Behavior: Failing to override them can lead to incorrect behavior, such as storing multiple objects that should be considered equal or failing to retrieve stored objects.