import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int length = scanner.nextInt();

        for (int i = 1; i <= length; i++) {
            System.out.printf("%d,", InvoiceSeries(i));
        }
    }

    private static int InvoiceSeries(int n) {
        if (n == 1 || n == 2 || n == 3) return n;
        if (n % 2 == 0) return InvoiceSeries(n - 1) + InvoiceSeries(n - 2) + InvoiceSeries(n - 3);
        
        return Math.abs(InvoiceSeries(n - 1) - InvoiceSeries(n - 3));
    }
}
