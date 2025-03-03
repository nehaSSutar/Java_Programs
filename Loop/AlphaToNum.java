import java.util.Scanner;
class AlphaToNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next().toUpperCase();
        int op=0;
            char ch = str.charAt(0);
                op = (ch-64);
            
                if(str.length()==2){
                    char ch1 = str.charAt(1);
                    op = (op*26)+(ch1-64);
                System.out.println(str+" : "+op);
            }
    }
}