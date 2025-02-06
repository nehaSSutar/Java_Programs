class DigitAdd{
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;
        int rem = num%10;
        sum = sum + rem;
        
        num = num/10;
        rem = num%10;
        sum = sum+rem;

        num = num/10;
        rem = num%10;
        sum = sum+rem;

        num = num/10;
        rem = num%10;
        sum = sum+rem;

        System.out.println(sum);
    }
}