package org.jm.utils.testing;
import org.jm.utils.*;
import junit.framework.TestCase;



public class BitMaskImmutableTest extends TestCase {

	protected int intAllOnes;
	protected int intAllZeros;
	protected int intMixed;
	protected int intInvMixed;

	protected Integer integerAllOnes;
	protected Integer integerAllZeros;
	protected Integer integerMixed;
	protected Integer integerInvMixed;
	
	
	protected BitMaskImmutable maskAllOnes;
	protected BitMaskImmutable maskAllZeros;
	protected BitMaskImmutable maskMixed;

	protected void setUp() throws Exception {
		super.setUp();
		reset();
	}
	
	protected void reset() {		
		intAllOnes  = 0xFFFFFFFF;
		intAllZeros = 0x00000000;
		intMixed    = 0x96C3;
		intInvMixed = ~intMixed;
		
		integerAllOnes     = new Integer(this.intAllOnes);
		integerAllZeros    = new Integer(this.intAllZeros);
		integerMixed       = new Integer(this.intMixed);
		integerInvMixed    = new Integer(this.intInvMixed);	
		
		maskAllOnes  = new BitMaskImmutable(intAllOnes);
		maskAllZeros = new BitMaskImmutable(intAllZeros);
		maskMixed    = new BitMaskImmutable(intMixed);
	}
	
	/*
	 * Class under test for void BitMaskImmutable()
	 */
	public final void testBitMaskImmutable() {
		assertNotNull(new BitMaskImmutable());
	}

	/*
	 * Class under test for void BitMaskImmutable(BitMask)
	 */
	public final void testBitMaskImmutableBitMask() {
		assertEquals (true,  maskAllOnes.equals(new BitMaskImmutable(maskAllOnes)));
		assertEquals (true,  maskMixed.equals(  new BitMaskImmutable(maskMixed  )));
		assertEquals (false, maskMixed.equals(  new BitMaskImmutable(maskAllOnes)));
		assertEquals (true,  (new BitMaskImmutable(intAllOnes )).equals(new BitMaskImmutable(maskAllOnes)));
		assertEquals (false, (new BitMaskImmutable(intAllOnes )).equals(new BitMaskImmutable(maskMixed  )));		
		assertEquals (true,  (new BitMaskImmutable(maskAllOnes)).equals(new BitMaskImmutable(maskAllOnes)));
		assertEquals (false, (new BitMaskImmutable(maskAllOnes)).equals(new BitMaskImmutable(maskMixed  )));		
	}

	/*
	 * Class under test for void BitMaskImmutable(int)
	 */
	public final void testBitMaskImmutableint() {
		assertEquals (true,  maskAllOnes.equals(new BitMaskImmutable(intAllOnes)));
		assertEquals (true,  maskMixed.equals(  new BitMaskImmutable(intMixed  )));
		assertEquals (false, maskMixed.equals(  new BitMaskImmutable(intAllOnes)));
		assertEquals (true,  (new BitMaskImmutable(intAllOnes )).equals(new BitMaskImmutable(intAllOnes)));
		assertEquals (false, (new BitMaskImmutable(intAllOnes )).equals(new BitMaskImmutable(intMixed  )));		
		assertEquals (true,  (new BitMaskImmutable(maskAllOnes)).equals(new BitMaskImmutable(intAllOnes)));
		assertEquals (false, (new BitMaskImmutable(maskAllOnes)).equals(new BitMaskImmutable(intMixed  )));		

	}

	/*
	 * Class under test for boolean hasAll(int)
	 */
	public final void testhasAllint() {
		assertEquals(true,  maskAllOnes.is(intAllOnes));
		assertEquals(true,  maskAllOnes.is(intMixed));
		assertEquals(true,  maskAllOnes.is(intAllZeros));
		
		assertEquals(false, maskMixed.is(intAllOnes));
		assertEquals(true,  maskMixed.is(maskMixed));
		assertEquals(true,  maskMixed.is(intAllZeros));
		
		assertEquals(false, maskAllZeros.is(intAllOnes));
		assertEquals(false, maskAllZeros.is(intMixed));
		assertEquals(true,  maskAllZeros.is(intAllZeros));
	}

	/*
	 * Class under test for boolean hasAll(BitMask)
	 */
	public final void testHashasAll() {
		assertEquals(true,  maskAllOnes.is(maskAllOnes));
		assertEquals(true,  maskAllOnes.is(maskMixed));
		assertEquals(true,  maskAllOnes.is(maskAllZeros));
		
		assertEquals(false, maskMixed.is(maskAllOnes));
		assertEquals(true,  maskMixed.is(maskMixed));
		assertEquals(true,  maskMixed.is(maskAllZeros));
		
		assertEquals(false, maskAllZeros.is(maskAllOnes));
		assertEquals(false, maskAllZeros.is(maskMixed));
		assertEquals(true,  maskAllZeros.is(maskAllZeros));
	}

	/*
	 * Class under test for boolean equals(BitMask)
	 */
	public final void testEqualsBitMask() {
		assertEquals(true,  maskAllOnes.equals(maskAllOnes));
		assertEquals(false, maskAllOnes.equals(maskMixed));
		assertEquals(false, maskAllOnes.equals(maskAllZeros));
		
		assertEquals(false, maskMixed.equals(maskAllOnes));
		assertEquals(true,  maskMixed.equals(maskMixed));
		assertEquals(false, maskMixed.equals(maskAllZeros));
		
		assertEquals(false, maskAllZeros.equals(maskAllOnes));
		assertEquals(false, maskAllZeros.equals(maskMixed));
		assertEquals(true,  maskAllZeros.equals(maskAllZeros));		
	}

	/*
	 * Class under test for boolean equals(Int)
	 */
	public final void testEqualsBitMaskInt() {
		assertEquals(true,  maskAllOnes.equals(intAllOnes));
		assertEquals(false, maskAllOnes.equals(intMixed));
		assertEquals(false, maskAllOnes.equals(intAllZeros));
		
		assertEquals(false, maskMixed.equals(intAllOnes));
		assertEquals(true,  maskMixed.equals(intMixed));
		assertEquals(false, maskMixed.equals(intAllZeros));
		
		assertEquals(false, maskAllZeros.equals(intAllOnes));
		assertEquals(false, maskAllZeros.equals(intMixed));
		assertEquals(true,  maskAllZeros.equals(intAllZeros));		
	}	
	
	public final void testAsInt() {
		assertEquals (intAllOnes,  maskAllOnes.asInt());
		assertEquals (intMixed,    maskMixed.asInt());
		assertEquals (intAllZeros, maskAllZeros.asInt());

	}


}
