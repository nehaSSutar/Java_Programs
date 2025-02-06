import java.util.Scanner;
class Result{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        float total = 600f;
        System.out.println("Enter your Marks: ");
        float marks = sc.nextFloat();
        float per = (marks/total)*100;
        System.out.println(per);
        String res =(per>=75 && per<=100)? ("Grade A") : ((per>=60 && per<=75)? ("Grade B"):((per>=60 && per<=35)?("Grade C"):("Fail")));
        System.out.println(res+ " with "+per);
    }
}