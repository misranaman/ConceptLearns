package interview_asks.companies.greyorange;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class CheckLinksIn {

    public static void main(String[] args) {
        // List of URLs to check
        List<String> urls = List.of(
                "https://www.google.com",
                "https://www.github.com",
                "https://www.invalidurl-test.com"
        );

        for (String url : urls) {
            checkURL(url);
        }
    }

    private static void checkURL(String urlString) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD"); // faster than GET
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println(urlString + " ✅ 200 OK");
            } else {
                System.out.println(urlString + " ❌ " + responseCode);
            }

        } catch (IOException e) {
            System.out.println(urlString + " ⚠️ Error: " + e.getMessage());
        }
    }
}
