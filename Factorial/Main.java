import java.util.Scanner;

class Main {
   private static Scanner scanner = new Scanner(System.in); 
   public static void main(String[] args) {
      int number = scanner.nextInt();

      System.out.println(factorial(number));
   }
   public static int factorial(int number) {
      if (number == 1) return number;

      return number * factorial(number - 1);
   } 
}