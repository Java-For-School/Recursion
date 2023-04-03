public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4, 6, 7, 8, 9, 69 };
        
        for (int i = 0; i < 9; i++) {
            System.out.printf("The index of element: %d is: %d\n", array[i], binarySearch(array, 0, array.length - 1, array[i]));
        }
    }
    private static int binarySearch(int[] array, int low, int high, int value) {
        if (low > high) return -1;
        if (value == array[low]) return low;
        if (value == array[high]) return high;
        int currentIndex = (int)(low + high) / 2;
        if (array[currentIndex] == value) return currentIndex;
        return (value < array[currentIndex]) ? binarySearch(array, low, currentIndex, value) : binarySearch(array, currentIndex, high, value);
    }    
    
}
