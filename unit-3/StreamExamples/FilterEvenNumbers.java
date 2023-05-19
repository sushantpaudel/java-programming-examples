import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbers {
  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    numbers.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);

  }

}
