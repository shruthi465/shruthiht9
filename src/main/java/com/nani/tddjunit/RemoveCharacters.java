package com.nani.tddjunit;

public class RemoveCharacters {

	public String remove(String string) {
		
			if(string.charAt(0)=='A' && string.charAt(1)!='A') {
				string=string.substring(1);
				
				/*char firstChar = string.charAt(1);
				char secondChar = string.charAt(2);
				char thirdChar=string.charAt(3);
				return "" +  firstChar + secondChar+ thirdChar;*/
				
			}
			else if(string.charAt(0)!='A' && string.charAt(1)=='A') {
				char firstChar = string.charAt(0);
				/*char secondChar = string.charAt(2);
				char thirdChar=string.charAt(3);*/
				
				return "" +  firstChar +string.substring(2);     //secondChar+ thirdChar;
			}
			else if(string.charAt(0)=='A'  &&  string.charAt(1)=='A') {
				/*char firstChar = string.charAt(2);
				char secondChar = string.charAt(3);
				return "" +  firstChar + secondChar;*/
				return "" + string.substring(2);
			}
			return string;
		}
		



}
