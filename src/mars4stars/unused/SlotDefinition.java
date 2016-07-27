/**************************************************************************
 *  SlotDefinition.java                                                            *
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

import java.util.Set;
// Class SlotDefinition
// 
public class SlotDefinition {
  // Fields
  // 
  private int xPos;
  // 
  private int yPos;
  // 
  private Set typesAllowed;
  // 
  private int count;
  // 
  private int slotNumber;
  // Methods
  // Constructors
  // Empty Constructor
  public SlotDefinition ( ) { }
  // Accessor Methods
  // Get the value of xPos
  // 
  // @return the value of xPos
  private int getXPos (  ) {
    return this.xPos;
  }
  // Set the value of xPos
  // 
  // 
  private void setXPos ( int value  ) {
    this.xPos = value;
  }
  // Get the value of yPos
  // 
  // @return the value of yPos
  private int getYPos (  ) {
    return this.yPos;
  }
  // Set the value of yPos
  // 
  // 
  private void setYPos ( int value  ) {
    this.yPos = value;
  }
  // Get the value of typesAllowed
  // 
  // @return the value of typesAllowed
  private java.util.Set getTypesAllowed (  ) {
    return this.typesAllowed;
  }
  // Set the value of typesAllowed
  // 
  // 
  private void setTypesAllowed ( java.util.Set value  ) {
    this.typesAllowed = value;
  }
  // Get the value of count
  // 
  // @return the value of count
  private int getCount (  ) {
    return this.count;
  }
  // Set the value of count
  // 
  // 
  private void setCount ( int value  ) {
    this.count = value;
  }
  // Get the value of slotNumber
  // 
  // @return the value of slotNumber
  private int getSlotNumber (  ) {
    return this.slotNumber;
  }
  // Set the value of slotNumber
  // 
  // 
  private void setSlotNumber ( int value  ) {
    this.slotNumber = value;
  }
  // Operations
  // 
  // @param component 
  public boolean isAllowed ( Component component) {
  	//  TODO Auto-generated method stub
  	return true;
  }
}

