package edu.wpi.cs3733.entity;

/**
 * Caesar cipher; you must implement the cipher and the observer pattern
 */
public class CaesarCipher implements Observer {

	String text = "";

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
