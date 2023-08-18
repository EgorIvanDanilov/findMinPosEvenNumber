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
    int min = -1;
    for (int x : numbers) {
      if (x % 2 ==0 ) {
        //если до этого не было четных или новое меньше предфдущего минимума
        if (x < min || x < min) {
          min =x;
        }
      }
    }
      System.out.println(-1);

  }
}
