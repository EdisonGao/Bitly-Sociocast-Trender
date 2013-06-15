package Core;
import java.util.HashMap;
import java.util.Iterator;




public class Data implements Iterable<String> {
	public String link;
	public HashMap<String, Double> weights = new HashMap<String,Double>();
	
	Iterable<String> iter(){
		return weights.keySet();
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return weights.keySet().iterator();
	}
	
	public Double get(String key){
		return weights.get(key);
	}


}
