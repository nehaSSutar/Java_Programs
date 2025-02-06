import java.util.Scanner;
class WeightConversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. in pounds: ");
        float pounds = sc.nextFloat();

        float kilograms = pounds*0.454f;
        System.out.println(pounds+" pounds is "+kilograms+ " kilograms");
    }
}