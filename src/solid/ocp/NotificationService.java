package solid.ocp;

public interface NotificationService {

	void sendOtp(String medium);

	void sendTransactionReport();
	
	/* OPEN CLOSE PRINCIPLE states that according to new requirement the module should be open for extension but closed for modification.
	 * For example a notification interface can be implemented to different notification classes*/

}
