import java.util.Scanner;
class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.");
        int num = sc.nextInt();
        // int rem = 0;
        int rev =0;
        int dup = num;

        while(num>0){
            int rem =  num%10;
            rev = rev*10+rem;
            num/=10;
        }
        System.out.println ("The reverse is: "+rev);
        System.err.print("num= "+dup);
    }
}