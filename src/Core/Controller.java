package Core;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import GUI.GUI;

public class Controller {
	
	CategoryHolder mapper;
	ArrayList<CategoryData> currentPopular = new ArrayList<CategoryData>();
	GUI g;
	
	Controller(){
		this.mapper = new CategoryHolder();
		g = new GUI(this);
	}
	
	
	
	LinkedList<Link> select(String name){
		for (CategoryData d: currentPopular){
			if (name.equals(d.name)) return d.links;
		}
		return null;
	}
	
	
	
}
