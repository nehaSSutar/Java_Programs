public class Problem2 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        for (int i = 1; i <= n; i++) {
            int num = i; // First number in row
            int down = n + i - 1; // Second number (follows decreasing order)
            
            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0) { // Odd-positioned numbers (1st, 3rd, 5th...)
                    System.out.print(num + " ");
                    num++; // Increment sequentially
                } else { // Even-positioned numbers (2nd, 4th, etc.)
                    System.out.print(down + " ");
                    down--; // Decrement for the next even index
                }
            }
            System.out.println();
        }
    }
}
