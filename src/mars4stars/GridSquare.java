package mars4stars;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements an object to represent a GridSquare. It holds a list of Stacks at 
 * the location and gives a convienient way for a Stack to reference a location 
 * on the Grid. GridSquares are created and initalized through the the Grid class.
 *  
 * <br><br>Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */
public class GridSquare {
	protected int x;
	protected int y;
//	protected int z; 
	protected Grid grid;
	protected ArrayList fleets = new ArrayList();
  
	/**
	 * @param x
	 * @param y
	 * @param grid
	 */
	public GridSquare(int x, int y, Grid grid) {
		super();
		this.x = x;
		this.y = y;
		this.grid = grid;
	}
	
	/**
	 * @return Returns the grid.
	 */
	public Grid getGrid() {
		return grid;
	}
	/**
	 * @return Returns the fleets.
	 */
	public List getFleets() {
		return fleets;
	}
	/**
	 * @return Returns the x-coordinate.
	 */
	public int getX() {
		return x;
	}
	/**
	 * @return Returns the y-coordinate.
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Gets the distance between two grid squares
	 * @param otherSquare GridSquare to measure distance to 
	 * @return distance from this to GridSquare
	 */
	public int getDistance ( GridSquare otherSquare) {
	    return this.grid.getDistance(this, otherSquare);
	}	

	/**
	 * Moves a StackBattleStub to another GridSquare. Updates the references in
	 * both GridSquares and StackBattleStub. 
	 * @param stack  the StackBattleStub to move
	 * @param to     the GridSquare to move to
	 */
	public void moveStack(StackBattleStub stack, GridSquare to) {    
	    if(to == null) {
	        Log.error(this, "GridSquare.movestack() moving to a null GridSquare");
	        return;
	    }
	    if(stack.getGridSquare() == null) {
	        Log.error(this, "GridSquare.movestack() moving an uninitalized StackBattleStub");
	        to.loadStack(stack);
	    }
	    else {
		    if(this.getDistance(to) > 1) 
		        Log.error(this, "GridSquare.movestack() moving stack greater than one square");
		    if(stack.getGridSquare() != this && stack.getGridSquare() != to)
		        Log.error(this, "GridSquare.movestack() moving stack from square it is not currently at");
		   
        	this.fleets.remove(stack); 
            to.fleets.add(stack);        	
        	stack.move(to); // update references within StackBattleStub  
		    
//		    if(stack.getGridSquare() != to) {
//	        	stack.move(to); // update references within stack  
//	        }
//	        else { // function will get re-called from StackBattleStub.move()
//	        	this.fleets.remove(stack); 
//	            to.fleets.add(stack);        	
//	        }
	    }
	}

	/**
	 * Loads a StackBattleStub into a GridSquare. StackBattleStub should not already be assigned to a square. 
	 * @param stack the StackBattleStub to be moved.
	 */
	public void loadStack(StackBattleStub stack) {    
	    if(stack.getGridSquare() != null) 
	        Log.error(stack, "GridSquare.loadstack() trying to load an already initalized StackBattleStub");

	    this.fleets.add(stack);
	    stack.move(this);
	}

}

