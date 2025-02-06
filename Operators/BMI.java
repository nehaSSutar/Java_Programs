import  java.util.Scanner;
class BMI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your weight in pounds: ");
        float pounds = sc.nextFloat();
        System.out.println("Enter your height in inches: ");
        float inches = sc.nextFloat();

        float weight = pounds*0.45359237f;
        float height = inches*0.0254f;

        float Bmi = weight/(height*height);
        System.out.println("BMI is "+Bmi);
    }
}