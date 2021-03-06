package demo;

import java.lang.management.OperatingSystemMXBean;
import java.util.*;

public class Withdraw extends Account{
	Scanner scan = new Scanner(System.in);
	int wth;
	public Withdraw(int amt) {
		super(amt);
		System.out.println("Withdrawl amount");
		wth = scan.nextInt();
		int total = super.amount - wth;
		System.out.println(total);
	}

	

}
