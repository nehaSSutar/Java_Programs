import java.util.Scanner;
class Rectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        float height = sc.nextFloat();
    
        System.out.println("Enter the Width: ");
        float Width = sc.nextFloat();

        float area = Width*height;
        float perimeter = 2*(height+Width);

        System.out.println("The Perimeter of rectangle: "+perimeter);
        System.out.println("The Area of rectangle: "+ area);
    }
}