import java.util.Scanner;

public class Turn
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int dieOne = 1;
        int dieTwo = 0;
        int dieThree = 2;
        int tally = 0;
        int value;
        int i;
        int n = 1;
        int save;

        while(dieOne != dieTwo || dieTwo != dieThree || dieThree != dieOne){
            dieOne = (int)(Math.random()*6 + 1);
            dieTwo = (int)(Math.random()*6 + 1);
            dieThree = (int)(Math.random()*6 + 1);
            value = dieOne*dieTwo*dieThree;

            if(n%3 == 0){
                tally = tally - value;
            } else{
                tally = tally + value;
            }
            n++;
        }
        System.out.println("your triplet is " + dieOne);
        System.out.println("your tally after round 1 is " + tally);
        i = dieOne;
        save = dieOne;
        while(i >= 1){
            dieOne = (int)(Math.random()*6 + 1);
            dieTwo = (int)(Math.random()*6 + 1);
            dieThree = (int)(Math.random()*6 + 1);
            value = dieOne*dieTwo*dieThree;
            tally = tally + value;
            i--;
        }
        System.out.println("your tally after round 2 is " + tally);
        System.out.println("Type 1 to continue, 0 to exit");
        
        dieOne = 0;
        n = 0;

        while(dieOne != dieTwo || dieTwo != dieThree || dieThree != dieOne){
            if(i == 1){
                dieOne = (int)(Math.random()*6 + 1);
                dieTwo = (int)(Math.random()*6 + 1);
                dieThree = (int)(Math.random()*6 + 1);
                
            }
        }



        
    }
}