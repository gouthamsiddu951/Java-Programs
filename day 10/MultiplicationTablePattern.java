public class MultiplicationTablePattern {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing multiples of i
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + "\t"); 
            }
            System.out.println();
        }
    }
}