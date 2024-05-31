import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    int reversed = 0;

    while (num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }

    System.out.println("Reversed number: " + reversed);

    scanner.close();
  }
}
