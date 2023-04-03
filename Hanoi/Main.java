public class Main {
    public static void main(String[] args) {
        Hanoi(8, 'A', 'B', 'C');
    }
    private static void Hanoi(int n, char src, char dest, char help) {
        if (n == 0) return;
        Hanoi(n - 1, src, help, dest);
        System.out.printf("%d from %c to %c\n", n, src, dest);
        Hanoi(n - 1, help, dest, src);
    }    
}
