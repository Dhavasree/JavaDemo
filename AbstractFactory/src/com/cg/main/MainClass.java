package com.cg.main;

public class MainClass {

	public static void main(String[] args) {
		 AbstractFactory quadFactory = Factory1.getFactory("QUADRANT");
	     Quadrant quad1 = quadFactory.getQuadrant("first");
	      quad1.display();
	      Quadrant quad2 = quadFactory.getQuadrant("second");
	      quad2.display();
	      Quadrant quad3 = quadFactory.getQuadrant("third");
	      quad3.display();
	      
	      AbstractFactory colorFactory = Factory1.getFactory("COLOR");
	      Color color1 = colorFactory.getColor("brown");
	      color1.apply();
	      Color color2 = colorFactory.getColor("white");
	      color2.apply();
	      Color color3 = colorFactory.getColor("orange");
	      color3.apply();
	   }

	}


