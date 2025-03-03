class Series3{
    /* 79   108    139   176    217
*/
    public static void main(String[] args) {
        int num = 79;
        for(int i = 29; i<50; i++){
            boolean isPrime = true; 
            for(int j = 2; j<i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                    System.out.print(num+" ");
                    num=num+i;
                }
        }
    }
}
