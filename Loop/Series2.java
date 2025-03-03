class Series2{
    /* 10  30  68  130  222  
    2^3+2=10
    3^3+3=30
    */
    public static void main(String[] args) {
        for(int i=2; i<=6; i++){
            int num=1;
            for(int pow=1;pow<=3; pow++){
                num*=i;
            }
                num= num+i;
            System.out.print(num+ " ");
        }
    }
}