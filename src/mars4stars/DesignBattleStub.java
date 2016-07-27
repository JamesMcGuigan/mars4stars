package mars4stars;

import java.util.*;
import org.jm.utils.*;

/**
 * Implements a data structure for a ship design. This is a striped down class
 * with just the minimum needed for use the battle simulator. It doesn't do any
 * data processing and expects to be initalized with its final values. Percentages
 * are stored as doubles rather than ints as the precision used within stars in 
 * not fully researched. Functions will have to convert them for processing.    
 * 
 * <br><br>Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */
public class DesignBattleStub {
	private String name;
	private int shields;
	private int armour;
	private double jamming;
	private double compBonus;
	private int init;
	private double capBonus;	
	private double defBonus;
	private double battleSpeed;
	private int cost; // res + bora
	private RaceInterface builtBy;
	private ShipType shipType; // replaces isArmed and isBomber
	private ArrayList slots;
	
	// not needed for battlesim
//	private double cloakPercent;
//	private int scannerRange;
//	private double tachyonPercentage;
//	private int cargoCapasity;
	
	/**
	 * This is a stand-in constructor. It doesn't do much in the way of processing, 
	 * other than checking if the ship is armed or not. 
	 * 
	 * @param name		  a String for the design's name.
	 * @param shields	  the shield dp for the design.
	 * @param armour	  the armour dp for the design.
	 * @param jamming	  the jamming percentage (between 1.0 and 0.0). 
	 * @param compBonus	  the computer bonus accuracy percentage (between 1.0 and 0.0). 
	 * @param init		  the design's initiative.
	 * @param capBonus    the capasitor bonus (between 2.5 and 0.0).
	 * @param defBonus	  the deflector bonus (between 1.0 and 0.0) 
	 *                      <br>note: a 10% deflector = 0.9 defBonus. 
	 *                      <br>note: @link http://tinyurl.com/56paz for summing deflector values
	 * @param cost        the design's cost (this is resources + boranium)
	 * @param battleSpeed the design's battle speed in squares (between 2.5 and 0.0)
	 * @param builtBy 	  the Race that built the ship (the owner is specified in StackBattleStub).
	 * @param hullType    the ShipType of the hull (ie ShipType.FREIGHTER)  
	 * @param slots		  a List of SlotBattleStub containing the ship's components 
	 */
	public DesignBattleStub(String name, int shields, int armour,
            double jamming, double compBonus, int init, double capBonus,
            double defBonus, int cost, double battleSpeed, ShipType hullType,
            RaceInterface builtBy, Collection slots) {
		super();
		this.name = name;
		this.shields  =  Math.max(shields, 0);
		this.armour   =  Math.max(armour, 0);
		this.init     =  Math.max(init, 0);
		this.jamming  =  Math.max(Math.min(jamming,    1.0), 0.0);
		this.compBonus=  Math.max(Math.min(compBonus,  1.0), 0.0);
		this.capBonus =  Math.max(Math.min(capBonus,   2.5), 0.0);
		this.defBonus =  Math.max(Math.min(defBonus,   1.0), 0.0);
		this.battleSpeed=Math.max(Math.min(battleSpeed,2.5), 0.0);
		this.builtBy  =  builtBy;
		this.cost     =  Math.max(cost, 0);;
		this.slots    = new ArrayList(slots);
		
		// check if armed
		boolean isArmed = false;
		for(int i=0, n=this.slots.size(); i<n; i++) {
			if(((SlotBattleStub)this.slots.get(i)).getComponent().getPower() > 0) {
				isArmed = true;
				break; 
			}
		}
	
		if(isArmed == true)
			this.shipType = new ShipType((new BitMask(hullType)).add(ShipType.ARMED));
		else
			this.shipType = new ShipType((new BitMask(hullType)).remove(ShipType.ARMED));
	}
	

	
	// Getters and Setters
		/**
		 * @return Returns the armour.
		 */
		public int getArmour() {
			return this.armour;
		}		
		/**
		 * @return Returns the RaceInterface that built the design.
		 */
		public RaceInterface getBuiltBy() {
			return this.builtBy;
		}		
		/**
		 * @return Returns the capasitor bonus (between 2.5 and 0.0).
		 */
		public double getCapBonus() {
			return this.capBonus;
		}		
		/**
		 * @return Returns the deflector bonus (between 1.0 and 0.0).
		 */
		public double getDefBonus() {
			return this.defBonus;
		}		
		/**
		 * @return Returns the design's initiative.
		 */
		public int getInit() {
			return this.init;
		}			
		/**
		 * @return Returns the jamming percentage (between 1.0 and 0.0). 
		 */
		public double getJamming() {
			return this.jamming;
		}		
		/**
		 * @return Returns the design's name.
		 */
		public String getName() {
			return this.name;
		}		
		/**
		 * @return Returns the shield dp for the design.
		 */
		public int getShields() {
			return this.shields;
		}
		/**
		 * @return Returns the shipType.
		 */
		public ShipType getShipType() {
			return this.shipType;
		}	
		/**
		 * @return Returns the an ArrayList of SlotBattleStub representing the designs slots.
		 */
		public ArrayList getSlots() {
			return this.slots;
		}	
		/**
		 * @return Returns the computer accuracy bonus percentage (between 1.0 and 0.0).
		 */
		public double getCompBonus() {
			return this.compBonus;
		}
		/**
		 * @return Returns the ships cost (this is resources + boranium).
		 */
		public int getCost() {
			return this.cost;
		}	
}

