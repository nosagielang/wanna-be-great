import java.util.Scanner;
public class collatz {
public static void main(String[] args) { 

    
	Scanner keyboard = new Scanner(System.in);
    	
	System.out.println("Pick any number");
    	int n = keyboard.nextInt();
    	System.out.println(n);
    	while (n > 1) {
    		
        if (n % 2 == 0){
        	n = n/2;
        System.out.println(n);
        }
        else if (n % 2 == 1){
        	n = 3 *n + 1;
        System.out.println(n);
         }
    	}
    	
    }

}
