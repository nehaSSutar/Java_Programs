class FascinatingNo{
    public static void main(String[] args) {
    //     int num = 327;
    //     String str = num+""+(num*2)+(num*3);
    //     boolean flag = true;
    //     for(char i ='1'; i<='9';i++){
    //         int cnt = 0;
    //         for(int j=0; j<str.length();j++){
    //             char ch = str.charAt(j);
    //             if(ch==i)
    //                 cnt++;
    //         }
    //         if(cnt!=1){
    //             flag = false;
    //             break;
    //         }
    //     }
    //     if(flag)
    //         System.out.println(num+" is a Fascinating Number");
    //     else 
    //         System.out.println(num+" is not a Fascinating Number");
    // }

    for(int k=0; k<=1000;k++){
        int num=k;
        String str = num+""+(num*2)+(num*3);
        boolean flag = true;
        for(char i ='1'; i<='9';i++){
            int cnt = 0;
            for(int j=0; j<str.length();j++){
                char ch = str.charAt(j);
                if(ch==i)
                    cnt++;
            }
            if(cnt!=1){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.print(num+" ");
        // else 
        //     System.out.println(num+" is not a Fascinating Number");
    }
    }
}