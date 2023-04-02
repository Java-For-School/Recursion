public class Main {
    public static void main(String[] args) {
        System.out.println(EvenOddNumber(123456));
        System.out.println(EvenOddNumber(8123456));
        System.out.println(EvenOddNumber(8173456));
    }
    private static boolean EvenOddNumber(int number) {
        if (number < 10) return true;

        int digit = number % 10; 

        number /= 10;

        if (number % 2 == digit % 2) return false;

        return EvenOddNumber(number);
    }    
}
