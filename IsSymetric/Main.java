public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 1, 1, 1, 1 };
        int[] array2 = new int[] { 1, 2, 5, 2, 1 };
        int[] array3 = new int[] { 3, 1, 2, 5, 2, 1 };

        System.out.println("The array is symetric: " + isSymetric(array, 0,array.length - 1));
        System.out.println("The array is symetric: " + isSymetric(array2, 0,array2.length - 1));
        System.out.println("The array is symetric: " + isSymetric(array3, 0,array3.length - 1));

    }
    private static boolean isSymetric(int[] arr, int left, int right) {
        if (left >= right) return true;
        if (arr[left] != arr[right]) return false;

        return isSymetric(arr, left + 1, right - 1);
    }    
}
