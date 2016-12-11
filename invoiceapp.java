import java.util.Scanner;

public class InvoiceApplication {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Tax rate?");
		double taxrate = keyboard.nextDouble();
	    double myPrices[] = new double[100];
	    double subtotal = 0;
	    double price = 0;
	    
	    int counter = 0; 
		do 
		{
		 System.out.println("What is the price?");
		price =  keyboard.nextDouble();
		myPrices[counter] = price;
		subtotal = price + subtotal;
		counter+=1;
		} while (price != 0);
		
		System.out.println("Tax Rate? : " + taxrate);
		for (int i=0;i <=counter; i++){
			System.out.println("The price is "+ myPrices[i]);
			}
		
		double taxtotal = taxrate * subtotal;
        double grandtotal = subtotal + taxrate; 
        
		System.out.println("The subtotal is " + subtotal);
		System.out.println(taxtotal + " tax");
		System.out.println( grandtotal + " grand total");
	}
}
