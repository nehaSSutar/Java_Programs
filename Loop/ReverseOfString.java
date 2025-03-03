import java.util.Scanner;
class ReverseOfString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.next();
        String rev1="";
        StringBuffer rev2 = new StringBuffer(str);

        for (int i =0; i<str.length(); i++){
            rev1 = str.charAt(i)+rev1;
        }
        System.out.println("Reversed String: "+rev1);
        System.out.println("Reversed String: "+rev2.reverse());
    }
}