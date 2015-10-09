package org.unioulu.tol.sqatlab.gameoflife;

import java.util.HashSet;
import java.util.Set;

public class Grid {

	private Set<Cell> cells = new HashSet<>();
	
	public Grid(int size){
		
		
	}

	public void addCell(Cell cell) {
		
		cells.add(cell);
	}

	public Object getNumberOfCellsNeighbors(Cell cell) {
		
		Set<Cell> neighbors = new HashSet<Cell>();
		
		int numberOfNeighbors = 0;
		
		for(int i = -1; i <= 1 ; i++){
			
			Cell neighbor = new Cell(cell.getX(), cell.getY() +1);
			
			if(cells.contains(neighbor)){
				
				numberOfNeighbors ++;
			}
		}
		
		return 0; 
	}
	
}
