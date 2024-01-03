import java.io.*;

class Person implements Serializable {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}

public class SerializeDeserializeObject {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Person person = new Person("John Doe", 30);
    String filePath = "./output.ser";

    // Serialization
    try (FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {
      oos.writeObject(person);
    }

    System.out.println("Object serialized successfully.");

    // Deserialization
    try (FileInputStream fis = new FileInputStream(filePath);
        ObjectInputStream ois = new ObjectInputStream(fis)) {
      Person deserializedPerson = (Person) ois.readObject();
      System.out.println("Name: " + deserializedPerson.getName());
      System.out.println("Age: " + deserializedPerson.getAge());
    }

    System.out.println("Object deserialized successfully.");
  }
}
