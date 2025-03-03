import java.util.Scanner;
class BinaryToDeci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num =sc.nextInt();
        System.out.println("num : "+num);
        String bin = Integer.toBinaryString(num);
        System.out.println("Binary No.. "+bin);

        int num2=Integer.parseInt(bin,2);
        System.out.println("num2 : "+num2);
    }
}