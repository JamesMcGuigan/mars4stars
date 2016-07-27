package org.jm.utils.testing;
import org.jm.utils.*;
import mars4stars.testing.Accessor;

public class BitMaskTest extends BitMaskImmutableTest {

	protected BitMask modMaskAllOnes;
	protected BitMask modMaskAllZeros;
	protected BitMask modMaskMixed;
	protected BitMask modMaskInvMixed;

	protected void setUp() throws Exception {
		super.setUp();
		reset();
	}

	protected void reset() {
		super.reset();
		modMaskAllOnes = new BitMask(super.intAllOnes);
		modMaskAllZeros = new BitMask(super.intAllZeros);
		modMaskMixed = new BitMask(super.intMixed);
		modMaskInvMixed = new BitMask(super.intInvMixed);
	}

	/*
	 * Class under test for void BitMask()
	 */
	public final void testBitMask() {
		assertNotNull(new BitMask());
	}

	/*
	 * Class under test for void BitMask(BitMaskImmutable)
	 */
	public final void testBitMaskBitMaskImmutable() {
		assertNotNull(new BitMask(this.maskMixed));
		assertNotNull(new BitMask(this.modMaskAllOnes));
		assertEquals(this.intAllZeros, (new BitMask(this.modMaskAllZeros)).asInt());
	}

	/*
	 * Class under test for void BitMask(int)
	 */
	public final void testBitMaskint() {
		assertNotNull(new BitMask(this.intMixed));
		assertNotNull(new BitMask(this.intAllOnes));
		assertEquals(this.intAllZeros, (new BitMask(this.intAllZeros)).asInt());
	}

