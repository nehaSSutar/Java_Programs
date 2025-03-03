import java.util.Scanner;
class PalindromeString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();
        String rev1= "";

        for (int i =0; i<str.length(); i++)
            rev1 = str.charAt(i)+rev1;

        String op= str.equals(rev1) ? "Palindrome" : "not";
        System.out.println(op);
    }
}