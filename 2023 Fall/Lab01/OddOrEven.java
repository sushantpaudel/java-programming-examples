import java.util.Scanner;

public class OddOrEven {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    if (num % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
    scanner.close();
  }
}
