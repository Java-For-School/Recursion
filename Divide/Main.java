import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    System.out.printf("%d / %d = %d\n", x, y, divide(x, y));
  }

  public static int modulu(int x, int y) {
    
    if (x == y) return 0;
    if (x < y) return x;
  
    return modulu(x - y, y);
  }
  public static int divide(int x, int y) {
    
    if (x < y) return 0;
    if (x == y) return 1;
    return 1 + divide(x - y, y);
  }
}
