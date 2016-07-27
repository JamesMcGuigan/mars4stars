package mars4stars.unused;

/**************************************************************************
 *  Slot.java                                                            *
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


// Class Slot
// 
public class Slot {
  // Fields
  // 
  private int used;
  // 
  private Component component;
  // 
  private SlotDefinition definition;
  // Methods
  // Constructors
  // Empty Constructor
  public Slot ( ) { }
  // Accessor Methods
  // Get the value of used
  // 
  // @return the value of used
  private int getUsed (  ) {
    return this.used;
  }
  // Set the value of used
  // 
  // 
  private void setUsed ( int value  ) {
    this.used = value;
  }
  // Get the value of component
  // 
  // @return the value of component
  private Component getComponent (  ) {
    return this.component;
  }
  // Set the value of component
  // 
  // 
  private void setComponent ( Component value  ) {
    this.component = value;
  }
  // Get the value of definition
  // 
  // @return the value of definition
  private SlotDefinition getDefinition (  ) {
    return this.definition;
  }
  // Set the value of definition
  // 
  // 
  private void setDefinition ( SlotDefinition value  ) {
    this.definition = value;
  }
  // Operations
}

