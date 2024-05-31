public class PatternPrinting {
  public static void main(String[] args) {
    int n = 5; // You can adjust the size of the pattern

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
