import java.util.Scanner;
class PhonePassword{
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int storePin = 1234;
        int seconds = 5000;

        outerloop:
        for( ; ; ){
            int attempts=3;
            do { 
                System.out.println("Enter your Pin: ");
                int pin = sc.nextInt();
                if(storePin==pin){
                    System.out.println("PHONE UNLOCKED");
                    break outerloop;
                }else{
                    System.out.println("WRONG PIN");
                    System.out.println("ATTEMPTS LEFT: " +(attempts-1));
                }
                attempts--;
            } while (attempts>=1);
            System.out.println();
            System.out.println("PHONE IS DISABLED FOR "+(seconds/1000)+ " seconds");
            System.out.println();
            seconds*=2;
        }
    }
}