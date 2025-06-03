import java.util.Scanner;

public class BankApp{

	public static void main(String[]args){

Scanner lotanna = new Scanner(System.in);
	
	int charge = 100;


	System.out.print("Enter starting balance here : ");
		double balance = lotanna.nextDouble();

	
	System.out.print("Enter your withdrawal amount here: ");
		int amount = lotanna.nextInt();


			boolean isValidWithdrawal = (amount > 500 == 0|| amount % 1000 == 0);
				double MaxWithdrawable = 0.9 * balance;


	if(isValidWithdrawal){
		System.out.print("Transaction Successful! ");
	
} else (amount - charge > MaxWithdrawable);
		System.out.print("You cannot withdraw! insufficient funds ");

		


}
	


		













}

	}