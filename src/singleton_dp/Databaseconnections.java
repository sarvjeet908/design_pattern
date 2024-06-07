package singleton_dp;

public class Databaseconnections {
    private static  Databaseconnections databaseconnections=null;
    String url="https://mydatabase.com";
    String username="sarvjeet";
     String password="jyoti";
    private Databaseconnections(){

    }
    public static Databaseconnections getInstance(){
        if (databaseconnections==null){
            synchronized (Databaseconnections.class) {
                /*
`Databaseconnections.class` refers to a special object in Java that represents
the class definition of the `Databaseconnections` class itself, rather than an instance of the class.
In Java, `.class` is a special syntax used to obtain the Class object associated with a particular class.
 It's a way to access metadata about the class itself, such as its methods, fields, constructors, and other information.
When you use `Databaseconnections.class`, it does not create an instance of the `Databaseconnections` class; instead,
it provides access to information about the class, including its methods, fields, annotations, etc.
In the context of the Singleton pattern implementation you provided:
```java
synchronized (Databaseconnections.class) {
    // ...
}...The `synchronized` block is using the `Databaseconnections.class` object as a monitor or lock for synchronization purposes.
 It ensures that only one thread can execute the critical section of code (in this case, the creation of the singleton instance) at a time,
across all instances of the `Databaseconnections` class.
                 */
                databaseconnections = new Databaseconnections();
            }
        }
        return databaseconnections;
    }
}
