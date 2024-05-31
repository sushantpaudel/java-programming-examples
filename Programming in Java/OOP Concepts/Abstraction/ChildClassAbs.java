class ChildClassAbs extends MyAbstract {
  
  public ChildClassAbs(int value) {
    super(); // Calling empty constructor
    this.print();
  }

  // Override the dummy function in abstract class
  @Override
  public void abstractFunction() {
    System.out.println("Printed on the overridden function of abstract class.");
  }
}