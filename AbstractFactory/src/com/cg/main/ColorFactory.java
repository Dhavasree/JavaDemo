package com.cg.main;

public class ColorFactory extends AbstractFactory {

	@Override
	Quadrant getQuadrant(String quadType) {
		return null;
	}

	@Override
	Color getColor(String colorType) {
		 if(colorType == null){
	         return null;
	      }		
	       if(colorType .equalsIgnoreCase("orange")){
	         return new Orange();
	         
	      }else if(colorType .equalsIgnoreCase("white")){
	         return new White();
	         
	      }else if(colorType .equalsIgnoreCase("brown")){
	         return new Brown();
	      }  
	      return null;
	}}