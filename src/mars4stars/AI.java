package mars4stars;

import java.util.Set;
import mars4stars.unused.AITYPES;

/** 
 * Implements stars AI logic for stack movement and selecting targets for shooting
 * <br> TODO:: Implement class AI  
 * 
 * <br><br>Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */
abstract public class AI {
  
/* // TODO: Implement subclasses  
  public static final AIMaxDamage 	           = new AI();
  public static final AIDisengage			   = new AI();
  public static final AIDisengageIfChallenged  = new AI();
  public static final AIMaxNetDamage 		   = new AI();
  public static final AIMaxDamageRatio   	   = new AI();
  public static final AIMinDamageToSelf 	   = new AI();
*/
	
  // Fields
  // 
  //static private Set allElements; // TODO: implement as part of new Globals class 
  private String displayName;

  public AI ( ) { }
  /**
   * Calculates the Attractivness of the target from the weapons perspective.
   * @param aWeapon
   * @param aTarget
   * @return Attractivness of target
   */
  public static double calculateAttractiveness ( SlotBattleStub aWeapon, StackBattleStub aTarget) {
  	return 1.0; // TODO: Implement calculateAttractiveness
  }
  
  /**
   * Calculates the Most Attractive Square to move into 
   * @return Square AI thinks ship should move to
   */
  public static GridSquare CalculateMostAttractiveSquare () {
     // TODO: Implenent CalculateMostAttractiveSquare
  	return null;
  }
  
  /**
   * Calculates the most attractive stack to move towards 
   * @return Target AI thinks ship should move towards
   */
  public static StackBattleStub CalculateMostAttractiveTarget ( ) {
  	// TODO: Implenent CalculateMostAttractiveSquare
  	return null;
  }
}