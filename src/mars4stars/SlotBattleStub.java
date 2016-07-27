package mars4stars;

// Class SlotBattleStub
// Only Store Slots of Weapon Components in SlotBattleStibs
/**  
 * A StackBattleStub doesn't hold Components directly but does it through 
 * SlotBattleStub. It records the number of Components in a DesignBattleStub 
 * and additionally keeps track of the number of shots remaining for a 
 * Component during a battle.  
 *  
 * <br><br>Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */
public class SlotBattleStub {
	// Fields
	private int remaining;
	private int total;
	private WeaponInterface component;

	/**
	 * Creates a new SlotBattleStub
	 * 
	 * @param component  a WeaponInterface of the component in the slot 
	 * @param total      the number of components in the slot
	 */
	public SlotBattleStub(WeaponInterface component, int total) {
		super();
		this.remaining = total;
		this.total = total;
		this.component = component;
	}
	
	/**
	 * Calculates the damage of the Slot's Weapon and applies the damage to the target. 
	 * 
	 * @param target  the StackBattleStub to be shot.
	 * @return        number of shots remaining
	 */
	public int fireWeapon ( StackBattleStub target) {
		return 0;
	}
	
	
	
	
	
	// Getters and Setters
		/**
		 * @return Returns the component.
		 */
		public WeaponInterface getComponent() {
			return component;
		}
		/**
		 * @param component The component to set.
		 */
		public void setComponent(WeaponInterface component) {
			this.component = component;
		}
		/**
		 * @return Returns the remaining.
		 */
		public int getRemaining() {
			return remaining;
		}
		/**
		 * @param remaining The remaining to set.
		 */
		public void setRemaining(int remaining) {
			this.remaining = remaining;
		}
		/**
		 * @return Returns the total.
		 */
		public int getTotal() {
			return total;
		}
}

