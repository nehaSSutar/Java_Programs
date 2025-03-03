import java.util.Scanner;
class MakePrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. ");
        int num= sc.nextInt();
        boolean isPrime = true;

        for(int i=2; i<num; i++){
            if(num%i==0){
                isPrime = false;
                num++;
                i=2;
            }
            }
            System.out.println(num);
        }
    }
