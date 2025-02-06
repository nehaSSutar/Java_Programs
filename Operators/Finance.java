import java.util.Scanner;
class Finance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the subtotal: ");
        float subtotal= sc.nextFloat();
        System.out.println("Enter the tip rate");
        float tiprate = sc.nextFloat();
        float tip = tiprate*subtotal/100;
        float total = subtotal+tip;
        System.out.println("Total:" +total);
    }
}