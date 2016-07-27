package mars4stars;

import org.jm.utils.BitMaskImmutable;

/**
 * This class is a BitMaskImmutable and provides an object type to classify ships.
 * This class will be tested when assessing which Stacks are on the primary and
 * secondary target lists. Only the class constants should be used when initalizing
 * and quering this class. These constants are (ShipType.ARMED, ShipType.STARBASE,
 * ShipType.FREIGHTER, ShipType.BOMBER and ShipType.FUELTRANSPORT)
 * 
 * <br><br> Copyright (C) 2004 - Licenced under the GNU GPL 
 * @author James McGuigan
 */
public class ShipType extends BitMaskImmutable {
	public static final int ARMED 		  = 1;
	public static final int STARBASE 	  = 2;  
	public static final int FREIGHTER 	  = 4;
	public static final int BOMBER 		  = 8;
	public static final int FUELTRANSPORT = 16;

	
	/**
	 *	Default constructor (defaults to all fields unset) 
	 */
	public ShipType() {
		super();
	}

	/**
	 * Copy Constructor
	 * @param other  BitMask to copy
	 */
	public ShipType(BitMaskImmutable other) {
		super(other);
	}
	
	/**
	 * Constructor for ShipType
	 * @param other use a sum of the class constants (ShipType.ARMED,
	 * ShipType.STARBASE, ShipType.FREIGHTER, ShipType.BOMBER and
	 * ShipType.FUELTRANSPORT)
	 */
	public ShipType(int other) {
		super(other);
	}

	
	/**
	 * @return Returns true if ship is armed.
	 */
	public boolean isArmed() {
		return this.is(ARMED);
	}
	/**
	 * @return Returns true if ship is unarmed.
	 */
	public boolean isUnarmed() {
		return !this.is(ARMED);
	}
	/**
	 * @return Returns true if ship is a bomber.
	 */
	public boolean isBomber() {
		return this.is(BOMBER);
	}
	/**
	 * @return Returns true if ship is a freighter.
	 */
	public boolean isFreighter() {
		return this.is(FREIGHTER);
	}
	/**
	 * @return Returns true if ship is a fuelTransport.
	 */
	public boolean isFuelTransport() {
		return this.is(FUELTRANSPORT);		
	}
	/**
	 * @return Returns true if ship is a starbase.
	 */
	public boolean isStarbase() {
		return this.is(STARBASE);		
	}
}
