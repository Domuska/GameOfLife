package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class TestGrid {

	@Test
	public void test() {
		Grid grid = new Grid(1);
		Cell cell = new Cell("Alive", 0, 0);
		grid.addCell(cell);
		
		assertEquals(0, grid.getCellsNeighbors(0,0));
	}

}
