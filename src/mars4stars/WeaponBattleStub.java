package mars4stars;

/**
 * This is the implmentation for the WeaponInterface
 * @see mars4stars.WeaponInterface
 * 
 * <br> <br> 
 * Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */
public class WeaponBattleStub implements WeaponInterface {
	String name;
	WeaponType type;
	int range;
	int power;
	int init;
	
	/**
	 * A Standard Constuctor
	 *  
	 * @param name   a String for a the Weapon's name.
	 * @param type   a WeaponType constant
	 * @param range  the Weapon's range in squares
	 * @param power  the Weapon's power in dp (this is its unmodified power for a single weapon)
	 * @param init   the Weapon's initiative
	 */
	public WeaponBattleStub(String name, WeaponType type, int range, int power, int init) {
		super();
		this.name  = name;
		this.type  = type;
		this.range = range;
		this.power = power;
	}

	/* (non-Javadoc)
	 * @see mars4stars.WeaponInterface#calculateDamage(mars4stars.StackBattleStub, mars4stars.StackBattleStub, int)
	 */
	public Shot calculateDamage(StackBattleStub shooter, StackBattleStub target,
	        int count) {
		// TODO Auto-generated method stub
		return null;
	}

    /* (non-Javadoc)
     * @see mars4stars.WeaponInterface#calculateAttractivness(mars4stars.StackBattleStub, mars4stars.StackBattleStub)
     */
    public int calculateAttractivness(StackBattleStub shooter, StackBattleStub target) {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see mars4stars.WeaponInterface#calculateAccuracy(mars4stars.StackBattleStub, mars4stars.StackBattleStub)
     */
    public double calculateAccuracy(StackBattleStub shooter, StackBattleStub target) {
        // TODO Auto-generated method stub
        return 0;
    }

    
    // Getters and Setters
		public WeaponType getType() {	
			return type;
		}
		public int getPower() {
			return power;
		}	
		public int getRange() {
			return range;
		}
		public int getInit() {
			return init;
		}
		public boolean isType(WeaponType weaponType) {
		    return type.is(type);
		}
}
