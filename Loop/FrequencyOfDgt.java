import  java.util.Scanner;
class FrequencyOfDgt{
    public static void main(String[] args) {
        System.out.print("Enter the num: ");
        long num = new Scanner(System.in).nextLong();
        System.out.println(num);
        for(int i=1; i<=9; i++){
            int cnt=0;
            for(long j=num; j>0; j/=10){
                long rem=j%10;
                if(i==rem){
                    cnt++;
                }
            }
            if(cnt!=0)
                System.err.println(i+" : "+cnt);
        }
    }
}