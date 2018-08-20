package com.cg.main;

public class Factory1 {
	public static AbstractFactory getFactory(String choice){
		   
	      if(choice.equalsIgnoreCase("QUADRANT")){
	         return new QuadrantFactory();
	         
	      }else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
	      
	      return null;
	   }
	}

