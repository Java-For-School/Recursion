public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000000; i *= 3) {
            System.out.println("The sum of " + i + "is: " + sumDigits(i));
        }
    }
    private static int sumDigits(int number) {
        if (number / 10 == 0) return number;

        int sum = sumDigits(number / 10);
        
        return sum + number % 10;
    }
}
