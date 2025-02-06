import java.util.Scanner;
class Cylinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double  pi =  22/7;

        System.out.println("Enter the radius and height of a cylinder: ");
        double radius = sc.nextDouble();
        double height = sc. nextDouble();

        double area = pi*radius*radius;
        double volume = area*height;

        System.out.println("the area is: "+area);
        System.out.println("the vlume is: "+volume);
    }
}