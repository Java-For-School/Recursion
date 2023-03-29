class Main {
  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.printf("%d * %d = %d\n", j, i, multiply(j, i));
      }
    }

  }

  public static int multiply(int x, int y) {
    if (y == 1)
      return x;
    int currentX = multiply(x, y - 1);

    return currentX += x;
  }
}
