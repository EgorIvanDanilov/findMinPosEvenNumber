public class Main {

  public static void main(String[] args) {
    //Найти минимальное чётное число в последовательности
    //положительных чисел или вывести -1, если такого числа не существует.
    //Оценить временную и пространственную сложность алгоритма.
    int[] sequence1 = {4, 1425, 1, 99, 100, 2, 10};
    int resultSequence1 = findMinPosEven(sequence1);
    System.out.println("Минимальное четное число: " + resultSequence1);

    int[] sequence2 = {5, 3, 7, 99};
    int resultSequence2 = findMinPosEven(sequence2);
    System.out.println("Минимальное четное число: " + resultSequence2);

    int[] sequence3 = {0, 3434};
    int resultSequence3 = findMinPosEven(sequence3);
    System.out.println("Минимальное четное число: " + resultSequence3);
  }

  public static int findMinPosEven(int[] sequence) {
    int minEven = Integer.MAX_VALUE;
    for (int number : sequence) {
      if (number > 0 && number % 2 == 0 && number < minEven) {// сравниваем
        minEven = number;
      }
    }
    if (minEven == Integer.MAX_VALUE) {
      return -1; // иначе возвращаем -1
    } else {
      return minEven; // возвращаем минимальное четное число
    }
  }
}