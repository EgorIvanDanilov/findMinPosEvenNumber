import java.util.Scanner;
import  java.util.List;
import java.util.ArrayList;
public class Main2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<>();
    while (scanner.hasNextInt()){
      numbers.add(scanner.nextInt());
    }
    int min = numbers.get(0);
    for (int x : numbers) {
      if (x % 2 ==0 ) {
        if (x < min) {
          min =x;
        }
      }
    }
    if (min % 2 ==0) {
      System.out.println(min);
    } else {
      System.out.println(-1);
    }
  }
}
