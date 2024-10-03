package solid.dip;

public class ShoppingMall {

	private Cards card;

	public ShoppingMall(Cards card) {
		this.card = card;
	}

	public void doPurchase(long amount) {
		card.doTransaction(amount);
	}

	public static void main(String[] args) {
		
		Cards card = new DebitCard();
		ShoppingMall shoppingMall = new ShoppingMall(card);
		shoppingMall.doPurchase(3000);
	}

}
