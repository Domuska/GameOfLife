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

	public int getNumberOfCellsNeighbors(Cell cell) {
		
		//Set<Cell> neighbors = new HashSet<Cell>();
		
		int numberOfNeighbors = 0;
		
		for(int dx = -1; dx <= 1 ; dx++){
			
			for(int dy = -1; dy <= 1; dy++){
				
				Cell neighbor = new Cell("Alive", cell.getX()+dx, cell.getY() +dy);
				
				if(cells.contains(neighbor)){
					
					numberOfNeighbors ++;
				}
			}
				
		}
		
		return numberOfNeighbors-1;
	}

	public void tick() {
		
		for(int i = 0; i < cells.size(); i++){
			
			//TO BE IMPLEMENTED
		}
		
	}
	
	
	
}
