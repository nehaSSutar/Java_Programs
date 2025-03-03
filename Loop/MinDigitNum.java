import java.util.Scanner;
class MinDigitNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int min = 9;
        for(int i=num; i>0 ; i/=10){
            int dgt = i%10;
            if(min>dgt)
            min=dgt;
        }
        System.out.println("Smallest digit from "+num+" is " +min);
    }
}