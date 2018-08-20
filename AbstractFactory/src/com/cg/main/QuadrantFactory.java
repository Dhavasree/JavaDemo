package com.cg.main;

public class QuadrantFactory extends AbstractFactory{

	@Override
	Quadrant getQuadrant(String quadType) {
		if(quadType == null){
			return null;
		}		

		if(quadType.equalsIgnoreCase("first")){
			return new First();

		}else if(quadType.equalsIgnoreCase("second")){
			return new Second();

		}else if(quadType.equalsIgnoreCase("third")){
			return new Third();
		}

		return null;
	}

	@Override
	Color getColor(String colorType) {

		return null;
	}

}
