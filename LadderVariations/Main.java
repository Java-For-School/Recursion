public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Ladders Variation: " + LaddersVariation(i));
        }
    }
    private static int LaddersVariation(int levels) {
        if (levels < 4) return levels;
        
        int solutions = LaddersVariation(levels -1);

        return solutions + 1 + (levels % 2 == 0 ? 1 : 2);
    } 
}
