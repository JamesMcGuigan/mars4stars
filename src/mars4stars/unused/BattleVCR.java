/**************************************************************************
 *  BattleVCR.java                                                            *
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

// Class BattleVCR
// 
public class BattleVCR {
  // Fields
  // 
  private List vBattleSimulator;
  // This needs to be a full copy of the fleet, including the designs
  private List vFleets;
  // Methods
  // Constructors
  // Empty Constructor
  public BattleVCR ( ) { }
  // Accessor Methods
  // Get the value of vBattleSimulator
  // 
  // @return the value of vBattleSimulator
  private List getVBattleSimulator (  ) {
    return this.vBattleSimulator;
  }
  // Set the value of vBattleSimulator
  // 
  // 
  private void setVBattleSimulator ( List value  ) {
    this.vBattleSimulator = value;
  }
  // This needs to be a full copy of the fleet, including the designs
  private List getVFleets (  ) {
    return this.vFleets;
  }
  // This needs to be a full copy of the fleet, including the designs
  private void setVFleets ( List value  ) {
    this.vFleets = value;
  }
  // Operations
  public BattleSimulator addFrame ( ) {
  	//  TODO Auto-generated method stub
  	return null;
  }
}

