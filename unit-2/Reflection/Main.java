/**
 * Note:
 * 
 * REFLECTION IN JAVA (Ref: https://www.programiz.com/java-programming/reflection)
 * 
 * In Java, reflection allows us to inspect and manipulate classes, interfaces,
 * constructors, methods, and fields at run time.
 * 
 * There is a class in Java named Class that keeps all the information about objects
 * and classes at runtime. The object of Class can be used to perform reflection.
 * 
 * In SUMMARY, Reflection in Java means a way to reflect the properties of an object
 * then use that to identify access modifiers, superclass, etc.
*/

import java.lang.Class;
import java.lang.reflect.*;

class Animal {
}

class Dog extends Animal {
  public void display() {
    System.out.println("I am a dog.");
  }
}

public class Main {
  public static void main(String[] args) {
    // create an object of Dog
    Dog d1 = new Dog();

    // create an object of Class
    // using getClass()
    Class obj = d1.getClass();

    // get name of the class
    String name = obj.getName();
    System.out.println("Name: " + name);

    // get the access modifier of the class
    int modifier = obj.getModifiers();

    // convert the access modifier to string
    String mod = Modifier.toString(modifier);
    System.out.println("Modifier: " + mod);

    // get the superclass of Dog
    Class superClass = obj.getSuperclass();
    System.out.println("Superclass: " + superClass.getName());
  }
}