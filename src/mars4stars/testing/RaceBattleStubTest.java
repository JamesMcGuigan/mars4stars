package mars4stars.testing;

import java.util.Arrays;
import java.util.HashSet;
import junit.framework.TestCase;
import mars4stars.*;



/**
 * Junit TestCase for the class RaceBattleStub
 * 
 * <br><br>Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */
public class RaceBattleStubTest extends TestCase {
	Universe uni = new Universe();
    
    public final void testRaceBattleStub() {
        assertNotNull(uni.nullRace);
        assertEquals("Xindi", Accessor.getPrivateField(uni.xindi,"name"));         
//        assertEquals(raceSet, RaceBattleStub.getAllRaces());
    }

    public final void testIsFriend() {
        assertEquals(true,  uni.nullRace.isFriend(uni.nullRace));
        assertEquals(false, uni.nullRace.isFriend(uni.xindi));
        assertEquals(false, uni.nullRace.isFriend(uni.federation));
        assertEquals(false, uni.nullRace.isFriend(uni.tribbles));

        assertEquals(false, uni.xindi.isFriend(uni.nullRace));
        assertEquals(true,  uni.xindi.isFriend(uni.xindi));
        assertEquals(false, uni.xindi.isFriend(uni.federation));
        assertEquals(true,  uni.xindi.isFriend(uni.tribbles));

        assertEquals(false, uni.federation.isFriend(uni.nullRace));
        assertEquals(false, uni.federation.isFriend(uni.xindi));
        assertEquals(true,  uni.federation.isFriend(uni.federation));
        assertEquals(true,  uni.federation.isFriend(uni.tribbles));

        Log.ignore(1, "RaceBattleStub.notSpecified() alienRace not specified");
        assertEquals(false, uni.tribbles.isFriend(uni.nullRace));
        assertEquals(true,  uni.tribbles.isFriend(uni.xindi));
        assertEquals(true,  uni.tribbles.isFriend(uni.federation));
        assertEquals(true,  uni.tribbles.isFriend(uni.tribbles));
    }

    public final void testIsNeutral() {
        assertEquals(false, uni.nullRace.isNeutral(uni.nullRace));
        assertEquals(true, uni.nullRace.isNeutral(uni.xindi));
        assertEquals(true,  uni.nullRace.isNeutral(uni.federation));
        assertEquals(true, uni.nullRace.isNeutral(uni.tribbles));

        assertEquals(true,  uni.xindi.isNeutral(uni.nullRace));
        assertEquals(false, uni.xindi.isNeutral(uni.xindi));
        assertEquals(false, uni.xindi.isNeutral(uni.federation));
        assertEquals(false, uni.xindi.isNeutral(uni.tribbles));

        assertEquals(true,  uni.federation.isNeutral(uni.nullRace));
        assertEquals(false, uni.federation.isNeutral(uni.xindi));
        assertEquals(false, uni.federation.isNeutral(uni.federation));
        assertEquals(false, uni.federation.isNeutral(uni.tribbles));

        Log.ignore(1, "RaceBattleStub.notSpecified() alienRace not specified");
        assertEquals(false, uni.tribbles.isNeutral(uni.nullRace));
        assertEquals(false, uni.tribbles.isNeutral(uni.xindi));
        assertEquals(false, uni.tribbles.isNeutral(uni.federation));
        assertEquals(false, uni.tribbles.isNeutral(uni.tribbles));
    }

    public final void testIsEnemy() {
        assertEquals(false, uni.nullRace.isEnemy(uni.nullRace));
        assertEquals(false, uni.nullRace.isEnemy(uni.xindi));
        assertEquals(false, uni.nullRace.isEnemy(uni.federation));
        assertEquals(false, uni.nullRace.isEnemy(uni.tribbles));

        assertEquals(false, uni.xindi.isEnemy(uni.nullRace));
        assertEquals(false, uni.xindi.isEnemy(uni.xindi));
        assertEquals(true,  uni.xindi.isEnemy(uni.federation));
        assertEquals(false, uni.xindi.isEnemy(uni.tribbles));

        assertEquals(false, uni.federation.isEnemy(uni.nullRace));
        assertEquals(true,  uni.federation.isEnemy(uni.xindi));
        assertEquals(false, uni.federation.isEnemy(uni.federation));
        assertEquals(false, uni.federation.isEnemy(uni.tribbles));

        Log.ignore(1, "RaceBattleStub.notSpecified() alienRace not specified");
        assertEquals(true,  uni.tribbles.isEnemy(uni.nullRace));
        assertEquals(false, uni.tribbles.isEnemy(uni.xindi));
        assertEquals(false, uni.tribbles.isEnemy(uni.federation));
        assertEquals(false, uni.tribbles.isEnemy(uni.tribbles));    
    }

