import java.util.Scanner;
class Emirp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. ");
        int num = sc.nextInt();
        int rev =0;
        boolean isPrime = true;

        for(int i = 2; i<=num/2; i++){
            if(num%i==0){
                isPrime = false;
                System.out.println(num+" is not a Emirp number.");
                break;
            }
        }
        if (isPrime){
                for(int j= num; j>0; j/=10){
                    int rem = j%10;
                    rev = rev*10+rem;
                } 
                for(int i = 2; i<=rev/2; i++){
                if(rev%i==0)
                    System.out.println(num+" is not a Emirp number.");
                else
                    System.out.println(num+" is a Emirp number");
                break;
            }
        }
    }
}