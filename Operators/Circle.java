import java.util.Scanner;
class Circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 22/7;
        System.out.println("Enter the radius in cm: ");
        float radius = sc.nextFloat();
        float peri = 2*pi*radius;
        float area = pi*radius*radius;
        System.out.println("Perimeter of Circle : "+peri);
        System.out.println("Area of Circle : "+area);
    }
}