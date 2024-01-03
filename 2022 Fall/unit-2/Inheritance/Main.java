class Main{
  public static void main(String[] args){
    System.out.println("----- INHERITANCE -----");

    BaseClass baseClassObj = new BaseClass(100);

    System.out.println("The value when passed 100 in Base Class Object is: " + baseClassObj.value);

    ChildClass childClassObj = new ChildClass(100);

    System.out.println("The value when passed 100 in Child Class Object is: " + childClassObj.value);

    System.out.println("----------");
  }
}