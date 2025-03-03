import java.util.Scanner;
class ProductOfDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. ");
        int num = sc.nextInt();
        int opt =1;

        while(num>0){
            int rem = num%10;
                opt*=rem;
                num/=10;
            }
        System.out.println(opt + " is the sum of factors of a given no.");
    }
}
