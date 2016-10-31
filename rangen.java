import java.util.Random;
import java.util.Scanner;
public class random {

	public static void main(String[] args) {
		int firstnum, secondnum;
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();
	
		System.out.println("Pick a number between 1 -20. ");
        firstnum = keyboard.nextInt();
        if (firstnum > 20 || firstnum < 1 )
        {
        	System.out.println(" Please try again. Pick a number between 1 -20. ");
            firstnum = keyboard.nextInt();
        }
        
        System.out.println("Pick another number between 1 -20. ");
        secondnum = keyboard.nextInt();
        
       
        for (int i = 1; i <= secondnum; ++i)
        {
          int randomInt = 1 + rnd.nextInt(firstnum);
          System.out.println("Generated number: " + randomInt);
        }
    
        System.out.println("Done.");
    }

	}
