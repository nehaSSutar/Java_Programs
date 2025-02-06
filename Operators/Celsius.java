import java.util.Scanner;
class Celsius{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a degree in celsius: ");
        double celsius = sc.nextDouble();
        double fah = (9/5)*celsius+32;
        System.out.println(celsius+" Celsius is a "+ fah+ "Fahrenheit");
    }
}