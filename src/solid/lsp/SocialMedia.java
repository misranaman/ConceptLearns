package solid.lsp;

public abstract class SocialMedia {

	/*LISKOVS SUBSTITUTION PRINCIPLE
	 * It applies to inheritance in such a way that the derived classes must be
	 * completely substitutable for their base classes. Example if A is extending B
	 * then we should be able to replace B with A without interrupting the current
	 * behaviour of the program
	 */

	//@support whatsapp, facebook,instagram
	public abstract void chatWithFriends();

	//@support facebook, instagram
	public abstract void publishPost(Object post);
	
	//@support whatsapp, facebook, instagram
	public abstract void sendPhotoAndVideo();

	//@support whatsapp, facebook
	public abstract void groupVideoCall(String... users);

}
