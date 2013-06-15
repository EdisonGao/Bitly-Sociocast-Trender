package Core;

import java.util.LinkedList;

class CategoryData implements Comparable<CategoryData> {
	LinkedList<Link> links = new LinkedList<Link>();
	double importance = 0.0;
	String name;
	CategoryData parent;
	LinkedList<CategoryData> children = new LinkedList<CategoryData>();
	
	CategoryData(String name){
		this.name = name;
	}
	
	void setParent(CategoryData parent){
		this.parent = parent;
		parent.addChild(this);
	}
	
	void addChild(CategoryData child){
		this.children.add(child);
	}
		
	void add(Link link) {
		links.add(link);
		importance+= link.relevancy;
	}

	@Override
	public int compareTo(CategoryData o) {
		double result = this.importance - o.importance;
		if (result < 0) return -1;
		else if(result == 0) return 0;
		else return 1;
	}
	
}
