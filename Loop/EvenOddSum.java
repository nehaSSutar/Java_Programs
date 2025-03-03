import java.util.Scanner;
class EvenOddSum{
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num = new Scanner(System.in).nextInt();
        int dup = num;
        int evenSum = 0;
        int oddSum =0;

        while(num>0){
            int rem = num%10;
            if (rem%2==0){
                evenSum+=rem;
            }else{
                oddSum+=rem;
            }
            num/=10;

        }
        System.out.println("Sum of even digits is: "+evenSum);
        System.out.println("Sum of odd digits is: "+oddSum);
        System.out.println(dup);
    }
}