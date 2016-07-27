package mars4stars.testing;

import java.util.ArrayList;
import mars4stars.*;
import junit.framework.TestCase;

/**
 * Junit TestCase for class StackBattleStub
 * 
 * <br><br>Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */
public class StackBattleStubTest extends TestCase {
	Universe uni = new Universe();	
	
	public final void testStackBattleStub() {
		assertNotNull(uni.testStack1);
		assertNotNull(uni.testStack2);
	} 

	public final void testInitalizeValidTarget() {
		//TODO Implement InitalizeValidTarget().
	}

	public final void testRegenShields() {
		//TODO Implement regenShields().
	}

	public final void testWouldKill() {
		//TODO Implement wouldKill().
	}

	public final void testApplyDamage() {
		//TODO Implement applyDamage().
	}

	public final void testGetArmourDP() {
		// 100dp armour * 5 ships * 256/512 hull 
		assertEquals(100*10/2, uni.testStack1.getArmourDP());
		// 100dp armour * 1 ship
		assertEquals(100, uni.testStack2.getArmourDP());
	}

	public final void testGetArmourMaxDP() {
		// 100dp armour * 10 ships  
		assertEquals(100*10, uni.testStack1.getArmourMaxDP());
		// 100dp armour * 1 ship
		assertEquals(100, uni.testStack2.getArmourMaxDP());	
	}

	public final void testGetShieldDP() {
		// 50dp shields * 10 ships  
		assertEquals(50*10, uni.testStack1.getShieldDP());
		// 50dp shields * 1 ship
		assertEquals(50, uni.testStack2.getShieldDP());	
	}

	public final void testGetShieldMaxDP() {
		// 50dp shields * 10 ships  
		assertEquals(50*10, uni.testStack1.getShieldDP());
		// 50dp shields * 1 ship
		assertEquals(50, uni.testStack2.getShieldDP());
	}

	public final void testHasTakenArmourDamage() {
		assertEquals(false, uni.testStack1.hasTakenArmourDamage());
		assertEquals(false, uni.testStack2.hasTakenArmourDamage());
	}

	public final void testGetOwnerRace() {
		assertEquals(uni.testRace1, uni.testStack1.getOwnerRace());
		assertEquals(uni.testRace2, uni.testStack2.getOwnerRace());
	}

	public final void testGetShipCount() {
		assertEquals(10, uni.testStack1.getShipCount());
		assertEquals(1,  uni.testStack2.getShipCount());
	}

	public final void testGetValidTargets() {
		//TODO Implement getVValidTarget().
	}

}
