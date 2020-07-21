package bankAccout;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BankAccount a = new BankAccount("John", "Doe", 10001);
		DebitCardAccount d = new DebitCardAccount("Jane", "Doe", 10002);
		CreditCardAccount c = new CreditCardAccount("Jane", "Doe", 10003);

		a.addMoney(500f);
		a.addMoney(500f);

		widthDrawMoney(a, 400);
		widthDrawMoney(a, 1200);

		d.addMoney(500f);

		widthDrawMoney(d, 300);
		widthDrawMoney(d, 1600);

		c.addMoney(500f);
		widthDrawMoney(c, 100);
		widthDrawMoney(c, 2400);

		ArrayList<BankAccount> accounts = new ArrayList<>();
		accounts.add(a);
		accounts.add(d);
		accounts.add(c);

		System.out.println("PRINTING all ACCOUNTS");
		for (BankAccount acc : accounts){
			acc.printAccountData();
			System.out.printf("%n%n%n");
		}
	}

	public static void widthDrawMoney(BankAccount account, float amount){
		try {
			account.widthDrawMoney(amount);
		} catch (BankAccountNegativeException e) {
			account.printAccountData();
			System.out.println(e.getMessage());
			System.out.printf("%n%n%n");
		}
	}
}
