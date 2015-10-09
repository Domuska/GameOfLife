package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	String liveliness;
	
	public Cell(String liveliness){		
		this.liveliness = liveliness;
	}

	public void nextIteration(int liveNeighbors) {
		
		if(liveNeighbors < 2 && liveliness.equals("Alive")){
			
			liveliness = "Dead";
		}
		else{
			liveliness = "Alive";
		}
			
	}

	public String getState() {
		
		return liveliness;
	}
}
