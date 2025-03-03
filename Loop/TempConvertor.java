import java.util.Scanner;
class TempConvertor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temp in Degree: ");
        float temp = sc.nextFloat();
        System.out.print("Enter a option to convert temp from: 1. Fahrenheit (°F), 2.Celsius (°C), 3.Kelvin (K), 4.Rankine (°R): ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                System.out.println("Celsius (°C): "+temp*-17.22f);
                System.out.println("Kelvin (K): "+temp*255.92f);
                System.out.println("Rankine (°R): "+temp*460.67f);
                break;
            case 2:
                System.out.println("Fahrenheit (°F): "+temp*32f);
                System.out.println("Kelvin (K): "+temp*273.15f);
                System.out.println("Rankine (°R): "+temp*491.67f);
                break;
            case 3:
                System.out.println("Fahrenheit (°F): "+temp*-459.67f);
                System.out.println("Celsius (°C): "+temp*-273.15);
                System.out.println("Rankine (°R): "+temp*9/5);
                break;
            case 4:
                System.out.println("Fahrenheit (°F): "+temp*-458.67f);
                System.out.println("Kelvin (K): "+temp*0.55556f);
                System.out.println("Celsius (°C): "+temp*-272.5944f);
                break;
            default:
                System.out.println("Enter Valid Opiton!");
        }

    }
}