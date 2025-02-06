import java.util.Scanner;
class EvenSum{
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int num = new Scanner(System.in).nextInt();
        int dup = num;
        int evenSum = 0;

        while(num>0){
            int rem = num%10;
            if (rem%2==0){
                evenSum+=rem;
            }
            num/=10;

        }
        System.out.println(evenSum);
        System.out.println(dup);
    }
}