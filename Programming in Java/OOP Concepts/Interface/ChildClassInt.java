class ChildClassInt implements MyInterface {
  
  public ChildClassInt(int value) {
    this.print();
  }

  @Override
  public void print() {
    System.out.println("Printing the Value in overridden method from interface class");
  }

  @Override
  public void interfaceFunction() {
    System.out.println("Printed on the overridden function of interface class.");
  }
}