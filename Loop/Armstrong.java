import java.util.Scanner;
class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. ");
        int num = sc.nextInt();
        int len =0, sum=0;
        int dup=num;
        
        for(int i = num; i>0; i/=10){
            len++;
        }
        while(num>0){
            int rem = num%10;
            int pow=1;
            for (int i=1; i<=len; i++){
                sum*=pow;
                sum+=pow;
            }
            num/=10;
        }
        System.out.println(dup==sum? dup+" is Armastrong no." : dup+" is not Armastrong no.");
    }
}