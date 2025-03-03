import java.util.Scanner;
class GoodPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = sc.nextInt();
        boolean isPrime = true;
        int count=0;
        
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
                   for(int dgt = i; dgt>0; dgt/=10){
                       int rem = dgt%10;
                       if(rem==1){
                        isPrime=false;
                        break;
                       }
                       for(int k = 2; k<rem; k++){
                           if(rem%k==0 || rem==1){
                            isPrime = false;
                            break;
                           }
                       }
                   }
                }

            if(isPrime){
            count++;
         } 
        }
        System.out.println("Good Prime count: "+count);  
    }
}
    