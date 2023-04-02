public class Main {
    public static void main(String[] args) {
        System.out.println(hasSequence(new int[] { 3, 1, 2, 3, 4, 6, 3 }, 7, 4));
        System.out.println(hasSequence(new int[] { 3, 1, 2, 1, 2, 3, 4 }, 7, 4));
        System.out.println(hasSequence(new int[] { 1, 2, 3, 4, 1, 5, 1 }, 7, 4));
        System.out.println(hasSequence(new int[] { 3, 1, 2, 1, 2, 3, 5 }, 7, 4));
        System.out.println(hasSequence(new int[] { 3, 1, 2, 3, 5, 6, 3 }, 7, 4));
    }
    private static boolean hasSequence(int[] arr, int size, int digit) {
        if (digit == 0) return true;
        if (size < 1) return false;
        if (arr[size - 1] == digit) return hasSequence(arr, size - 1, digit - 1);

        return hasSequence(arr, size - 1, digit);
    }     
}
