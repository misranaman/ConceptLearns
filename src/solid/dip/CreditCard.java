package solid.dip;

public class CreditCard implements Cards {
	
	@Override
	public void doTransaction(long amount) {
		System.out.println("payment using credit card");
	}

}
