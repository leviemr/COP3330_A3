public class SavingsAccountTest
{
	public static void main(String[] args) {
	//program SAT to test savingsaccount
	//Instantiate 2 savacc objs, saver1 and saver2 w balances
	SavingsAccount saver1 = new SavingsAccount(2000.00);
	SavingsAccount saver2 = new SavingsAccount(3000.00);
	
	//Set aIR to 4%, then calc the monthly interest for 12 months and print for both savers
	SavingsAccount.modifyInterestRate(4.0);
	System.out.printf("Month     S1     S2\n");
	
	int month = 1;
	
	while(month <= 12)
	{
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("Month %d ", month);
		saver1.displayBalance();
		System.out.printf("  ");
		saver2.displayBalance();
		System.out.printf("  \n");
		month++;
		
	}
	//set aIR to 5%, calc the next month's interest and print for both savers
	System.out.printf("-------------------------\n");
	System.out.printf("Month %d ", month);
	saver1.displayBalance();
	System.out.printf("  ");
	saver2.displayBalance();
	System.out.printf("  \n");

}
	
}

