package org.jm.utils;

import mars4stars.ShipType;

/**
 * @author James McGuigan
 *
 * General Purpose BitmaskClass 
 */
public class BitMaskImmutable {
	protected int mask = 0;

	public BitMaskImmutable() {
	}

	public BitMaskImmutable(BitMaskImmutable other) {
		this.mask = other.asInt();
	}
	
	public BitMaskImmutable(int other) {
		this.mask = other;
	}

	public boolean is (int other) {
		boolean result = ((this.mask & other) == other); 	
		return result;
	}	

	public boolean is (BitMaskImmutable other) {
		return this.is(other.asInt());
	}		

	public boolean equals (int other) {
		return (this.mask == other);
	}	
	
	public boolean equals (BitMaskImmutable other) {
		return (this.equals(other.asInt()));
	}	

	public int asInt () {
		return this.mask;
	}	
}
