package demo;

public class Loan implements Loan_Details{	

	@Override
	public void loan_amt(int amt) {
		int loan = (amt*10)/100;
		int total = loan*12;
		
		System.out.println("Eligible for loan amount " + total + " for 1 year");
		
	}
}