    /*
     * Class under test for boolean isStatus(RaceInterface, Integer)
     */
    public final void testIsStatusRaceInterfaceInteger() {
    	Log.ignore(1, "RaceBattleStub.notSpecified() alienRace not specified");
    	assertEquals(false, uni.nullRace.isStatus(uni.nullRace,  RaceInterface.ENEMY));
        assertEquals(false, uni.nullRace.isStatus(uni.tribbles,  RaceInterface.FRIEND));
        assertEquals(true,  uni.nullRace.isStatus(uni.federation,RaceInterface.NEUTRAL));
        
        assertEquals(false, uni.xindi.isStatus(uni.nullRace,   RaceInterface.ENEMY));
        assertEquals(true,  uni.federation.isStatus(uni.tribbles,   RaceInterface.FRIEND));
        assertEquals(false, uni.xindi.isStatus(uni.federation, RaceInterface.NEUTRAL));
        
        Log.ignore(1, "RaceBattleStub.notSpecified() alienRace not specified");
        assertEquals(false, uni.tribbles.isStatus  (uni.nullRace, RaceInterface.ENEMY));
    }

    public final void testIsSame() {
        assertEquals(true,  uni.xindi.isSame(uni.xindi));
        assertEquals(false, uni.xindi.isSame(uni.federation));
        assertEquals(false, uni.xindi.isSame(uni.nullRace));

        assertEquals(false, uni.federation.isSame(uni.xindi));
        assertEquals(true, this.uni.federation.isSame(this.uni.federation));    
    }
  
    /*
     * Class under test for void set(RaceInterface, Integer)
     */
    public final void testSetRaceInterfaceInteger() {
        uni.xindi.set(uni.tribbles, RaceInterface.ENEMY);
        assertEquals(true,  uni.xindi.isEnemy(uni.tribbles));
        assertEquals(false, uni.tribbles.isEnemy(uni.xindi));
        
        uni.xindi.set(uni.tribbles, RaceInterface.FRIEND);
        assertEquals(true,  uni.xindi.isFriend(uni.tribbles));
        assertEquals(true,  uni.tribbles.isFriend(uni.xindi));
        
        uni.xindi.set(uni.tribbles, RaceInterface.NEUTRAL);
        assertEquals(true,  uni.xindi.isNeutral(uni.tribbles));
        assertEquals(false, uni.tribbles.isNeutral(uni.xindi));
        
        // check setting self to status - should not set
        uni.tribbles.set(uni.tribbles, RaceInterface.ENEMY);
        assertEquals(true, uni.tribbles.isFriend(uni.tribbles));
    }

