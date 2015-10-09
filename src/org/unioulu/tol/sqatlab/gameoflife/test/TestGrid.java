package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class TestGrid {

	@Test
	public void testSingleCellOnGridNoNeighbors() {
		Grid grid = new Grid(1);
		Cell cell = new Cell(0, 0);
		grid.addCell(cell);
		
		assertEquals(0, grid.getNumberOfCellsNeighbors(cell));
	}
	
	@Test
	public void testTwoCellsOnGridWithOneNeighborBoth(){
		
		Cell cellOne = new Cell(0,0);
		Cell cellTwo = new Cell(0,1);
		Grid grid = new Grid(2);
		
		grid.addCell(cellOne);
		grid.addCell(cellTwo);
		
		assertEquals(1, grid.getNumberOfCellsNeighbors(cellOne));
		assertEquals(1, grid.getNumberOfCellsNeighbors(cellTwo));
	}
	
	@Test
	public void testFourCellsOnGridWithThreeNeighborsAll(){
		
		Cell cellOne = new Cell(0,0);
		Cell cellTwo = new Cell(0,1);
		Cell cellThree = new Cell(1,0);
		Cell cellFour = new Cell(1,1);
		
		Grid grid = new Grid(2);
		
		grid.addCell(cellOne);
		grid.addCell(cellTwo);
		grid.addCell(cellThree);
		grid.addCell(cellFour);
		
		assertEquals(3, grid.getNumberOfCellsNeighbors(cellThree));
		
	}
	
	@Test
	public void testUpdatingAllCells(){
		
		Cell cellOne = new Cell(0,0);
		Cell cellTwo = new Cell(0,1);
		Cell cellThree = new Cell(1,0);
		Cell cellFour = new Cell(1,1);
		
		Grid grid = new Grid(2);
		
		grid.addCell(cellOne);
		grid.addCell(cellTwo);
		grid.addCell(cellThree);
		grid.addCell(cellFour);
		
		
	}

}
