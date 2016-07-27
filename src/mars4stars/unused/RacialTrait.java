package mars4stars.unused;

/**************************************************************************
 *  RacialTrait.java                                                            *
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


// Class RacialTrait
// 
public class RacialTrait extends ComponentMod {
  // Fields
  // 
  private String name;
  // Methods
  // Constructors
  // Empty Constructor
  public RacialTrait ( ) { }
  // Accessor Methods
  // Get the value of name
  // 
  // @return the value of name
  private String getName (  ) {
    return this.name;
  }
  // Set the value of name
  // 
  // 
  private void setName ( String value  ) {
    this.name = value;
  }
  // Operations
  // 
  // @param component 
  public boolean canBuild ( Component component) {
  	//  TODO Auto-generated method stub
  	return true;
  }
}

