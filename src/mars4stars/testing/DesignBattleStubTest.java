package mars4stars.testing;

import junit.framework.TestCase;
import java.util.ArrayList;
import mars4stars.*;


/** 
 * Junit TestCase for the class DesignBattleStub
 * 
 * <br><br>Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */
public class DesignBattleStubTest extends TestCase {
	Universe uni = new Universe();
	
	public final void testDesignBattleStub() {
		assertNotNull(uni.testDesign1);
		assertEquals("Test Design",   Accessor.getPrivateField(uni.testDesign1, "name"));
		assertEquals(new Integer(50), Accessor.getPrivateField(uni.testDesign1, "shields"));
		assertEquals(new Integer(100),Accessor.getPrivateField(uni.testDesign1, "armour"));
		assertEquals(new Double(0.15),Accessor.getPrivateField(uni.testDesign1, "jamming"));
		assertEquals(new Double(0.3), Accessor.getPrivateField(uni.testDesign1, "compBonus"));
		assertEquals(new Integer(8),  Accessor.getPrivateField(uni.testDesign1, "init"));
		assertEquals(new Double(0.1), Accessor.getPrivateField(uni.testDesign1, "capBonus"));
		assertEquals(new Double(0.9), Accessor.getPrivateField(uni.testDesign1, "defBonus"));
		assertEquals(new Double(1.5),  Accessor.getPrivateField(uni.testDesign1,"battleSpeed"));
		assertEquals(new Integer(25), Accessor.getPrivateField(uni.testDesign1, "cost"));		
		assertEquals(uni.testRace1,   Accessor.getPrivateField(uni.testDesign1, "builtBy"));		
		assertEquals(uni.vTestSlots1, Accessor.getPrivateField(uni.testDesign1, "slots"));
		assertEquals((ShipType.FREIGHTER + ShipType.ARMED),
				((ShipType)Accessor.getPrivateField(uni.testDesign1, "shipType")).asInt());			
	}
	
	public final void testGetArmour() {
		assertEquals(100, uni.testDesign1.getArmour());
	}

	public final void testGetBuiltBy() {
		assertEquals(uni.testRace1, uni.testDesign1.getBuiltBy());
	}

	public final void testGetCapBonus() {
		assertEquals(new Double(0.1), new Double(uni.testDesign1.getCapBonus()));
	}

	public final void testGetDefBonus() {
		assertEquals(0.9, uni.testDesign1.getDefBonus(), Double.POSITIVE_INFINITY);
	}

	public final void testGetInit() {
		assertEquals(8, uni.testDesign1.getInit());
	}

	public final void testGetJamming() {
		assertEquals(0.15, uni.testDesign1.getJamming(), Double.POSITIVE_INFINITY);
	}

	public final void testGetName() {
		assertEquals("Test Design", uni.testDesign1.getName());
	}

	public final void testGetShields() {
		assertEquals(50, uni.testDesign1.getShields());
	}

	public final void testGetShipType() {
		assertEquals(ShipType.FREIGHTER + ShipType.ARMED, 
					 uni.testDesign1.getShipType().asInt());
	}

	public final void testGetSlots() {
		assertEquals(uni.vTestSlots1, uni.testDesign1.getSlots());
	}

	public final void testGetCompBonus() {
		assertEquals(10, uni.testDesign1.getCompBonus(), Double.POSITIVE_INFINITY);
	}

	public final void testGetCost() {
		assertEquals(25, uni.testDesign1.getCost());
	}
}
