package utils;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 *
 * @author mamuns
 */
public class SMS_Mobile {

    public static void main(String args[]) {
        try {
            String recipient = "01553120188";
            String message = "Hello World";
            String username = "admin";
            String password = "abc123";
            String originator = "01738203209";

            String requestUrl = "http://127.0.0.1:9501/api?action=sendmessage&"
                    + "username=" + URLEncoder.encode(username, "UTF-8")
                    + "&password=" + URLEncoder.encode(password, "UTF-8")
                    + "&recipient=" + URLEncoder.encode(recipient, "UTF-8")
                    + "&messagetype=SMS:TEXT"
                    + "&messagedata=" + URLEncoder.encode(message, "UTF-8")
                    + "&originator=" + URLEncoder.encode(originator, "UTF-8")
                    + "&serviceprovider=GSMModem1"
                    + "&responseformat=html";

            URL url = new URL(requestUrl);
            HttpURLConnection uc = (HttpURLConnection) url.openConnection();

            System.out.println(uc.getResponseMessage());

            uc.disconnect();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }
}
