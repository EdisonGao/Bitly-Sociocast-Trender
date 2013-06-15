package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Core.Controller;

public class GUI implements ActionListener{
	
	Controller c;
	public GUI(Controller c){
		this.c = c;
	}
	
	private void update(){
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		this.update();
	}
}
