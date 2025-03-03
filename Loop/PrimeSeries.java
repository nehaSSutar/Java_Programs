import java.util.Scanner;
class PrimeSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = sc.nextInt();
        boolean isPrime = true;
        
        for(int i=2; i<=range; i++){
            for(int j=2; j<i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }else{
                    isPrime = true;
                }
            }
   
                if(isPrime){
                   System.out.print(i+" ");
                }
        }
    }
}
    