import java.util.Scanner;
class PrimeFactors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.: ");
        int num = sc.nextInt();
        System.out.print("Prime Factors of "+num+" : ");
        for(int i=2; i<=num; i++){
            if(num%i==0){
                boolean isPrime = true;
                for(int j = 2; j<i; j++){
                    if(i%j == 0){
                        isPrime=false;
                    }
                }
                if(isPrime)
                System.out.print(i+" ");
            }
        }
    }
}
