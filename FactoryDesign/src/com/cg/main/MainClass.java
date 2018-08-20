package com.cg.main;

public class MainClass {

	public static void main(String[] args) {
		ColorFactory colorFactory = new ColorFactory();
		Color color = colorFactory.getColor("Red");
		color.apply();
		Color color1 = colorFactory.getColor("Blue");
		color1.apply();
		Color color2 =colorFactory.getColor("Black");
		color2.apply();
		}
	}
