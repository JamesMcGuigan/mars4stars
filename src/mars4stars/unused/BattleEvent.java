/**************************************************************************
 *  BattleEvent.java                                                            *
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


package mars4stars.unused;

import java.util.List;

// Class BattleEvent
// 
public class BattleEvent {
  // Fields
  // 
  private List vBattleVCR;
  // 
  private List fleets;
  // 
  private BattleSimulator battleSimulator;
  // Methods
  // Constructors
  // Empty Constructor
  public BattleEvent ( ) { }
  // Accessor Methods
  // Get the value of vBattleVCR
  // 
  // @return the value of vBattleVCR
  private List getVBattleVCR (  ) {
    return this.vBattleVCR;
  }
  // Set the value of vBattleVCR
  // 
  // 
  private void setVBattleVCR ( List value  ) {
    this.vBattleVCR = value;
  }
  // Get the value of fleets
  // 
  // @return the value of fleets
  private List getFleets (  ) {
    return this.fleets;
  }
  // Set the value of fleets
  // 
  // 
  private void setVFleets ( List value  ) {
    this.fleets = value;
  }
  // Get the value of battleSimulator
  // 
  // @return the value of battleSimulator
  private BattleSimulator getBattleSimulator (  ) {
    return this.battleSimulator;
  }
  // Set the value of battleSimulator
  // 
  // 
  private void setBattleSimulator ( BattleSimulator value  ) {
    this.battleSimulator = value;
  }
  // Operations
  // 
  // @param fleets 
  // @param x 
  // @param y 
  // @param z 
  public void runSimulator ( List fleetList, int x, int y, int z) {
    
  }
}

