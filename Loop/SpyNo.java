import java.util.Scanner;
class SpyNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. ");
        int num= sc.nextInt();
        int sum=0;
        int product=1;

        for(int i=num; i>0; i/=10){
            sum +=i%10;
            product*=i%10;
        }
        if(sum==product)
            System.out.println(num+" is a SPy no");
        else
            System.out.println(num+" is not a SPy no");
    }
}

// the sum of its digits and the product of its digits must be equal. 
// In our example, 1124 is indeed a spy number because both the sum and the product of its digits are 8.