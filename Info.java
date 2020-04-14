package grocery;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

class Info {

    public static void Info1() {

        try {

            URI uri;
            uri = new URI("https://www.livechennai.com/Vegetable_price_chennai.asp");
            java.awt.Desktop.getDesktop().browse(uri);

        } catch (IOException | URISyntaxException e) {
        }
    }

}

class Potato extends Info {

    public static void Info1() {
        try {

            URI uri;
            uri = new URI("https://connect2india.com/commodities/agro/potato-market-price");

            java.awt.Desktop.getDesktop().browse(uri);
            System.out.println("Web page opened in browser");

        } catch (IOException | URISyntaxException e) {
        }
    }
}

class Tomato extends Info {

    public static void Info1() {
        try {

            URI uri;
            uri = new URI("https://dir.indiamart.com/chennai/tomato.html");

            java.awt.Desktop.getDesktop().browse(uri);
            System.out.println("Web page opened in browser");

        } catch (IOException | URISyntaxException e) {
        }
    }
}

class Onion extends Info {

    public static void Info1() {
        try {

            URI uri;
            uri = new URI("https://dir.indiamart.com/impcat/onion.html");

            java.awt.Desktop.getDesktop().browse(uri);
            System.out.println("Web page opened in browser");

        } catch (IOException | URISyntaxException e) {
        }
    }
}

class Ladies_finger extends Info {

    public static void Info1() {
        try {

            URI uri;
            uri = new URI("https://dir.indiamart.com/impcat/lady-finger.html");

            java.awt.Desktop.getDesktop().browse(uri);
            System.out.println("Web page opened in browser");

        } catch (IOException | URISyntaxException e) {
        }
    }
}

class Coconut extends Info {

    public static void Info1() {
        try {

            URI uri;
            uri = new URI("https://dir.indiamart.com/chennai/coconut.html");

            java.awt.Desktop.getDesktop().browse(uri);
            System.out.println("Web page opened in browser");

        } catch (IOException | URISyntaxException e) {
        }
    }
}
