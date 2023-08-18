import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {     // Time    Space
    Scanner scanner = new Scanner(System.in);  // O(1)    O(1)
    List<Integer> numbers = new ArrayList<>(); // O(1)    O(1)
    while (scanner.hasNextInt()) {              //  n=O(n) O(n)
      numbers.add(scanner.nextInt());          // *O(1)   *O(1)
    }
    int min = -1;                              // O(1)    O(1)
    for (int x : numbers) {                    // n=O(n   O(1)
      if (x % 2 == 0) {                        // O(1)
        //если до этого не было четных или новое меньше предыдущего минимума
        if (min == -1 || x < min) {            // O(1)
          min = x;                              // O(1)
        }
      }
    }
    System.out.println(-1);                  // 0(1)

  }
}
