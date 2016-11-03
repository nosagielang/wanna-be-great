import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This program will print 'May' when you run it.
        
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Pick a number");
		int month = keyboard.nextInt();;
        String monthName;
        switch (month) {
            case 29:  monthName = "February";
                     break;
            case 28:  monthName = "February";
                     break;
            case 30:  monthName = "September April June November";
                     break;
            case 31:  monthName = "January March May July August October December";
                     break;
           default: monthName = "No months have exactly " + month + " days";
                     break;
        }
        System.out.println(monthName);
	}

}
