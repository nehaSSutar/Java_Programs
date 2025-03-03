import java.util.Scanner;
class Automorphic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. ");
        int num = sc.nextInt();
        int len = 0;
        int div = 1;
        for(int i = num; i>0; i/=10)
            len++;
        for(int i=1; i<=len; i++)
            div*=10;
        if(num == (num*num)%div)
            System.out.println(num+ " is a Automorphic number");
        else 
            System.out.println(num+" is not a Automorphic number");
    }
}

// An automorphic number is a number whose square has the same digits in the end as the number itself