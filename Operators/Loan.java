import java.util.Scanner;
class  Loan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("LOAN CALCULATOR");
        System.out.print("Enter the amount: ");
        float amount = sc.nextFloat();
        System.out.print("Enter the ROI : ");
        float roi = sc.nextFloat();
        System.out.print("Enter the Tenure (months) : ");
        int months = sc.nextInt();

        //con = months -> years
        String str = (months/12)+"."+(months%12);
        float con = Float.parseFloat(str);

        System.out.println("LOAN CACULATION: ");
        System.out.println("Principal Amount : "+amount);
        System.out.println("ROI : "+roi);
        System.out.println("Tenure : "+months+" months");

        float intYear = amount*roi/100;
        float totalInter = intYear*con;
        System.out.println("Interest : "+totalInter);
        float outstanding = amount+totalInter;
        System.out.println("Total outstanding Amount : "+ outstanding);
        System.out.println("EMI : "+(outstanding/months)+" rs");
    }
}