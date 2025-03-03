import java.util.Scanner;
class DecreasingNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your No. ");
        int num = sc.nextInt();
        boolean flag = true;
        int temp=0;
        for(int i=num; i>0; i/=10){
            int rem = i%10;
            if (rem>temp){
                temp=rem;
            }else{
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println(num+" is a Decreasing Number");
        else
            System.out.println(num+" is not a Decreasing Number");
    }
}
// 98765

