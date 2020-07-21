package bankAccout;

public class CreditCardAccount extends BankAccount{
	private float limit = -3500f;
	public CreditCardAccount(String firstName, String lastName, int number) {
		super(firstName, lastName, number);
		super.setLimit(this.limit);
	}
}
