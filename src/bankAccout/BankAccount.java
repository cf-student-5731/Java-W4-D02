package bankAccout;

import java.util.ArrayList;

public class BankAccount {
	private String firstName, lastName;
	private int number;
	private float balance;
	private float limit = 0;
	final ArrayList<History> history = new ArrayList<>();

	public BankAccount(String firstName, String lastName, int number) {
		setFirstName(firstName);
		setLastName(lastName);
		setNumber(number);
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setNumber(int number) {
		this.number = number;
	}


	public void setLimit(float limit) {
		this.limit = limit;
	}

	public void addMoney(float amount){
		this.balance += amount;
		history.add(new History(amount, true));
	}

	public void widthDrawMoney(float amount) throws BankAccountNegativeException{
		if(this.balance - amount < this.limit){
			history.add(new History(-amount, false));
			throw new BankAccountNegativeException("Bank account would be below credit limit! Transaction cancelled!");
		}
		else{
			this.balance -= amount;
			history.add(new History(-amount, true));
		}
	}

	public void printAccountData(){
		String pattern = "%-13s%-13s%13s%n";
		System.out.printf(pattern, "Firstname", "Lastname", "Accountnumber");
		System.out.printf(pattern, this.firstName, this.lastName, this.number);
		System.out.println("---------------------------------------");
		for (History h : this.history){
			System.out.printf("%-23s%16s%n", h.getDate(), h.getTransaction());
		}
		System.out.printf("%-23s%16.2f%n", "BALANCE: ", this.balance);
	}
}
