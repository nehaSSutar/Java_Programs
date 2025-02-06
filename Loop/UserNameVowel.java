import java.util.Scanner;
class UserNameVowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next().toUpperCase();

        int len = name.length()-1;
        for(int i=0; i<len; i++){
            if(name.charAt(i)=='A' || name.charAt(i)=='E' || name.charAt(i)=='I'
             || name.charAt(i)=='O' || name.charAt(i)=='U') {
                System.out.print(name.charAt(i)+" ");
             }
        }
    }
}