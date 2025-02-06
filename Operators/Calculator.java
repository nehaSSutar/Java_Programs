import java.util.Scanner;
class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operand 1: ");
        float op1 = sc.nextFloat();
        System.out.print("Enter operand : ");
        float op2 = sc.nextFloat();
        System.out.print("Enter operator : ");
        char ch = sc.next().charAt(0);

        float res = ch == '+' ? op1+op2 : ch == '-' ? op1-op2 : 
        ch == '*' ? op1*op2 : ch == '/' ? op1/op2 : ch == '%' ? op1%op2 : 0.00001f;
        String opt = op1+" "+ch+" "+op2+" = "+res;

        if (!(res==0.00001f)){
            System.out.println(opt);
        }
 
    }
}