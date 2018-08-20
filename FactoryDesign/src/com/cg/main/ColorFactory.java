package com.cg.main;

public class ColorFactory {
	public Color getColor(String colorType){
	      if(colorType == null){
	         return null;
	      }		
	      if(colorType.equalsIgnoreCase("Red")){
	         return new Red();
	         
	      } else if(colorType.equalsIgnoreCase("Blue")){
	         return new Blue();
	         
	      } else if(colorType.equalsIgnoreCase("Black")){
	         return new Black();
	      }
	      
	      return null;
	   }
}
