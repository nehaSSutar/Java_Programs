import java.util.Scanner;
class DuckNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. ");
        String str = sc.next();
        if(str.charAt(0)== '0' || !(str.contains("0")))
            System.out.println(str+" is not a Duck no.");
        else 
            System.out.println(str+" is s Duck no.");
    }
}

// A Duck number is a positive integer that contains at least one zero, except for those with starting zeros.
// 6302,6540, 7670768, and 10209.