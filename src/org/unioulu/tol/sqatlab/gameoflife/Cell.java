package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	String liveliness;
	
	public Cell(String liveliness){		
		this.liveliness = liveliness;
	}

	public void nextIteration() {
		
		
	}

	public String getState() {
		
		return liveliness;
	}
}
