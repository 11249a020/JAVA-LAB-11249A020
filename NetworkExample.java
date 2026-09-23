import java.net.*;
import java.io.*;

public class NetworkExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://example.com");

            URLConnection connection = url.openConnection();

            BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
            );

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}