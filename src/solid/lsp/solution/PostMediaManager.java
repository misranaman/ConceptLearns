package solid.lsp.solution;

public interface PostMediaManager {

	// @support facebook, instagram
	void publishPost(Object post);

	// @support whatsapp, facebook, instagram
	void sendPhotoAndVideo();

}
