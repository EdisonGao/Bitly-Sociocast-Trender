package Core;

public class Link implements Comparable<Link>{
	String link;
	double relevancy;
	
	Link(String link, double relevancy){
		this.link = link;
		this.relevancy = relevancy;
	}
	
	@Override
	public int compareTo(Link o) {
			double result = this.relevancy - o.relevancy;
			if (result < 0) return -1;
			else if(result == 0) return 0;
			else return 1;
		
	}
}
