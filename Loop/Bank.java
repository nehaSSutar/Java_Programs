
import java.util.Scanner;
@SuppressWarnings({"unchecked", "deprecation", "unused"})
class Bank{
    public static void main(String[] args) 
{ 
Scanner sc = new Scanner(System.in); 
String username1 = null; 
String password1 = null; 
String address = null; 
long contact = 0; 
double balance = 0.0; 
for ( ; ; ) 
{ 
System.out.println(); 
System.out.println("   WELCOME   "); 
System.out.println(" LAXMI CHIT FUND "); 
System.out.println(); 
System.out.println("1. EXSISTING USER"); 
System.out.println("2. CREATE ACCOUNT"); 
System.out.print("Enter an option: "); 
int opt = sc.nextInt(); 
System.out.println(); 
if(opt==1) 
{ 
if(username1==null){ 
System.out.println("CREATE YOUR ACCOUNT FIRST"); 
continue; 
} 
System.out.println(" LOGIN "); 
System.out.println(); 

for(int i=3 ;i>=1;i--) 
{ 
System.out.println(); 
System.out.print("Username: "); 
String username = sc.next(); 
System.out.print("Password: "); 
String password = sc.next(); 
if(username.equals(username1) && password.equals(password1)) { 
home: 
for ( ; ; ) 
{ 
System.out.println(); 
System.out.println(" HOME PAGE "); 
System.out.println(); 
System.out.println("1. DEPOSIT"); 
System.out.println("2. WITHDRAW"); 
System.out.println("3. CHECK BALANCE"); 
System.out.println("4. MINI STATEMENT"); 
System.out.println("5. LOGOUT"); 
System.out.println(); 
System.out.print("Enter an option: "); 
int opt1 = sc.nextInt(); 
System.out.println(); 
switch(opt1) 
{ 
case 1:{ 
System.out.println("DEPOSIT "); 
System.out.println(); 
System.out.print("Enter the amount: "); 
double depositAmt = sc.nextDouble(); 
balance += depositAmt; 
System.out.println("AMOUNT DEPOSITED SUCCESS"); 
System.out.println(); 
break; 
} 
case 2:{ 
System.out.println("WITHDRAW "); 
System.out.println(); 
System.out.print("Enter the amount: "); 
double withdraw = sc.nextDouble(); 
System.out.print("Enter the pin: "); 
String password3 = sc.next(); 
if(password3.equals(password1)) 
{ 
if(withdraw<=balance){ 
balance -= withdraw; 
System.out.println("AMOUNT DEBITED SUCCESS"); 
} 
else{ 
System.out.println("INSUFFICENT FUNDS"); 
} 
} 
else{ 
System.out.println("WRONG PIN"); 
} 
break; 
} 
case 3 : { 
System.out.println("CHECK BALANCE"); 
System.out.println(); 
for(int j=3;j>=1;j--) { 
System.out.println(); 
System.out.print("Enter the pin: "); 
String password2 = sc.next(); 
if(password2.equals(password1)){ 
System.out.println("ACCOUNT BALANCE: "+ balance+"rs"); 
continue home; 
} 
else{ 
System.out.println("WRONG PIN"); 
System.out.println("Attempty left:"+(j-1)); 
} 
} 
System.out.println("YOUR ACCOUNT HAS BEEN BLOCKED FOR 24 HOURS"); 
System.exit(0); 
break; 
} 
case 4:{ 
System.out.println("MINI STATEMENT"); 
break; 
} 
case 5:{ 
System.out.println("THANK U FOR USING OUR APP"); 
System.out.println("VISIT AGAIN"); 
System.exit(0);// terminate 
} 
} }
} else{ 
System.out.println("INVALID CRED"); 
System.out.println("Attempt left "+(i-1)); 
} 
} 
System.out.println(" THANK U & NEVER VISIT AGAIN"); 
System.exit(0); // use to terminate the exe 
} else if(opt == 2) {
System.out.println(); 
System.out.println(" ACCOUNT CREATION "); 
System.out.print("Username: "); 
username1 = sc.next(); 
System.out.print("Password: "); 
password1 = sc.next(); 
System.out.print("Address: "); 
sc.nextLine(); 
address = sc.nextLine(); 
System.out.print("Contact: "); 
contact = sc.nextLong(); 
System.out.print("Deposit Amount: "); 
balance = sc.nextDouble(); 
System.out.println(); 
System.out.println("ACCOUNT CREATED SUCCESS"); 
} 
else{ 
System.out.println("INVALID OPTION"); 
        } 
    }
}
}