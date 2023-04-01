import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int element = scanner.nextInt();

        System.out.println("The fibonaci sequence up to the: " + element + " element amounts to the sum of: " + fib(element));
    }

    public static int fib(int n) {
        if (n == 1 || n == 2) return 1;

        return fib(n - 1) + fib(n - 2);
    }
}


