import java.util.Scanner;
class SumOfFactors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.print("enter the no. ");
        int num = sc.nextInt();

        while(num>0){
            int rem = num%10;
            int fact = 1;
            for(int i=rem; i>=1; i--){
                fact*=i;
            }
            num/=10;
            sum +=fact;
        }
        System.out.println(sum + " is the sum of factors of a given no.");
    }
}