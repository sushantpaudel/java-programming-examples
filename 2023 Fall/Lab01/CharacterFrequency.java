import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    Map<Character, Integer> frequencyMap = new HashMap<>();

    for (char ch : input.toCharArray()) {
      frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
    }

    System.out.println("Character frequencies:");
    for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    scanner.close();
  }
}
