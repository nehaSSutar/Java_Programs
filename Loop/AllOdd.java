class AllOdd{
    public static void main(String[] args) {
        System.out.println("Here are all odd no. from 100 to 1: ");
        for (int i =100; i>=0; i--){
            if (i%2!=0)
            System.out.print(i+", ");
        }
    }
}