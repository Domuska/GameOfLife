package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	String liveliness;
	private int x, y;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public Cell(String liveliness){		
		this.liveliness = liveliness;
	}
	
	public Cell(int x, int y){
		
		
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
