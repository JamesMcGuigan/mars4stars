package mars4stars.testing;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.jm.utils.*;
import org.jm.utils.testing.*;

/** 
 * Junit TestSuite for testing classes in the mars4stars and org.jm.utils packages 
 * 
 * <br><br>Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */
public class AllTests_mars4stars {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for mars4stars.testing");
		//$JUnit-BEGIN$
		suite.addTestSuite(DesignBattleStubTest.class);
		suite.addTestSuite(ShipTypeTest.class);
		suite.addTestSuite(StackBattleStubTest.class);
		suite.addTestSuite(RaceBattleStubTest.class);
		suite.addTestSuite(GridTest.class);
		suite.addTestSuite(GridSquareTest.class);		
		
		suite.addTestSuite(BitMaskImmutableTest.class);
		suite.addTestSuite(BitMaskTest.class);
		//$JUnit-END$
		return suite;
	}
}
