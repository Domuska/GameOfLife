package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {

	String liveliness;
	private int x, y;
	
	public Cell(String liveliness, int x, int y){
		this.liveliness = liveliness;
		this.x = x;
		this.y = y;
	}
	
	/*public Cell(String liveliness){		
		this.liveliness = liveliness;
	}
	
	public Cell(int x, int y){
		this.x = x;
		this.y = y;
		
	}*/

	public void nextIteration(int liveNeighbors) {
		
		if(liveliness.equals("Alive")){
		
			if(liveNeighbors <= 1 ){
				
				liveliness = "Dead";
			}
			else if(liveNeighbors > 3){
				
				liveliness = "Dead";
			}
			/*else{
				liveliness = "Alive";
			}*/
		}
		else if(liveliness.equals("Dead")){
			
			if( liveNeighbors == 3)
				liveliness = "Alive";
		}
			
		
			
	}

	public String getLiveliness() {
		
		return liveliness;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;		
	}
	
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
	
}
