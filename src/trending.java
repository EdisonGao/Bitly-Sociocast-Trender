import java.net.*;
import java.util.Vector;
import java.io.*;

public class trending {
	String token = "d6e12270330220293ea0f23535e0109ea91eb7ee";
	private Vector<String> trendVec;
	public Vector<String> trend(String accessToken) throws IOException{
		trendVec = new Vector<String>();
		URL bitly = new URL("https://api-ssl.bitly.com/v3/realtime/hot_phrases?access_token=" + accessToken);

        URLConnection yc = bitly.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
        	trendVec.add(inputLine);
        in.close();
        return trendVec;
	}
	 
}



