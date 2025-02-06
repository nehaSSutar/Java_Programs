import java.util.Scanner;
class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. ");
        int num = sc.nextInt();
        if(num/2 == num/2.0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        if((num/2)*2 == num){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}