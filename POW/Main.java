import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);    

    public static void main(String[] args) {
        int number = scanner.nextInt();
        int power = scanner.nextInt();

        System.out.println(number + "^" + power + " = " + power(number, power));
    }

    public static int power(int number, int power) {
        if (power == 1) return number;

        return number * power(number, power - 1);
    }
}
