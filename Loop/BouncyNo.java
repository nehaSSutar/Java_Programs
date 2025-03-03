import java.util.Scanner;

class BouncyNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your No. ");
        int num = sc.nextInt();
        sc.close();

        boolean increasing = false;
        boolean decreasing = false;
        int prevDigit = num % 10;  // Get the last digit
        
        for (int i = num / 10; i > 0; i /= 10) {
            int rem = i % 10;

            if (rem < prevDigit) {
                increasing = true;  // Found an increasing pair
            } else if (rem > prevDigit) {
                decreasing = true;  // Found a decreasing pair
            }

            prevDigit = rem; // Update prevDigit for the next iteration

            if (increasing && decreasing) { // If both are true, it's bouncy
                System.out.println(num + " is a Bouncy Number");
                return; // Exit early since we know it's bouncy
            }
        }

        System.out.println(num + " is not a Bouncy Number");
    }
}
