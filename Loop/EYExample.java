import java.util.Scanner;
class EYExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter String: ");
        String str = sc.next();
        int cnt1=0;
        int cnt0=0;
    
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='1'){
                cnt1++;
            }else if(ch=='0'){
                cnt0++;
            }else{
                cnt0=0;
                cnt1=0;
            }
            if(cnt0>=7 || cnt1>=7)
                break;
        }
        System.out.println(cnt0>=7 || cnt1>=7 ? "YES" : "NO");
    }
}