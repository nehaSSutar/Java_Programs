import  java.util.Scanner;
class CheckCase2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        String op = ((ch>='A'&& ch<='Z'||(ch>='a'&& ch<='z')))? 
        ((ch>'A'&& ch<='Z')? (ch+ " is an Uppercase Character"):(ch+ " is an Uppercase Character")):
        ((ch>='0'&& ch<='9')? (ch+ " is a Digit"):(ch+ " is a special character"));
        System.out.println(op);
    }
}