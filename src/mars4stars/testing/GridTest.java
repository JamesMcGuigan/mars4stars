package mars4stars.testing;

import junit.framework.TestCase;
import java.util.ArrayList;
import mars4stars.*;

/** 
 * Junit TestCase for the class Grid
 * 
 * <br><br>Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */
public class GridTest extends TestCase {
    protected Universe uni = new Universe();
    
    public final void testGrid() {
        Grid myGrid = new Grid(2,3);
        assertNotNull(myGrid);
        assertEquals(new Integer(2), Accessor.getPrivateField(myGrid, "sizeX"));
        assertEquals(new Integer(3), Accessor.getPrivateField(myGrid, "sizeY"));
        assertEquals(1, myGrid.getSquare(1,2).getX());
        assertEquals(2, myGrid.getSquare(1,2).getY());
        assertEquals(0, myGrid.getSquare(0,0).getX());
        assertEquals(0, myGrid.getSquare(0,0).getY());
    }

    public final void testGetSquare() {
        assertNotNull(uni.grid.getSquare(0,0));
        assertNotNull(uni.grid.getSquare(9,9));
        
        assertEquals(1, uni.grid.getSquare(1,9).getX());
        assertEquals(9, uni.grid.getSquare(1,9).getY());        
        assertEquals(0, uni.grid.getSquare(0,0).getX());
        assertEquals(0, uni.grid.getSquare(0,0).getY());        

        // test for out of bounds - will generate error
        Log.ignore(2, "Grid.GridSquare(x,y) out of bounds");
        assertNull(uni.grid.getSquare(-1,0));
        assertNull(uni.grid.getSquare(10,0));
    }

    public final void testGetDistance() {
        // test x distance
        assertEquals(8, uni.grid.getDistance(uni.grid.getSquare(1,5), uni.grid.getSquare(9,5)));
        // test y distance
        assertEquals(1, uni.grid.getDistance(uni.grid.getSquare(5,1), uni.grid.getSquare(5,2)));
        // test negitives
        assertEquals(2, uni.grid.getDistance(uni.grid.getSquare(2,3), uni.grid.getSquare(0,2)));
        assertEquals(7, uni.grid.getDistance(uni.grid.getSquare(2,9), uni.grid.getSquare(1,2)));       
        // test equals
        assertEquals(0, uni.grid.getDistance(uni.grid.getSquare(5,5), uni.grid.getSquare(5,5)));

        // test null does not throw exception - will generate error
        Log.ignore(2, "Grid.getDistance() using a null GridSquare");
        uni.grid.getDistance(null, uni.grid.getSquare(5,5));        
        uni.grid.getDistance(uni.grid.getSquare(5,5), null);
    }

    public final void testGetGridSquaresWithin() {
        ArrayList expectedList = new ArrayList();
        	expectedList.add(uni.grid.getSquare(1,1)); 
        	expectedList.add(uni.grid.getSquare(1,2));
        	expectedList.add(uni.grid.getSquare(1,3));
        	expectedList.add(uni.grid.getSquare(2,1)); 
        	expectedList.add(uni.grid.getSquare(2,2));
        	expectedList.add(uni.grid.getSquare(2,3));
        	expectedList.add(uni.grid.getSquare(3,1)); 
        	expectedList.add(uni.grid.getSquare(3,2));
        	expectedList.add(uni.grid.getSquare(3,3));
        assertEquals(expectedList,uni.grid.getGridSquaresWithin(1, uni.grid.getSquare(2,2)));	

        ArrayList expectedList2 = new ArrayList();
	        expectedList2.add(uni.grid.getSquare(0,0)); 
	        expectedList2.add(uni.grid.getSquare(0,1));
	        expectedList2.add(uni.grid.getSquare(1,0));
	        expectedList2.add(uni.grid.getSquare(1,1)); 
    	assertEquals(expectedList2,uni.grid.getGridSquaresWithin(1, uni.grid.getSquare(0,0)));	
    }

    public final void testLoadStacks() {
        ArrayList stacks = new ArrayList();
        	stacks.add(uni.testStack1);
        	stacks.add(uni.testStack2);
        	stacks.add(uni.testStack2a);
        	stacks.add(uni.testStack2b);
        // testStack1, testStack2, testStack2a, have already been initalized
        	Log.ignore(3, "GridSquare.loadstack() trying to load an already initalized StackBattleStub");
        uni.grid.loadStacks(stacks, uni.grid.getSquare(1,2));
        assertEquals(stacks, uni.grid.getSquare(1,2).getFleets());
    }

}

