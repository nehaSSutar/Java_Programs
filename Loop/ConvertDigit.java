import java.util.Scanner;
class ConvertDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. ");
        int num = sc.nextInt();
        int dup = num;
        int count=0;
        for(int i=num; i>0; i/=10){
            count++;
        }
        String op = "";
        if(count%2==0){
            for(int i=dup; i>0; i/=10){
                int rem = i%10;
                if(rem%2!=0){
                    op= ++rem+op;
                }else{
                    op= rem+op;
                }
            }
        }else{
            for(int i=dup; i>0; i/=10){
                int rem = i%10;
                if(rem%2==0){
                    op= ++rem+op;
                }else{
                    op= rem+op;
                }
            }
        }
        System.out.println(op);
    }
}