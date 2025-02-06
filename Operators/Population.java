class Population{
    public static void main(String[] args) {
        int currPop = 312032486;
        int seconds= (365*24*60*60)*5;
         int birth = seconds/7;
         int death = seconds/13;
         int imm = seconds/45;
        int newPop = currPop+birth-death+imm;

        System.out.println("Currente Population; " +currPop);
        System.out.println("New Population: "+newPop);
    }
}