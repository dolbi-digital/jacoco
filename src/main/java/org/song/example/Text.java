package org.song.example;

public class Text {
	public String reverse(String text){
		return new StringBuilder(text).reverse().toString();
	}
	
	public String toUpperCase(String text){
		return text.toUpperCase();
	}
	
	public String toLowerCase(String text){
		return text.toLowerCase();
	}
}
