import java.util.Scanner;
class Prime1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.err.println((num==2||num==3||num==5)? (num+ " is not a prime"):
        ((num%2==0||num%3==0||num%5==0)?(num+ " is not a prime"):(num+ " is a prime")));
    }
}