    /*
     * Class under test for void set(RaceInterface, Integer, boolean)
     */
    public final void testSetRaceInterfaceIntegerboolean() {
//      check one-directional mode
        uni.xindi.set(uni.tribbles, RaceInterface.ENEMY, false);
        assertEquals(true,  uni.xindi.isEnemy(uni.tribbles));
        assertEquals(false, uni.tribbles.isEnemy(uni.xindi));
        
        uni.xindi.set(uni.tribbles, RaceInterface.FRIEND, false);
        assertEquals(true , uni.xindi.isFriend(uni.tribbles));
        assertEquals(true,  uni.tribbles.isFriend(uni.xindi));
        
        uni.xindi.set(uni.tribbles, RaceInterface.NEUTRAL, false);
        assertEquals(true, uni.xindi.isNeutral(uni.tribbles));
        assertEquals(false, uni.tribbles.isNeutral(uni.xindi));
        
        // check setting self to status - should not set
        uni.tribbles.set(uni.tribbles, RaceInterface.ENEMY, false);
        assertEquals(true, uni.tribbles.isFriend(uni.tribbles));

        
        // check bi-directional mode
        uni.xindi.set(uni.tribbles, RaceInterface.ENEMY, true);
        assertEquals(true,  uni.xindi.isEnemy(uni.tribbles));
        assertEquals(true,  uni.tribbles.isEnemy(uni.xindi));
        
        uni.xindi.set(uni.tribbles, RaceInterface.FRIEND, true);
        assertEquals(true,  uni.xindi.isFriend(uni.tribbles));
        assertEquals(true,  uni.tribbles.isFriend(uni.xindi));
        
        uni.xindi.set(uni.tribbles, RaceInterface.NEUTRAL, true);
        assertEquals(true, uni.xindi.isNeutral(uni.tribbles));
        assertEquals(true, uni.tribbles.isNeutral(uni.xindi));
        
        // check setting self to status - should not set
        uni.tribbles.set(uni.tribbles, RaceInterface.ENEMY, true);
        assertEquals(true, uni.tribbles.isFriend(uni.tribbles));
    
    }

    
/* Cannot get AllRaces functionality to work properly */
//    public final void testGetAllRaces() {
//        assertEquals(raceSet, RaceBattleStub.getAllRaces());
//    }
//    
//    /*
//     * Class under test for void setAll(List, Integer)
//     */
//    public final void testSetListInteger() {
//        uni.xindi.setAll(RaceInterface.FRIEND);
//        assertEquals(true, uni.xindi.isFriend(uni.federation));
//        assertEquals(true, uni.xindi.isFriend(uni.xindi));
//        assertEquals(true, uni.xindi.isFriend(uni.tribbles));
//        assertEquals(true, uni.xindi.isFriend(uni.nullRace));
//        //	check assignment hasn't been two  way
//        assertEquals(false, uni.federation.isFriend(uni.xindi));
//        assertEquals(true,  uni.xindi.isFriend(uni.xindi));
//        assertEquals(true,  uni.tribbles.isFriend(uni.xindi));
//        assertEquals(false, uni.nullRace.isFriend(uni.xindi));
//
//        
//        uni.xindi.setAll(RaceInterface.ENEMY);
//        assertEquals(true,  uni.xindi.isEnemy(uni.federation));
//        assertEquals(false, uni.xindi.isEnemy(uni.xindi));
//        assertEquals(true,  uni.xindi.isEnemy(uni.tribbles));
//        assertEquals(true,  uni.xindi.isEnemy(uni.nullRace));
//        //	check assignment hasn't been two  way   
//        assertEquals(true,  uni.federation.isEnemy(uni.xindi));
//        assertEquals(false, uni.xindi.isEnemy(uni.xindi));
//        assertEquals(false, uni.tribbles.isEnemy(uni.xindi));
//        assertEquals(false, uni.nullRace.isEnemy(uni.xindi));    
//    }
//
//    /*
//     * Class under test for void set(List, Integer, boolean)
//     */
//    public final void testSetListIntegerboolean() {
//        uni.xindi.setAll(RaceInterface.FRIEND);
//        assertEquals(true, uni.xindi.isFriend(uni.federation));
//        assertEquals(true, uni.xindi.isFriend(uni.xindi));
//        assertEquals(true, uni.xindi.isFriend(uni.tribbles));
//        assertEquals(true, uni.xindi.isFriend(uni.nullRace));
//        // check assignment has been two  way
//        assertEquals(false, uni.federation.isFriend(uni.xindi));
//        assertEquals(true, uni.xindi.isFriend(uni.xindi));
//        assertEquals(true, uni.tribbles.isFriend(uni.xindi));
//        assertEquals(false, uni.nullRace.isFriend(uni.xindi));   
//        
//        uni.xindi.setAll(RaceInterface.ENEMY);
//        assertEquals(true,  uni.xindi.isEnemy(uni.federation));
//        assertEquals(false, uni.xindi.isEnemy(uni.xindi));
//        assertEquals(true,  uni.xindi.isEnemy(uni.tribbles));
//        assertEquals(true,  uni.xindi.isEnemy(uni.nullRace));
//        // check assignment has been two  way
//        assertEquals(true,  uni.federation.isEnemy(uni.xindi));
//        assertEquals(true,  uni.xindi.isEnemy(uni.xindi));
//        assertEquals(true,  uni.tribbles.isEnemy(uni.xindi));
//        assertEquals(true,  uni.nullRace.isEnemy(uni.xindi));    
//    }

}
