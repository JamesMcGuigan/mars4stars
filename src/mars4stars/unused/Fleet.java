/**************************************************************************
 *  Fleet.java                                                            *
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

// Class Fleet
// 
public class Fleet {
  // Fields
  // 
  private int id;
  // 
  private List vStack;
  // 
  private Race ownedBy;
  // Methods
  // Constructors
  // Empty Constructor
  public Fleet ( ) { }
  // Accessor Methods
  // Get the value of id
  // 
  // @return the value of id
  private int getId (  ) {
    return this.id;
  }
  // Set the value of id
  // 
  // 
  private void setId ( int value  ) {
    this.id = value;
  }
  // Get the value of vStack
  // 
  // @return the value of vStack
  private List getVStack (  ) {
    return this.vStack;
  }
  // Set the value of vStack
  // 
  // 
  private void setVStack ( List value  ) {
    this.vStack = value;
  }
  // Get the value of ownedBy
  // 
  // @return the value of ownedBy
  private Race getOwnedBy (  ) {
    return this.ownedBy;
  }
  // Set the value of ownedBy
  // 
  // 
  private void setOwnedBy ( Race value  ) {
    this.ownedBy = value;
  }
  // Operations
}

