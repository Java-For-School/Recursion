public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 33, 2, 44, 55, 0 };

        System.out.printf("The greatest element in the array is: %d\n", findMax(arr, arr.length - 1));
    }
    
    private static int findMax(int[] arr, int size) {
        if (size == 0) return arr[size];

        int max = findMax(arr, size - 1);

        return Math.max(max, arr[size]);
    }
}
