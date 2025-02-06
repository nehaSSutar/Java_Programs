import java.util.Scanner;
class NumberHi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        String op =(num%2==0 && num%5==0)? ("HiTwoFive"):((num%2==0)? ("HiTwo"):((num%5==0)? ("HiFive"):(" ")));
        System.out.println(op);
    }
}