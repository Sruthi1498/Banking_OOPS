package demo;

import java.util.Scanner;

public class Debit extends Account{

	Scanner scan = new Scanner(System.in);
	int db;
	public Debit(int amt) {
		super(amt);
		System.out.println("Withdrawl amount");
		db = scan.nextInt();
		int total = super.amount + db;
		System.out.println(total);
	}

	
}