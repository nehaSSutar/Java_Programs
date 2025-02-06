import java.util.Scanner;
class CurrencyConvertor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CURRENC CONVERTOR ");
        System.out.println("Enter the amount in INR");
        float inr = sc.nextFloat();

        System.out.println("LIST OF CURRENCIES: ");
        System.out.println("1. USD");
        System.out.println("2. EURO");
        System.out.println("3. GBP");
        System.out.println("4. PKR");
        System.out.println("5. WON");
        System.out.println("6.YEN");
        
        System.out.print("Enter the Currency: ");
        String curr = sc.next().toUpperCase();

        float convCurr;
        if(curr.equals("USD")){
            convCurr = inr/86.56f;
            System.err.println(curr+ " INR is equals to "+convCurr+ " USD");
        }
        else if(curr.equals("EURO")){
            convCurr = inr/90.29f;
            System.err.println(curr+ " INR is equals to "+convCurr+ " EURO");
        }
        else if(curr.equals("GBP")){
            convCurr = inr/107.6f;
            System.err.println(curr+ " INR is equals to "+convCurr+ " GBP");
        }
        else if(curr.equals("PKR")){
            convCurr = inr/0.31f;
            System.err.println(curr+ " INR is equals to "+convCurr+ " PKR");
        }
        else if(curr.equals("WON")){
            convCurr = inr/0.05f;
            System.err.println(curr+ " INR is equals to "+convCurr+ " WON");
        }
        else if(curr.equals("YEN")){
            convCurr = inr/0.56f;
            System.err.println(curr+ " INR is equals to "+convCurr+ " YEN");
        }
        else{
            System.out.println("Enter valid currency");
        }
    }
}