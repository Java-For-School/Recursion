public class Main {
    public static void main(String[] args) {
        NumPrefix(1123123);
    }
    private static void NumPrefix(int number) {
        if (number == 0) return;
        System.out.println(number);

        NumPrefix(number / 10);
    } 
}
