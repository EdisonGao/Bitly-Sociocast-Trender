package Core;

public class Link {
	String link;
	double relevancy;
	
	Link(String link, double relevancy){
		this.link = link;
		this.relevancy = relevancy;
	}
	
	
	static int cmp(Link l1, Link l2){
		return (int) (l1.relevancy - l2.relevancy);
	}
}
