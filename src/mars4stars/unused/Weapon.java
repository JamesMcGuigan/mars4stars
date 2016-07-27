package mars4stars.unused;

import mars4stars.SlotBattleStub;
import mars4stars.StackBattleStub;

/**************************************************************************
 *  Weapon.java                                                            *
 *  Copyright (C) 2004, James McGuigan <james@worldfuturecouncil.org>     *
 *                                                                        *
 *  This program is free software; you can redistrubute it and/or modify  *
 *  it under the terms of the GUN General Public Licence as published by  *
 *  the Free Software Foundation; either version 2, or (at your option)   *
 *  any later version                                                     *
 *                                                                        *
 *  This program is distrabuted in the hope that it will be useful,       *
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the          *
 *  GNU General Public Licence for more details.                          *
 *                                                                        *
 **************************************************************************/


// Class Weapon
// 
abstract public class Weapon extends Component {
  // Fields
  // 
  private int damage;
  // Methods
  // Constructors
  // Empty Constructor
  public Weapon ( ) { }
  // Accessor Methods
  // Get the value of damage
  // 
  // @return the value of damage
  private int getDamage (  ) {
    return this.damage;
  }
  // Set the value of damage
  // 
  // 
  private void setDamage ( int value  ) {
    this.damage = value;
  }
  // Operations
  // 
  // @param target 
  // @param weapon 
  public double calculateAttractivness (StackBattleStub target, SlotBattleStub weapon ) {
  	//  TODO Auto-generated method stub
  	return 1;
  }
  // 
  // @param target 
  // @param weapon 
  // @param shots 
  //public Shot calculateDamage ( StackBattleStub target, SlotBattleStub weapon, int shots) {
    
  //}
}

