package org.jm.utils;

import mars4stars.ShipType;

/**
 * @author James McGuigan
 *
 * General Purpose BitmaskClass 
 */
public class BitMask extends BitMaskImmutable {
//	protected int mask = 0;
	public static final int SIGNBIT = 0x7FFFFFFF;
	
	public BitMask() {
		super();
	}

	public BitMask(BitMaskImmutable other) {
		super(other);
	}
	
	public BitMask(int other) {
		super(other);
	}

	public BitMask set (int other) {		
		this.mask = other;
		return this;
	}
	
	public BitMask set (BitMaskImmutable other) {	
		this.mask = other.asInt();
		return this;
	}	

	public BitMask add (int other) {	
		this.mask = this.mask | other;
		return this;
	}	
	
	public BitMask add (BitMaskImmutable other) {	
		return this.add(other.asInt());
	}	

	public BitMask remove (int other) {
		this.mask = this.mask & ~other;
		return this;
	}
	
	public BitMask remove (BitMaskImmutable other) {	
		return this.remove(other.asInt());
	}	
	
	/**
	 * Inverts the Bitmask.
	 * * @return Self.
	 */
	public BitMask invert () {		
		this.mask = ~this.mask;
		return this;
	}
}
