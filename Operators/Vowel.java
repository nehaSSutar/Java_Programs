import java.util.Scanner;
class Vowel 
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a character: ");
			char ch = sc.next().charAt(0);
			
			String op = (ch == 'a'||ch=='e'||ch== 'i'||ch=='o'||ch=='u')? ("Character is voowel"): ("not a vowel");
			System.out.println(op);
	}
}
