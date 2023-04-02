public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        System.out.println(subSetSum(arr, 5, 1));
        System.out.println(subSetSum(arr, 5, 6));
        System.out.println(subSetSum(arr, 5, 9));
    }
    private static boolean subSetSum(int[] arr, int size, int sum) {
        if (sum == 0) return true;
        if (size == 0 || sum < 0) return false;
        if (arr[size - 1] <= sum) return subSetSum(arr, size  - 1, sum - arr[size - 1]);

        return subSetSum(arr, size - 1, sum);
    }    
}
