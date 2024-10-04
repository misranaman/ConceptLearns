package solid.isp;

public interface UpiPayment {

	/*INTERFACE SEGREGATION PRINCIPLE. Split large interfaces in smaller ones to avoid unused implementation*/
	
	void payMoney();

	void getScratchCard();
}
