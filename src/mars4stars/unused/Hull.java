/**************************************************************************
 *  Hull.java                                                            *
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

// Class Hull
// 
public class Hull extends Component {
  // Fields
  // 
  private int baseArmour;
  // 
  private int baseInit;
  // 
  public List vSlotPositions;
  // Methods
  // Constructors
  // Empty Constructor
  public Hull ( ) { }
  // Accessor Methods
  // Get the value of baseArmour
  // 
  // @return the value of baseArmour
  private int getBaseArmour (  ) {
    return this.baseArmour;
  }
  // Set the value of baseArmour
  // 
  // 
  private void setBaseArmour ( int value  ) {
    this.baseArmour = value;
  }
  // Get the value of baseInit
  // 
  // @return the value of baseInit
  private int getBaseInit (  ) {
    return this.baseInit;
  }
  // Set the value of baseInit
  // 
  // 
  private void setBaseInit ( int value  ) {
    this.baseInit = value;
  }
  // Get the value of vSlotPositions
  // 
  // @return the value of vSlotPositions
  public List getVSlotPositions (  ) {
    return this.vSlotPositions;
  }
  // Set the value of vSlotPositions
  // 
  // 
  public void setVSlotPositions ( List value  ) {
    this.vSlotPositions = value;
  }
  // Operations
}

