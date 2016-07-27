package mars4stars.testing;

import junit.framework.TestCase;
import java.util.*;
import mars4stars.*;

/** 
 * Junit TestCase for the class GridSquare
 * 
 * <br><br>Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */
public class GridSquareTest extends TestCase {
    protected Universe uni = new Universe();
    
    public final void testGridSquare() {
        GridSquare testGridSquare = new GridSquare(1,2,uni.grid);
        assertNotNull(testGridSquare);

        assertEquals(new Integer(1), Accessor.getPrivateField(testGridSquare,"x"));
        assertEquals(new Integer(2), Accessor.getPrivateField(testGridSquare,"y"));
        assertEquals(uni.grid, Accessor.getPrivateField(testGridSquare,"grid"));        
    }

    public final void testGetGrid() {
        assertEquals(uni.testGrid, uni.testGridSquare.getGrid());        
    }

    public final void testGetFleets() {        
        assertEquals(Collections.singletonList(uni.testStack2a), uni.testGridSquare.getFleets());
        assertEquals(Collections.singletonList(uni.testStack1), uni.grid.getSquare(1,5).getFleets());
        assertEquals(Collections.singletonList(uni.testStack2), uni.grid.getSquare(9,5).getFleets());
    }

    public final void testGetX() {
        assertEquals(3, uni.testGridSquare.getX());
        assertEquals(1, uni.grid.getSquare(1,5).getX());
        assertEquals(9, uni.grid.getSquare(9,5).getX());
    }

    public final void testGetY() {
        assertEquals(4, uni.testGridSquare.getY());
        assertEquals(5, uni.grid.getSquare(1,5).getY());
        assertEquals(5, uni.grid.getSquare(9,5).getY());
    }

    public final void testGetDistance() {
        // test x distance
        assertEquals(8, uni.grid.getSquare(1,5).getDistance(uni.grid.getSquare(9,5)));
        // test y distance
        assertEquals(1, uni.grid.getSquare(5,1).getDistance(uni.grid.getSquare(5,2)));
        // test negitives
        assertEquals(2, uni.grid.getSquare(2,3).getDistance(uni.grid.getSquare(0,2)));
        assertEquals(7, uni.grid.getSquare(2,9).getDistance(uni.grid.getSquare(1,2)));      
        // test equals
        assertEquals(0, uni.grid.getSquare(5,5).getDistance(uni.grid.getSquare(5,5)));
    }

    public final void testMoveStack() {
        uni.grid.getSquare(1,5).moveStack(uni.testStack1, uni.grid.getSquare(2,4));
        assertEquals(Collections.singletonList(uni.testStack1), uni.grid.getSquare(2,4).getFleets());
        assertEquals(uni.grid.getSquare(2,4), uni.testStack1.getGridSquare());

        // move second stack to the same square
        // note will log an error for moving more than one square
        	Log.ignore(1, "GridSquare.movestack() moving stack greater than one square");
        uni.grid.getSquare(9,5).moveStack(uni.testStack2, uni.grid.getSquare(2,4));
        ArrayList expectedList = new ArrayList();
        	expectedList.add(uni.testStack1);
        	expectedList.add(uni.testStack2);
        assertEquals(expectedList, uni.grid.getSquare(2,4).getFleets());
        assertEquals(uni.grid.getSquare(2,4), uni.testStack1.getGridSquare());
        assertEquals(uni.grid.getSquare(2,4), uni.testStack2.getGridSquare());
       
        // check that the function has moved the correct stack
        uni.grid.getSquare(2,4).moveStack(uni.testStack1, uni.grid.getSquare(2,3));
        assertEquals(Collections.singletonList(uni.testStack1), uni.grid.getSquare(2,3).getFleets());
        assertEquals(Collections.singletonList(uni.testStack2), uni.grid.getSquare(2,4).getFleets());
        assertEquals(uni.grid.getSquare(2,3), uni.testStack1.getGridSquare());
        assertEquals(uni.grid.getSquare(2,4), uni.testStack2.getGridSquare());            
    }

    public final void testMoveStackMoveFromNullSquareBug() {
        // bug = GridSquare.moveStack would throw exception if Stack.gridSquare == null   
        
        // confirm test is setup correctly - will throw logged error
        assertEquals(null, uni.testStack2b.getGridSquare());
        Log.ignore(1, "GridSquare.movestack() moving an uninitalized StackBattleStub");
        
        uni.grid.getSquare(1,5).moveStack(uni.testStack2b, uni.grid.getSquare(2,4));        
        assertEquals(Collections.singletonList(uni.testStack2b), uni.grid.getSquare(2,4).getFleets());
        assertEquals(uni.grid.getSquare(2,4), uni.testStack2b.getGridSquare());
    }
}

