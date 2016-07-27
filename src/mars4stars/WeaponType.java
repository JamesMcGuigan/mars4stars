package mars4stars;

import org.jm.utils.BitMaskImmutable;

/**
 * This class is a BitMaskImmutable and provides an object type to classify
 * Weapons. This class will be tested when assessing when deciding which set of
 * formulas to use for calculating damage and attractivness. Only the class
 * constants should be used when initalizing and quering this class. These
 * constants are (BEAMGENERAL, BEAM, GATLING, SAPPER, MISSILEGENERAL, TORPEDO
 * and CAPITALMISSILE)
 * 
 * <br><br> Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */
public class WeaponType extends BitMaskImmutable {
	    /**
	     * Constant indicating that WeaponType is either BEAM, GATLING or SAPPER 
	     */
	    public static final int BEAMGENERAL    = 1;
		/**
         * Constant indicating WeaponType is a normal beam weapon (not a sapper
         * or gatling). If this type is set, then so is BEAMGENERAL.
         */
	    public static final int BEAM 		   = 4  + BEAMGENERAL;
		/**
         * Constant indicating WeaponType is a gatling. 
         * If this type is set, then so is BEAMGENERAL.
         */
	    public static final int GATLING 	   = 8  + BEAMGENERAL;
	    /**
         * Constant indicating WeaponType is a sapper. If this type is set, then
         * so is BEAMGENERAL.
         */
		public static final int SAPPER	 	   = 16 + BEAMGENERAL;
	
	    /**
         * Constant indicating that WeaponType is either TORPEDO or CAPITALMISSILE
         */
		public static final int MISSILEGENERAL = 2;
		/**
         * Constant indicating WeaponType is a torpedo (not a capital missile).
         * If this type is set, then so is MISSILEGENERAL.
         */
		public static final int TORPEDO 	   = 32 + MISSILEGENERAL;
		/**
         * Constant indicating WeaponType is a capital missile. 
         * If this type is set, then so is MISSILEGENERAL.
         */
		public static final int CAPITALMISSILE = 64 + MISSILEGENERAL;
	
	/**
	 * Copy Constructor
	 * @param other  BitMask to copy
	 */
	public WeaponType(BitMaskImmutable other) {
		super(other);
	}
	
	/**
     * Constructor for WeaponType
     * 
     * @param other
     *            use one of the class constants BEAM, GATLING, SAPPER, TORPEDO
     *            and CAPITALMISSILE. You should not use BEAMGENERAL or
     *            MISSILEGENERAL as these are not specific weapon types.
     */
	public WeaponType(int other) {
		super(other);
	}	
}
