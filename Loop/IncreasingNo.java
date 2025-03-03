import java.util.Scanner;
class IncreasingNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your No. ");
        int num = sc.nextInt();
        boolean flag = true;
        int temp=9;
        for(int i=num; i>0; i/=10){
            int rem = i%10;
            if (rem<temp){
                temp=rem;
            }else{
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println(num+" is a Increasing Number");
        else
            System.out.println(num+" is not a Increasing Number");
    }
}
// 1 2 3 4 