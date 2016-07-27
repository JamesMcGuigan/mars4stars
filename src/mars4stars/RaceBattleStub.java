package mars4stars;

import java.util.*;

/**
 * RaceBattleStub implements RaceInterface. It provides basic functionality 
 * for determining diplomatic status and race identity. There is no 
 * functionality for PRTs / LRTs or other functionality that is not directly 
 * accessed by the battle engine
 * 
 * @author James McGuigan
 *  
 */
public class RaceBattleStub implements RaceInterface {
//    protected static HashSet allRaces;
    protected HashMap raceMap = new HashMap();
	protected String  name    = "";	

	
	/**
	 * @param name a String to name the race.
	 */
	public RaceBattleStub(String  name) {
		super();
		this.name = name;
		
//		if(allRaces == null) allRaces = new HashSet();		
//		allRaces.add(this);
	}

	/**
	 * Checks if alienRace is declared friend
	 * 
	 * @param alienRace  RaceInterface to check.
	 * @return TRUE  if alienRace is a friend, false otherwise.<br> 
	 *         FALSE if alienRace is of undeclared status.<br>
	 *         FALSE if alienRace is the same as the calling tace
	 */
	public boolean isFriend (RaceInterface alienRace) {
	    if(this.isSame(alienRace)) return true;
	    return isStatus(alienRace, FRIEND);  
	};
	
	/**
	 * Checks if alienRace is declared neutral
	 * 
	 * @param alienRace RaceBattleStub to check.
	 * @return TRUE  if alienRace is a friend, false otherwise. 
	 *         FALSE if alienRace is of undeclared status.
	 *         FALSE if alienRace is the same as the calling tace
	 */
	public boolean isNeutral (RaceInterface alienRace) {
	    if(this.isSame(alienRace)) return false;
	    return isStatus(alienRace, NEUTRAL); 
	};
	
	/**
	 * Checks if alienRace is declared enemy
	 * 
	 * @param alienRace RaceInterface to check
	 * @return TRUE  if alienRace is a friend, false otherwise. 
	 *         FALSE if alienRace is of undeclared status.
	 *         FALSE if alienRace is the same as the calling tace 
	 */
	public boolean isEnemy (RaceInterface alienRace) {
	    if(this.isSame(alienRace)) return false; 
		return isStatus(alienRace, ENEMY, true);
	};  

	/**
	 * Checks the diplomatic status of an alien race.
	 * 
	 * @param alienRace RaceInterface to check
	 * @param status Status alienRace is checked against
	 * @return TRUE if alienRace is declared status, false otherwise (includes not specfied)
	 */
	public boolean isStatus (RaceInterface alienRace, Integer status) {
	    return isStatus(alienRace, status, false);
	};  

	/**
	 * Checks the diplomatic status of an alien race.
	 *  
     * @param alienRace       RaceInterface to check
     * @param status          Status alienRace is checked against
	 * @param ifNotSpecified  What to return if alienRace has not been previously specified
     * @return TRUE if alienRace is declared status, FALSE otherwise.
     * 	       If race is not specified then it will return ifNotSpecified
     */
    protected boolean isStatus(RaceInterface alienRace, Integer status,
            boolean ifNotSpecified) {
        if (this.notSpecified(alienRace))               return ifNotSpecified;
        if ((Integer) raceMap.get(alienRace) == status) return true;
        return false;
    };  
	
	
	/**
	 * Checks if alienRace has previously been specified
	 * 
	 * @param alienRace the race to check
	 * @return TRUE if alienRace is not specified, false if it is specified 
	 */
	protected boolean notSpecified (RaceInterface alienRace) {
	    boolean specified = raceMap.containsKey(alienRace);
		// All alienRaces should be specified 
	    if(specified == false) Log.error(alienRace, "RaceBattleStub.notSpecified() alienRace not specified" );	    
	    return !specified;
	}

	/**
	 * Checks if alienRace is the same as the one calling the function  
	 * 
	 * @param alienRace the race to check
	 * @return TRUE if this.equals(alienRace), false if undeclared or of other status
	 */
	public boolean isSame (RaceInterface alienRace) {
	    boolean isSame = this.equals(alienRace); 
	    return isSame;
	}
	
	/**
	 * Sets alienRace to the specified status. 
	 *  
	 * @param alienRace  the race to have its status specified. Cannot be this race
	 * @param status     the status (FRIEND, NEUTRAL or ENEMY) to set alienRace to
	 */
	public void set(RaceInterface alienRace, Integer status) {
	    if(this.isSame(alienRace) == false)
	        raceMap.put(alienRace, status);
	}	

	/**
	 * Sets alienRace to the specified status in this race and if bidirectional
	 * sets gives this race the the same setting in alienRace
	 *  
	 * @param alienRace     the RaceInterface to have its status specified. Cannot refer to self
	 * @param status        the status (FRIEND, NEUTRAL or ENEMY) to set alienRace to
	 * @param bidirectional a boolean to specify if status should be set set both ways
	 */
	public void set(RaceInterface alienRace, Integer status, boolean bidirectional) {
	    this.set(alienRace, status);
	    if(bidirectional) {
	        alienRace.set(this, status);
	    }
	}	


//	/**
//	 * 
//	 * @return a HashSet of all initalized races
//	 */
//	public static HashSet getAllRaces () {
//	    return RaceBattleStub.allRaces;
//	}
	
	
//    /* (non-Javadoc)
//     * @see mars4stars.RaceInterface#setAll(java.lang.Integer)
//     */
//    public void setAll(Integer status) {
//        setAll(status, false);
//    }
//
//    /* (non-Javadoc)
//     * @see mars4stars.RaceInterface#setAll(java.lang.Integer, boolean)
//     */
//    public void setAll(Integer status, boolean bidirectional) {
//        ArrayList list = new ArrayList(allRaces);  
//        for(int i=0, n=list.size(); i<n; i++) {
//		    this.set((RaceInterface)list.get(i), status, bidirectional);
//		}        
//    }
}
