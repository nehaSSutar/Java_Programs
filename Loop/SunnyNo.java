import java.util.Scanner;
class SunnyNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. ");
        int num = sc.nextInt();
        int newNum = num+1;
        boolean flag = false;
        for(int i=0; i<=newNum;i++){
            if(i*i==newNum)
            flag = true;
        }
        if(flag)
            System.out.println(num+" is a Sunny no");
        else
            System.out.println(num+" is not a Sunny no");
    }
}


// It is a positive number where the sum of its digits equals the number itself when those digits are squared. 
// Instance-1
// Input number is 80.
// Let’s check it by using the logic of Sunny number.
// The next value of 80 = 80 + 1 = 81
// The square root of 81 = 9
// As we notice here 81 has a perfect square of 9.
// Hence, 80 is a Sunny number.