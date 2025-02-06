class DigitAdd2{
    public static void main(String[] args) {
        int num = 7264;
        int evenSum = 0;
        int oddSum = 0;
        
        int rem = num%10;
        int result =(rem%2==0)? (evenSum=evenSum+rem):(oddSum=oddSum+rem);

        num=num/10;
        rem = num%10;
        result =(rem%2==0)? (evenSum=evenSum+rem):(oddSum=oddSum+rem);
        num=num/10;
        rem = num%10;
        result =(rem%2==0)? (evenSum=evenSum+rem):(oddSum=oddSum+rem);

        num=num/10;
        rem = num%10;
        result =(rem%2==0)? (evenSum=evenSum+rem):(oddSum=oddSum+rem);

        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}