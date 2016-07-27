package org.jm.utils.testing;
import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests_org_jm_utils {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.jm.utils");
		//$JUnit-BEGIN$
		suite.addTestSuite(BitMaskImmutableTest.class);
		suite.addTestSuite(BitMaskTest.class);
		//$JUnit-END$
		return suite;
	}
}
