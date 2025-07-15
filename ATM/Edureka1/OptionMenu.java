package Edureka1;

import java.io.IOException;
  

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner menuInput = new Scanner(System.in);
	 DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	 
	HashMap<Integer, Integer> data =  new HashMap<Integer,Integer>();
	int selection ;
	/* Valid login in information customer number and pin number */
	public void getLogin() throws IOException{
		int x =1;
		do {
			try {
				data.put(591, 1431);
				data.put(592, 1432);
				
				System.out.println("Welcome to the ATM Project");
				
				System.out.println("Enter the Customer Number : ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter the Password : ");
				setPinNumber(menuInput.nextInt());
			}
			catch(Exception e) {
				System.out.println("Invalid characters .Only Numbers ");
				x = 2;
			}
			for(Map.Entry<Integer, Integer> entry : data.entrySet()) {
			if(entry.getKey()== getCustomerNumber() && entry.getValue() == getPinNumber()) {
				getAccountType();
				}
			}
		System.out.println("Wrong Customer or Pin Number.");
	} while( x == 1);

}

public void getAccountType() {
	System.out.println("Select the Account you want to access: ");
	System.out.println("Type1 - Checking Account");
	System.out.println("Type2 - Saving Account");
	System.out.println("Type3 - Exit");
	System.out.println("Choice: ");
	
	selection = menuInput.nextInt();
	
	switch(selection) {
	case 1:
		getChecking();
		break;
	
	case 2:
		getSaving();
		break;
	
	case 3:
		System.out.println("Thank You for using this ATM, bye.");
		break;
		
	default:
		System.out.println("Invalid Choice");
		
	}
}
	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("Type1 - View Balance");
		System.out.println("Type2 - Withdraw Funds");
		System.out.println("Type3 - Deposit Funds");
		System.out.println("Type4 - Exit");
		System.out.println("Choice: ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Checking Account Balance : " +moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thankyou for using this ATM,bye.");
			break;
			
		default:
			System.out.println("Invalid Choice");
			getChecking();
		}
	}
	public void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println("Type1 - View Balance");
		System.out.println("Type2 - Withdraw Funds");
		System.out.println("Type3 - Deposit Funds");
		System.out.println("Type4 - Exit");
		System.out.println("Choice: ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Saving Account Balance : " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thankyou for using this ATM,bye.");
			break;
			
		default:
			System.out.println("Invalid Choice");
			getSaving();
		}
	
}
}