/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		createCheckerBoardBeeper();
	
		/**
		* Collects puts beepers at intervals on a row
		*/
		private void createCheckerBoardBeeper() {
		while (frontIsClear()) {
		moveDouble();
		putBeeper();
		}
		private void moveDouble();
		move();
		move();
		}	
		
		private void createCheckerBoardBeeper() {
	}
		if (frontIsClear()) {
			putBeeper();
			move();
			move();
			putBeeper();
			move();
			move();
			putBeeper();
			move();
			move();
			putBeeper();
			move();
			turnLeft();
			move();
			turnLeft();
		}else 
			turnLeft();
			
		}
	}
