class Fibonacci{
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=1; i<=8; i++){
            int c = a+b; //a= 1       b=2   c= 2
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}