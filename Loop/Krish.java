import java.util.Scanner;
class Krish{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. ");
        int num = sc.nextInt();
        int sum=0;

        for(int i =num; i>0; i/=10){
            int rem = i%10;
            int fact=1;
        for(int j = 1; j<=rem; j++){
            fact*=j;
        }
        sum+=fact;
        }
        System.out.println(sum == num? "Krish No" : "Not a Krish no");
    }
}