import java.util.Random;

public class DiceRoller
 {
    public static void main( String[] args )
    {
        int dienumber1, dienumber2;
        Random rnd = new Random();
        
        dienumber1 = 1 + rnd.nextInt(3);
        dienumber2 = 1 + rnd.nextInt(2);
        
        System.out.println("User rolls " + dienumber1 + " and " + dienumber2 );
        if (dienumber1 != dienumber2){
            System.out.println("Move " + (dienumber1 + dienumber2) + " spaces and stop");
        }
        
        int count =1;
        while (dienumber1 == dienumber2 && count <=2){
        	count++;
        if  (dienumber1 == dienumber2){
        	System.out.println("DOUBLES");
        	System.out.println("Move " + (dienumber1 + dienumber2) + " Spaces and roll again getting...");
        	System.out.println("User rolls " + dienumber1 + " and " + dienumber2 );
       }
        if (dienumber1 != dienumber2){
            System.out.println("Move " + (dienumber1 + dienumber2) + " spaces and stop");
        }
         if (count == 3){
                  System.out.println("DOUBLES");
                  System.out.println("GO TO JAIL --->");
          break;  
         }
         }
    }
         
          
