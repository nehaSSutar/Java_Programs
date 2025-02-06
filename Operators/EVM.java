import java.util.Scanner;
class EVM{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int bjp = 0, cng = 0, ss= 0, aap=0, mns=0, nota = 0;
        System.out.println("Welcome !!!");
        System.out.print("Enter total population: ");
        int pop = sc.nextInt();
        for (int i = 0; i<pop; i++){
        System.out.println("List of Parties : ");
        System.out.println("1. BJP");
        System.out.println("2. CONGRESS");
        System.out.println("3. SHIVSENA");
        System.out.println("4. AAP");
        System.out.println("5.MNS");
        System.out.println("6.NOTA");
        System.out.println("Enter your vote: ");
        int opt = sc.nextInt();
        if(opt>=1 && opt<=6){
            if (opt == 1)
                bjp++;
            if (opt == 2)
                cng++;
            if (opt == 3)
                ss++;
            if (opt == 4)
                aap++;
            if (opt == 5)
                mns++;
            if (opt == 6)
                nota++;
        }
        if(!(opt>=1 && opt<=6)){
            i--;
            System.out.println("Invalid Vote");
        }
        }
        System.out.println(bjp);
        System.out.println(cng);
        System.out.println(ss);
        System.out.println(aap);
        System.out.println(mns);
        System.out.println(nota);

        if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota){
            System.out.println("BJP has won the election by "+bjp+ " votes");
        }
        if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota){
            System.out.println("CONGRESS has won the election by "+cng+ " votes");
        }
        if(ss>=cng && ss>=bjp && ss>=aap && ss>=mns && ss>=nota){
            System.out.println("BJP has won the election by "+ss+ " votes");
        }
        if(aap>=cng && aap>=ss && aap>=bjp && aap>=mns && aap>=nota){
            System.out.println("AAP has won the election by "+aap+ " votes");
        }
        if(mns>=cng && mns>=ss && mns>=bjp && mns>=ss && mns>=nota){
            System.out.println("MNS has won the election by "+mns+ " votes");
        }
        if(nota>=cng && nota>=ss && nota>=bjp && nota>=mns && aap>=nota){
            System.out.println("Nota has won the election by "+nota+ " votes");
        }
    }
}