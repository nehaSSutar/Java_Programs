import java.util.Scanner;
class PalindromeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. ");
        int num = sc.nextInt();
        int rev = 0;
        int dup = num;

        while(num>0){
            int rem =  num%10;
            rev = rev*10+rem;
            num/=10;
        }
        String op = (dup==rev? dup+" is Palindrome" : dup+" is not a Palindrome");
        System.out.println(op);
    }
}