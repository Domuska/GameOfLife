package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {

	@Test
	public void testLiveCellWithNoNeighborsShouldDie() {
		
		//arrange
		Cell cell = new Cell("Alive");
		
		cell.nextIteration(0);
		
		assertEquals("Dead", cell.getState());
	}
	
	
	@Test
	public void testLiveCellWithNeighborsShouldLive(){
		
		Cell cell = new Cell("Alive");
		
		cell.nextIteration();
		
		assertEquals("Alive", cell.getState());
	}

}
