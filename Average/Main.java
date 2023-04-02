public class Main {
    public static void main(String[] args) {
        System.out.printf("The average is: %f\n", average(new int[] { 11, 22, 33, 44, 55, 66 }, 6));
    }
    private static float average(int[] a, int k) {
        float x;

        if (k == 1) return a[0];

        x = average(a, k - 1) * (k - 1);

        return (a[k - 1] + x) / k;
    }    
}
