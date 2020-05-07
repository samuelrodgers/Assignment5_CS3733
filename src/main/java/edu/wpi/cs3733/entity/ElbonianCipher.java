package edu.wpi.cs3733.entity;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {

	private String text = "";
	public void setText(String text){
		this.text = "changed";
	}

	public String getText(){
		return text;
	}

	@Override
	public void notify(Object object){
		this.setText(String.valueOf(object));
	}
}
