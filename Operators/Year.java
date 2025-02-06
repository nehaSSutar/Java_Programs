import java.util.Scanner;
class Year{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = sc.nextInt();
        int yearsMin = 365*24*60;
        int years = minutes/yearsMin;
        int remMins = minutes%yearsMin;
        int remDays = remMins/60/24;
        System.out.println(minutes+" minutes is approximately "+years+" years and "+remDays+" Days");
    }
}