import java.util.Scanner;
class Neon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. ");
        int num= sc.nextInt();
        int sum=0;
        int sqr = num*num;

        for(int i=sqr; i>0; i/=10)
            sum += (i%10);

        if(sum==num)
            System.out.println(num+" is a Neon No.");
        else
            System.out.println(num+" is not a Neon No.");
    }
}
/* For example if the input number is 9, 
its square is 9*9 = 81 and sum of the digits is 9.*/