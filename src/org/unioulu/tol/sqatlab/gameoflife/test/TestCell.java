package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {

	@Test
	public void testLiveCellWithNoNeighborsShouldDie() {
		
		//arrange
		Cell cell = new Cell("Alive", 0,0);
		
		cell.nextIteration(0);
		
		assertEquals("Dead", cell.getLiveliness());
	}
	
	
	@Test
	public void testLiveCellWithTwoNeighborsShouldLive(){
		
		Cell cell = new Cell("Alive", 0,0);
		
		cell.nextIteration(2);
		
		assertEquals("Alive", cell.getLiveliness());
	}
	
	@Test
	public void testLiveCellWithFourNeighborsShouldDie(){
		
		Cell cell = new Cell("Alive", 0,0);
		
		cell.nextIteration(4);
		
		assertEquals("Dead", cell.getLiveliness());
	}
	
	
	
	
	@Test
	public void testDeadCellWithThreeNeighborsShouldBecomeAlive(){
		
		Cell cell = new Cell("Dead", 0,0);
		
		cell.nextIteration(3);
		
		assertEquals("Alive", cell.getLiveliness());
	}

}
