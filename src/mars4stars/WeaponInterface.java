package mars4stars;

/**
 * This interface gives the basic functionality that the battle engine needs to
 * know about when dealing with a Component. Under this minalmist scheme, the 
 * only components that need to be described are weapons. It provides the necessary
 * functions to simply "use" the weapon without doing the maths externally.    
 * 
 * <br><br>Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */ 
abstract public interface WeaponInterface {    
	/**
	 * Calculates the attractivness of the target from the shooters perspective.
	 * 
	 * @param shooter   the StackBattleStub of the shooter
	 * @param target    the StackBattleStub that is being targeted
	 * @return          the target's attractivness. 
	 */
	public int calculateAttractivness ( StackBattleStub shooter, StackBattleStub target);
    
  
	/**
	 * Creates a Slot object that can be applied to the target to inflict damage.
	 *    
	 * @param shooter   the StackBattleStub of the shooter.
	 * @param target    the StackBattleStub that is being targeted.
	 * @param count		the number of weapons in the Stack's Slot being fired.  
	 * @return          a Shot object.
	 */
	public Shot calculateDamage ( StackBattleStub shooter, StackBattleStub target, int count);
    
  
	/**
	 * Calculates the likelihood that a weapon will hit its target. 
	 * Mainly for internal use.  
	 * 
	 * @param shooter   the StackBattleStub of the shooter.
	 * @param target    the StackBattleStub that is being targeted.
	 * @return          the weapon's accuracy (between 1.0 and 0.0) 
	 */
	public double calculateAccuracy ( StackBattleStub shooter, StackBattleStub target);

	
	// Getters and Setters
		/**
		 * 
		 * @return WeaponType of Weapon
		 */
		public WeaponType getType ();
		/**
		 * 
		 * @param type 
		 * @return
		 */
		public boolean isType (WeaponType type);
	   /**
	   	* 
	   	* @return Weapons Range in Squares
	   	*/
		public int getRange ( );   
	   /**
	   	* 
	   	* @return Weapons Initiative in Squares
	   	*/
		public int getInit ( );  
	   /**
	   	* 
	   	* @return A weapons' unmodified power in dp.  
	   	*/
		public int getPower ( );  		
}

