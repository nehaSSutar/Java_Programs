import java.util.Scanner;
class BuzzNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(num%10==7 || num%7==0)
            System.out.println(num+ " is a Buzz No.");
        else    
            System.out.println(num+ " is not a Buzz No.");
    }
}

// Buzz numbers are those numbers that are divisible by seven or end with seven. 
// 57 28 