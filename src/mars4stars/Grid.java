package mars4stars;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Implements the battle grid. It initalizies, holds and gives access to a 
 * 2 dimentional array of GridSquares.
 * <br>
 * <br>
 * Copyright (C) 2004 - Licenced under the GNU GPL
 * 
 * @author James McGuigan
 */
public class Grid {
  private int sizeX;
  private int sizeY;
  //private int sizeZ; // not needed
  private List gridSquares = new ArrayList();

  /**
   * Creates a new Grid. It will create a 2 dimentional array of GridSquares of 
   * SizeX by SizeY.
   * 
   * @param sizeX  the horizontal size of the Grid
   * @param sizeY  the vertical   size of the Grid
   */
  public Grid(int sizeX, int sizeY) {
  	super();
	this.sizeX = sizeX;
	this.sizeY = sizeY;

	//	create a multidimentional array of GridSquares 
	for(int x=0;x<sizeX;x++) {
		gridSquares.add(new ArrayList()); 		
		for(int y=0;y<sizeY;y++) {
			ArrayList gridRow = (ArrayList) gridSquares.get(x);
			gridRow.add(new GridSquare(x,y,this));
		}
	}
  }
   
  /**
   * Returns the GridSquare at the specified cordinates  
   * @param x X cordinate of the square
   * @param y Y cordinate of the square
   * @return
   */
  public GridSquare getSquare (int x, int y)  {
    // test for out of bounds
    if(x < 0 || x >= this.sizeX || y < 0 || y >= this.sizeY) {
        Log.error(this, "Grid.GridSquare(x,y) out of bounds");
        return null;
    }
        
    return (GridSquare) ((ArrayList)gridSquares.get(x)).get(y);
  }
  
  /**
   * Returns the distance between the two grid squares
   * @param aGridSquare1
   * @param aGridSquare2
   * @return
   */
  public int getDistance ( GridSquare aGridSquare1, GridSquare aGridSquare2) {
  	if(aGridSquare1 == null || aGridSquare2 == null) {
  	    Log.error(this, "Grid.getDistance() using a null GridSquare");
  	    return 0x00ffffff; 	// high enough to keep it out of range for most equasions 
  	    					// but not MAX_INT to prevent an overflow to negitive 
  	    					// if used in addition or multiplication   
  	}
     
  	// this is distance based on the stars grid model - diagonals ar counted as adjecent
    int xDistance = Math.abs(aGridSquare1.getX() - aGridSquare2.getX());
	int yDistance = Math.abs(aGridSquare1.getY() - aGridSquare2.getY());
	int Distance  = Math.max(xDistance, yDistance);
	return Distance;
  }
    
  /**
   * Returns an ArrayList of GridSquares within distance of gridSquare
   * @param distance     range, in squares, to search
   * @param gridSquare   square to start searching from
   * @return             ArrayList of GridSquares
   */ 
  public ArrayList getGridSquaresWithin ( int distance, GridSquare gridSquare) {
     if(gridSquare == null) {
         Log.error(this, "Grid.getGridSquaresWithin() using null gridSquare reference");
         return new ArrayList(); // an empty array
     }
      
    int maxX = Math.min(gridSquare.getX() + distance, this.sizeX);
    int minX = Math.max(gridSquare.getX() - distance, 0);
	int maxY = Math.min(gridSquare.getY() + distance, this.sizeY);
    int minY = Math.max(gridSquare.getY() - distance, 0);
	ArrayList inRange = new ArrayList();
    for (int x=minX;x<=maxX;x++)
    	for (int y=minY;y<=maxY;y++)
    		inRange.add(this.getSquare(x,y));
    
    return inRange;	
  }
  
  
  public void loadStacks (Collection stacks, GridSquare square) {
      ArrayList stackList = new ArrayList(stacks);
      for(int i=0,n=stackList.size(); i<n; i++) {
          square.loadStack((StackBattleStub)stackList.get(i));
      }     
  }

}

