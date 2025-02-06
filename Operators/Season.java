import java.util.Scanner;
class Season{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first three char: ");
        String month = sc.next().toUpperCase();

       String season = month.equals("OCT")|| month.equals("NOV") ||month.equals("DEC")||month.equals("JAN")? "WINTER" :
       month.equals("FEB")||month.equals("MAR")||month.equals("APR")||month.equals("MAY")? "SUMMER" :
       month.equals("JUNE")||month.equals("JULY")||month.equals("AUG")||month.equals("SEPT") ? "WINTER" : "Enter appropriate month";
        System.out.println(season);
    }
}