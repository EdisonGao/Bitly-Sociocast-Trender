import com.rosaloves.bitlyj.*;

import static com.rosaloves.bitlyj.Bitly.*;

public class test {

	
	public static void main(String[] args){
		UrlClicks url = as("o_7h53qc7l66", "R_30b1af9c47025baa7225399bf53aa21c").call(clicks(" http://bit.ly/19DiAV6"));
		
		System.out.println(url.getUserClicks());
	}

}


