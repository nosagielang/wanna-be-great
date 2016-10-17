import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Craps
 {
    public static void main( String[] args )
    {
        int dienumber1, dienumber2;
        Random rnd = new Random();
        Scanner keyboard = new Scanner(System.in);
        int point;
        
        
     
        int total = 0;
        /* Initialize array list called "receipt" */
        ArrayList<String> receipt = new ArrayList<String>(); 
      
        
        /* Start of while Loop for the entire game*/
        while (true){
      
    
        /* Create dice number and roll*/ 	
          dienumber1 = 1 + rnd.nextInt(6);
          dienumber2 = 1 + rnd.nextInt(6);
           
          int roll = dienumber1 + dienumber2;
       
       /* Start game */
        System.out.println("How much money would you like to bet?");
        int betamount = keyboard.nextInt();
       
        
        /* Closes game if bet is 0 */    
        if (betamount == 0)
        {
          System.out.println("Thank you for playing. Here is your receipt:");
          for (int i = 0; i < receipt.size(); i++) {
              System.out.println(receipt.get(i));
          }

          if (total > 0)
          System.out.println(" You are ahead $" + total);
          
          else if (total == 0)
        	  System.out.println("Right back where you started");
          else
        	  System.out.println(" You are behind$" + total);
        	  
	     break;
          } /* Close if statement */
        
        /* If statements with the options */
        
        else if (roll == 7 || roll == 11 ){
        	System.out.println("You rolled " + roll );
            System.out.println("You win! " + betamount + " dollars added to your pot"); 
            total = total + betamount;
            /* Loads loss or win into array*/
            receipt.add("You won $"+ betamount);
          
        }/* Close else if statement */
        
        else if (roll == 2 || roll == 3 || roll == 12 ){
        	System.out.println("You rolled " + roll );
        	System.out.println("You lose! " + betamount + " dollars subtracted from your pot");
        	total = total - betamount;
        	/* Loads loss or win into array*/
        	receipt.add("You lost $"+ betamount);
        	
              } /* Close else if statement */
        
        else if (roll == 4 || roll == 5||roll ==6||roll ==8||roll ==9||roll ==10){
        point = roll;
        System.out.println("You rolled " + roll +". Point is " + point);
          do {
        	  /* Rolls new dice*/
        	  dienumber1 = 1 + rnd.nextInt(6) +1;
              dienumber2 = 1 + rnd.nextInt(6) +1;
              
              if ((dienumber1 + dienumber2) == 7)
              {
                  System.out.println("You rolled 7" );
                  System.out.println("You lose! " + betamount + " dollars subtracted from your pot");
                  /* Loads loss or win into array*/
                  receipt.add("You lost $" + betamount);
                  total = total - betamount;
                  
                  break;
                  
                  }/* Close if inside of do statement */
              
              else if (point == (dienumber1 + dienumber2) ){
                  System.out.println("You rolled " + (dienumber1 + dienumber2) );
                  System.out.println("You win! " + betamount + " dollars added to your pot"); 
                  /* Loads loss or win into array*/
                  receipt.add("You won $"+ betamount);
                  total = total + betamount;
                  break;
                  
              } /* Close else if inside of do statement */
              
        	  else{
               System.out.println("You rolled " + (dienumber1 + dienumber2) +". Point is " + point);
        	 
        	  }/* Close else inside of do statement */
              
             }/* Close do while statement */
          
          while (roll != (dienumber1 + dienumber2) );
          }/*  Close overall while statement */
 
        }
 }
 }

 
