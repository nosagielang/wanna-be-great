import java.util.Scanner;

public class part2 {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		double l = 0;
		double i = 0;
		double mp = 0;
		double bal = 0;
		int trm;
		
		/** Enter Loan Details **/
		
		System.out.printf("Enter the loan amount: ");
		l = keyboard.nextDouble();
		
		System.out.printf("Enter the interest rate on the loan: ");
		i = keyboard.nextDouble();
		
		System.out.printf("Enter the term (in years) for the loan payment: ");
		trm = keyboard.nextInt();
		
		System.out.printf("\n================================================================\n");
		keyboard.close();
		
		/** Print Bank Receipt **/
		
		mp = calculatePayment(l, i, trm);
		bal = -(mp * (trm * 12));
		System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank:", bal);
		System.out.format("%-30s$%-10.2f%n", "Minimum monthly payment:", mp);
	}

	/** Calculate Loan Details **/
	
	public static double calculatePayment(double l, double i, int trm) {
		double rate = (i / 100) / 12;
		double base = (rate + 1);
		int months = trm * 12;
		double result = 0.0;
		result = l * (rate * (Math.pow(base, months)) / ((Math.pow(base, months)) - 1)); 
		
		return result;
	}
}
