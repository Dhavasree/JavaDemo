package com.cg.main;

public abstract class AbstractFactory {
		   abstract Quadrant getQuadrant(String quadType);
		   abstract Color getColor(String colorType) ;
}
