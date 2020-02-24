
class SavingsAccount
{
	//Create class savings account with static variable aIR to store for all account holders
	//Each obj contains private instance savbal 
	public static double annualInterestRate = 0.0;
	private double savingsBalance = 0;
	
	//method calcmonint to calc monthly interest by multiplying savbal by aIR div by 12
	public void calculateMonthlyInterest()
	{
		double interest = 0;
		interest = (this.savingsBalance * (annualInterestRate / 100)) / 12;
		//this interest rate should be added to savbal
		this.savingsBalance = this.savingsBalance + interest;
	}
	public void displayBalance()
	{
		System.out.printf("%.2f", this.savingsBalance);
	}
	public static void modifyInterestRate(double newAnnualInterestRate)
	{
		//provide static method modintrate that sets the aIR to a new value
		annualInterestRate = newAnnualInterestRate;
	}
	//Auto generated constructer because I need one to pass the savings account balance ?
	public SavingsAccount(double sb) {
		this.savingsBalance = sb;
	}
	}
