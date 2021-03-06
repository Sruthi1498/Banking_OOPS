package demo;

import java.util.*;
import java.io.*;

public class Main {
 
	public static void main(String[] args) {
		
	User user;
	Scanner scan = new Scanner(System.in);
	
	String Uname;
	int Uid;
	int choice;
	int amt;
	do {
        System.out.println("1. Login");
        System.out.println("2. Withdraw or debit");
        System.out.println("3. Gold rate");
        System.out.println("4. Loan");
        
        choice = scan.nextInt();
        switch(choice)
        {
        case 1:
        	System.out.println("Username");
        	Uname = scan.next();
        	System.out.println("Uid");
        	Uid = scan.nextInt();
        	User u  = new User(Uname, Uid);
        	u.get_name(Uname);
        	u.get_id(Uid);
        	break;
        	
        case 2:
        	System.out.println("Available balance:");
        	amt = scan.nextInt();
        	System.out.println("1. Withdraw");
        	System.out.println("2. Debit");
        	int ch = scan.nextInt();
        	if(ch==1)
        	{
        		Account a = new Account(amt);
        	
        		Withdraw w = new Withdraw(amt);
        	}
        	else
        	{
        		Account a = new Account(amt);
        	
        		Debit d= new Debit(amt);
        	}
        	break;
        	
        case 3:
        	Gold_rate g = new Gold_rate();
        	Gold_rate.Info();
        	g = new Silver();
        	g.Info();
        	break;
        	
        case 4:
        	System.out.println("Available balance:");
        	amt = scan.nextInt();
        	Loan lo = new Loan();
        	lo.loan_amt(amt);
        	break;
        }
}while(choice<2);
}
}