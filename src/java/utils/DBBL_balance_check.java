
package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import static javax.ws.rs.core.HttpHeaders.USER_AGENT;

/**
 *
 * @author mamuns
 */
public class DBBL_balance_check {
    
    // HTTP GET request
    public String sendGet(int txnid) throws Exception {

        //String url = "http://www.google.com/search?q=mkyong";
        String shortcode, Ref_No, Amount, Txn_date, error_code, error_msg;
        String[] all_Data = null;

        String url = "http://103.11.136.153/BillPayGWT/BillInfoService?shortcode=555&userid=cfdgc101&password=e43dft4vdytrtht&opcode=GT&txnid="+txnid+"";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET"); // optional default is GET
        con.setRequestProperty("User-Agent", USER_AGENT); //add request header

        int responseCode = con.getResponseCode();
        //System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);  //200 means "OK"

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        //System.out.println(response.toString());
        
        
        all_Data = response.toString().split("\\|");  //Response theke | separated value ke niye nilam
 
        if (all_Data.length == 4) {
            shortcode = all_Data[0]; //
            Ref_No = all_Data[1];
            Amount = all_Data[2];
            Txn_date = all_Data[3];
            return Amount;

        } else if (all_Data.length == 2) {
            error_code = all_Data[0];
            error_msg = all_Data[1];
            return error_msg;

        }
        else{
            System.out.println("There Something wrong .......");
            return "Problem";
        }

    }
    
}
