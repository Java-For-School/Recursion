public class Fib {
    
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.printf("The %d element is: %d\n", i, fib(i));
        }
    
    }
    public static long fib(int n) {
        long first, second, temp;

        first = 1;
        second = 1;

        for (int i = 3; i < n; i++) {
            temp = first;
            first += second; 
            second = temp;
        }

        return first;
    }
}
