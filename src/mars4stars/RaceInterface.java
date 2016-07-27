package mars4stars;

import java.util.HashSet;
import java.util.List;

/**
 * This interface gives the basic functionality that the battle engine needs to
 * know about when dealing with different Races
 * 
 * <br><br> Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */
public interface RaceInterface {
    public final static Integer FRIEND  = new Integer(1);
    public final static Integer NEUTRAL = new Integer(0);
    public final static Integer ENEMY   = new Integer(-1);

    /**
     * Checks if alienRace is declared friend
     * 
     * @param alienRace RaceBattleStub to check.
     * @return TRUE  if alienRace is a friend, false otherwise. 
     *         FALSE if alienRace is of undeclared status.
     *         FALSE if alienRace is the same as the calling tace
     */
    public abstract boolean isFriend(RaceInterface alienRace);

	/**
	 * Checks if alienRace is declared neutral
	 * 
	 * @param alienRace RaceBattleStub to check.
	 * @return TRUE  if alienRace is a friend, false otherwise. 
	 *         FALSE if alienRace is of undeclared status.
	 *         FALSE if alienRace is the same as the calling tace
	 */
    public abstract boolean isNeutral(RaceInterface alienRace);

	/**
	 * Checks if alienRace is declared enemy
	 * 
	 * @param alienRace RaceInterface to check
	 * @return TRUE  if alienRace is a friend, false otherwise. 
	 *         FALSE if alienRace is of undeclared status.
	 *         FALSE if alienRace is the same as the calling tace 
	 */
    public abstract boolean isEnemy(RaceInterface alienRace);

	/**
	 * Checks the diplomatic status of an alien race.
	 * 
	 * @param alienRace RaceInterface to check
	 * @param status Status alienRace is checked against
	 * @return TRUE if alienRace is declared status, false otherwise (includes not specfied)
	 */
    public abstract boolean isStatus(RaceInterface alienRace, Integer status);

	/**
	 * Checks if alienRace is the same as the one calling the function  
	 * 
	 * @param alienRace the race to check
	 * @return TRUE if this.equals(alienRace), false if undeclared or of other status
	 */
    public abstract boolean isSame(RaceInterface alienRace);

    /**
     * Sets alienRace to the specified status. 
     *  
     * @param alienRace  the race to have its status specified. Cannot be this race
     * @param status     the status (FRIEND, NEUTRAL or ENEMY) to set alienRace to
     */
    public abstract void set(RaceInterface alienRace, Integer status);

    /**
     * Sets alienRace to the specified status in this race and if bidirectional
     * sets gives this race the the same setting in alienRace
     *  
     * @param alienRace     the race to have its status specified. Cannot be this race
     * @param status        the status (FRIEND, NEUTRAL or ENEMY) to set alienRace to
     * @param bidirectional a boolean to specify if status should be set set both ways
     */
    public abstract void set(RaceInterface alienRace, Integer status,
            boolean bidirectional);

//    /**
//     * Sets all other known races to status
//     *  
//     * @param status        the status (FRIEND, NEUTRAL or ENEMY) to set aliens to
//     * @param bidirectional a boolean to specify if status should be set both ways
//     */
//    public abstract void setAll(Integer status);
//    
//    /**
//     * Sets all other known races to status
//     *  
//     * @param status        the status (FRIEND, NEUTRAL or ENEMY) to set aliens to
//     * @param bidirectional a boolean to specify if status should be set both ways
//     */
//     public abstract void setAll(Integer status, boolean bidirectional);
}