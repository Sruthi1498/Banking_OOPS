package demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Gold_rate {
	public static void Info() {

        try {

            URI uri;
            uri = new URI("https://www.google.com/search?client=firefox-b-d&q=gold+rate+today");
            java.awt.Desktop.getDesktop().browse(uri);

        } catch (IOException | URISyntaxException e) {
        }
    }

}

class Silver extends Gold_rate {

    public static void Info() {
        try {

            URI uri;
            uri = new URI("https://www.goodreturns.in/silver-rates/");

            java.awt.Desktop.getDesktop().browse(uri);
            System.out.println("Web page opened in browser");

        } catch (IOException | URISyntaxException e) {
        }
    }
}



