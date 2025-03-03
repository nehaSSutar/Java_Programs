class Problem1{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            int num = i;
            int diff = 4;
            for(int j=1; j<=i; j++){
                if(j==1){
                    System.out.print(num+" ");
                }else{
                    num = num+diff;
                    System.out.print(num+" ");
                    diff--;
                }
            }
            System.out.println();
        }
    }
}