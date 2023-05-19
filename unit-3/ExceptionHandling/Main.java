class Main {
  public static void main(String[] args) {
    try {
      int quotient = divide(10, 0);
      System.out.println("Quotient: " + quotient);
    } catch (ArithmeticException e) {
      System.out.println("An error occurred: " + e.getMessage());
      System.out.println();
      // Debugging technique: Logging statement
      System.err.println("Exception stack trace:");
      e.printStackTrace();
    }

    System.out.println("-----------------");

    try {
      int quotient = divide(10, -1);
      System.out.println("Quotient: " + quotient);
    } catch (ArithmeticException e) {
      System.out.println("An error occurred: " + e.getMessage());
      System.out.println();
      // Debugging technique: Logging statement
      System.err.println("Exception stack trace:");
      e.printStackTrace();
    }

  }

  public static int divide(int dividend, int divisor) {
    if (divisor == 0) {
      throw new ArithmeticException("Division by zero is not allowed.");
    }

    if (divisor < 0) {
      throw new ArithmeticException("Division by negative value is not allowed.");
    }

    return dividend / divisor;
  }

}