	/*
	 * Class under test for BitMask set(int)
	 */
	public final void testSetint() {
		assertNotNull(this.modMaskMixed.set(this.intAllOnes));

		reset();
		assertNotNull(this.modMaskAllZeros.set(this.intMixed));

		reset();
		assertEquals(this.integerMixed, Accessor.getPrivateField(
				(this.modMaskAllZeros.set(this.intMixed)), "mask"));

		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskMixed.set(this.intAllZeros)), "mask"));
	}

	/*
	 * Class under test for BitMask set(BitMask)
	 */
	public final void testSetBitMask() {
		assertNotNull(this.modMaskMixed.set(this.modMaskAllOnes));

		reset();
		assertNotNull(this.modMaskAllZeros.set(this.modMaskMixed));

		reset();
		assertEquals(this.integerMixed, Accessor.getPrivateField(
				(this.modMaskAllZeros.set(this.modMaskMixed)), "mask"));

		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskMixed.set(this.modMaskAllZeros)), "mask"));
	}

	/*
	 * Class under test for BitMask add(int)
	 */
	public final void testAddint() {
		// test not null
		assertNotNull(this.modMaskMixed.add(this.intAllOnes));

		// test allZeros + allZeros = allZeros
		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskAllZeros.add(this.intAllZeros)), "mask"));
		// test allZeros + Mixed = Mixed
		reset();
		assertEquals(this.integerMixed, Accessor.getPrivateField(
				(this.modMaskAllZeros.add(this.intMixed)), "mask"));
		// test allZeros + allOnes = allOnes
		reset();
		assertEquals(this.integerAllOnes, Accessor.getPrivateField(
				(this.modMaskAllZeros.add(this.intAllOnes)), "mask"));
		// test Mixed + allZeros = Mixed
		reset();
		assertEquals(this.integerMixed, Accessor.getPrivateField(
				(this.modMaskMixed.add(this.intAllZeros)), "mask"));
		// test Mixed + Mixed = Mixed
		reset();
		assertEquals(this.integerMixed, Accessor.getPrivateField(
				(this.modMaskMixed.add(this.intMixed)), "mask"));
		// test Mixed + InvMixed = allOnes
		reset();
		assertEquals(this.integerAllOnes, Accessor.getPrivateField(
				(this.modMaskMixed.add(this.intInvMixed)), "mask"));
		// test Mixed + allOnes = allOnes
		reset();
		assertEquals(this.integerAllOnes, Accessor.getPrivateField(
				(this.modMaskMixed.add(this.intAllOnes)), "mask"));

		// test allOnes + allZeros = Mixed
		reset();
		assertEquals(this.integerAllOnes, Accessor.getPrivateField(
				(this.modMaskAllOnes.add(this.intAllZeros)), "mask"));
		// test allOnes + Mixed = allOnes
		reset();
		assertEquals(this.integerAllOnes, Accessor.getPrivateField(
				(this.modMaskAllOnes.add(this.intMixed)), "mask"));
		// test allOnes + allOnes = allOnes
		reset();
		assertEquals(this.integerAllOnes, Accessor.getPrivateField(
				(this.modMaskAllOnes.add(this.intAllOnes)), "mask"));
	}

	/*
	 * Class under test for BitMask add(BitMask)
	 */
	public final void testAddBitMask() {
		// test not null
		assertNotNull(this.modMaskMixed.add(this.modMaskAllOnes));

		// test allZeros + allZeros = allZeros
		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskAllZeros.add(this.modMaskAllZeros)), "mask"));
		// test allZeros + Mixed = Mixed
		reset();
		assertEquals(this.integerMixed, Accessor.getPrivateField(
				(this.modMaskAllZeros.add(this.modMaskMixed)), "mask"));
		// test allZeros + allOnes = allOnes
		reset();
		assertEquals(this.integerAllOnes, Accessor.getPrivateField(
				(this.modMaskAllZeros.add(this.modMaskAllOnes)), "mask"));

		// test Mixed + allZeros = Mixed
		reset();
		assertEquals(this.integerMixed, Accessor.getPrivateField(
				(this.modMaskMixed.add(this.modMaskAllZeros)), "mask"));
		// test Mixed + Mixed = allOnes
		reset();
		assertEquals(this.integerMixed, Accessor.getPrivateField(
				(this.modMaskMixed.add(this.modMaskMixed)), "mask"));
		// test Mixed + InvMixed = allOnes
		reset();
		assertEquals(this.integerAllOnes, Accessor.getPrivateField(
				(this.modMaskMixed.add(this.modMaskInvMixed)), "mask"));
		// test Mixed + allOnes = allOnes
		reset();
		assertEquals(this.integerAllOnes, Accessor.getPrivateField(
				(this.modMaskMixed.add(this.modMaskAllOnes)), "mask"));

		// test allOnes + allZeros = allOnes
		reset();
		assertEquals(this.integerAllOnes, Accessor.getPrivateField(
				(this.modMaskAllOnes.add(this.modMaskAllZeros)), "mask"));
		// test allOnes + Mixed = allOnes
		reset();
		assertEquals(this.integerAllOnes, Accessor.getPrivateField(
				(this.modMaskAllOnes.add(this.modMaskMixed)), "mask"));
		// test allOnes + allOnes = allOnes
		reset();
		assertEquals(this.integerAllOnes, Accessor.getPrivateField(
				(this.modMaskAllOnes.add(this.modMaskAllOnes)), "mask"));
	}

	/*
	 * Class under test for BitMask remove(int)
	 */
	public final void testRemoveint() {
		// test not null
		assertNotNull(this.modMaskMixed.remove(this.intAllOnes));

		// test allZeros - allZeros = allZeros
		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskAllZeros.remove(this.intAllZeros)), "mask"));
		// test allZeros - Mixed = allZeros
		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskAllZeros.remove(this.intMixed)), "mask"));
		// test allZeros - allOnes = allZeros
		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskAllZeros.remove(this.intAllOnes)), "mask"));

		// test Mixed - allZeros = Mixed
		reset();
		assertEquals(this.integerMixed, Accessor.getPrivateField(
				(this.modMaskMixed.remove(this.intAllZeros)), "mask"));
		// test Mixed - Mixed = allZeros
		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskMixed.remove(this.intMixed)), "mask"));
		// test Mixed - InvMixed = Mixed
		reset();
		assertEquals(this.integerMixed, Accessor.getPrivateField(
				(this.modMaskMixed.remove(this.intInvMixed)), "mask"));
		// test Mixed - allOnes = allZeros
		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskMixed.remove(this.intAllOnes)), "mask"));

		// test allOnes - allZeros = allOnes
		reset();
		assertEquals(this.integerAllOnes, Accessor.getPrivateField(
				(this.modMaskAllOnes.remove(this.intAllZeros)), "mask"));
		// test allOnes - Mixed = InvMixed
		reset();
		assertEquals(this.integerInvMixed, Accessor.getPrivateField(
				(this.modMaskAllOnes.remove(this.intMixed)), "mask"));
		// test allOnes - allOnes = allZeros
		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskAllOnes.remove(this.intAllOnes)), "mask"));
	}

	/*
	 * Class under test for BitMask remove(BitMask)
	 */
	public final void testRemoveBitMask() {
		// test not null
		reset();
		assertNotNull(this.modMaskMixed.remove(this.modMaskAllOnes));

		// test allZeros - allZeros = allZeros
		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskAllZeros.remove(this.modMaskAllZeros)), "mask"));
		// test allZeros - Mixed = allZeros
		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskAllZeros.remove(this.modMaskMixed)), "mask"));
		// test allZeros - allOnes = allZeros
		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskAllZeros.remove(this.modMaskAllOnes)), "mask"));

		// test Mixed - allZeros = Mixed
		reset();
		assertEquals(this.integerMixed, Accessor.getPrivateField(
				(this.modMaskMixed.remove(this.modMaskAllZeros)), "mask"));
		// test Mixed - Mixed = allZeros
		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskMixed.remove(this.modMaskMixed)), "mask"));
		// test Mixed - InvMixed = Mixed
		reset();
		assertEquals(this.integerMixed, Accessor.getPrivateField(
				(this.modMaskMixed.remove(this.modMaskInvMixed)), "mask"));
		// test Mixed - allOnes = allZeros
		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskMixed.remove(this.modMaskAllOnes)), "mask"));

		// test allOnes - allZeros = allOnes
		reset();
		assertEquals(this.integerAllOnes, Accessor.getPrivateField(
				(this.modMaskAllOnes.remove(this.modMaskAllZeros)), "mask"));
		// test allOnes - Mixed = InvMixed
		reset();
		assertEquals(this.integerInvMixed, Accessor.getPrivateField(
				(this.modMaskAllOnes.remove(this.modMaskMixed)), "mask"));
		// test allOnes - allOnes = allZeros
		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskAllOnes.remove(this.modMaskAllOnes)), "mask"));
	}

	public final void testInvert() {
		// invert AllZeros = AllOnes
		reset();
		assertEquals(this.integerAllOnes, Accessor.getPrivateField(
				(this.modMaskAllZeros.invert()), "mask"));
		// invert Mixed = InvMixed
		reset();
		assertEquals(this.integerInvMixed, Accessor.getPrivateField(
				(this.modMaskMixed.invert()), "mask"));
		// invert InvMixed = Mixed
		reset();
		assertEquals(this.integerMixed, Accessor.getPrivateField(
				(this.modMaskInvMixed.invert()), "mask"));
		// invert AllOnes = AllZeros
		reset();
		assertEquals(this.integerAllZeros, Accessor.getPrivateField(
				(this.modMaskAllOnes.invert()), "mask"));

	}
}
