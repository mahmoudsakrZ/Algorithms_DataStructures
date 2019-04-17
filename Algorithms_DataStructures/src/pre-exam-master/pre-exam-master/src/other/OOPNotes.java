package other;// A Java constructor cannot be abstract, static, final, and synchronized

// We can use access modifiers while declaring a constructor. 
// It controls the object creation. In other words, 
// we can have private, protected, public or default constructor in Java.

// The default constructor is used to provide the default values to the 
// object like 0, null, etc., depending on the type.

// The static keyword in Java is used for memory management mainly.

// There are two main restrictions for the static method. They are:
// The static method can not use non static data member or call non-static method directly.
// this and super cannot be used in static context.

// Java static block
// Is used to initialize the static data member.
// It is executed before the main method at the time of classloading.

// Note: Multiple inheritance is not supported in Java through class.

// Different ways to overload the method
// There are two ways to overload the method in java

// By changing number of arguments
// By changing the data type
// In java, Method Overloading is not possible by changing the return type of the method only.

// Method overriding is used for runtime polymorphism

// Note: super() is added in each class constructor automatically by compiler
// if there is no super() or this().

// There are mainly three rules for the instance initializer block. They are as follows:
// The instance initializer block is created when instance of the class is created.
// The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
// The instance initializer block comes in the order in which they appear.

// We can perform polymorphism in java by method overloading and method overriding.

// Runtime polymorphism can't be achieved by data members.

// Abstract class in Java
// An abstract class must be declared with an abstract keyword.
// It can have abstract and non-abstract methods.
// It cannot be instantiated.
// It can have constructors and static methods also.
// It can have final methods which will force the subclass not to change the body of the method.

// Rule: If there is an abstract method in a class, that class must be abstract.

// Rule: If you are extending an abstract class that has an abstract method, you must either 
// the implementation of the method or make this class abstract.

// Since Java 8, we can have default and static methods in an interface.
// Since Java 9, we can have private methods in an interface.

// The Java compiler adds public and abstract keywords before the interface method. 
// Moreover, it adds public, static and final keywords before data members.

// An interface which has no member is known as a marker or tagged interface, 
// for example, Serializable, Cloneable, Remote, etc.

// If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages.
// Note: If you import a package, subpackages will not be imported.

// Note: A class cannot be private or protected except nested class.

// We can create a fully encapsulated class in Java by making all the data members of the class private

// Clone() is the fastest way to copy array.

// Object.clone() doesn?t invoke any constructor so we don?t have any control over object construction.

// Java strictfp keyword ensures that you will get the same result on every platform 
// if you perform operations in the floating-point variable.


// There are many ways to create object in java such as new keyword, newInstance() method, 
// clone() method, factory method and deserialization.

// Method overloading is the example of compile time polymorphism.	
// Method overriding is the example of run time polymorphism.

