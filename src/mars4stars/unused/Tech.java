package mars4stars.unused;

/**************************************************************************
 *  Tech.java                                                            *
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


// Class Tech
// Lists the required levels of technology required for an item. 
// -1 specifies that a technology field is not required
public class Tech {
  // Fields
  // 
  private int energy = -1;
  // 
  private int weap = -1;
  // 
  private int prop = -1;
  // 
  private int con = -1;
  // 
  private int elect = -1;
  // 
  private int bio = -1;
  // Methods
  // Constructors
  // Empty Constructor
  public Tech ( ) { }
  // Accessor Methods
  // Get the value of energy
  // 
  // @return the value of energy
  private int getEnergy (  ) {
    return this.energy;
  }
  // Set the value of energy
  // 
  // 
  private void setEnergy ( int value  ) {
    this.energy = value;
  }
  // Get the value of weap
  // 
  // @return the value of weap
  private int getWeap (  ) {
    return this.weap;
  }
  // Set the value of weap
  // 
  // 
  private void setWeap ( int value  ) {
    this.weap = value;
  }
  // Get the value of prop
  // 
  // @return the value of prop
  private int getProp (  ) {
    return this.prop;
  }
  // Set the value of prop
  // 
  // 
  private void setProp ( int value  ) {
    this.prop = value;
  }
  // Get the value of con
  // 
  // @return the value of con
  private int getCon (  ) {
    return this.con;
  }
  // Set the value of con
  // 
  // 
  private void setCon ( int value  ) {
    this.con = value;
  }
  // Get the value of elect
  // 
  // @return the value of elect
  private int getElect (  ) {
    return this.elect;
  }
  // Set the value of elect
  // 
  // 
  private void setElect ( int value  ) {
    this.elect = value;
  }
  // Get the value of bio
  // 
  // @return the value of bio
  private int getBio (  ) {
    return this.bio;
  }
  // Set the value of bio
  // 
  // 
  private void setBio ( int value  ) {
    this.bio = value;
  }
  // Operations
  // @param raceTech Tech of RaceBattleStub being compared to
  // @return number of tech levels race exceeds components requirements for miniturization purposes
  // @param raceTech 
  public int exceedRequirementsOf ( RaceTech raceTech) {
  	//  TODO Auto-generated method stub
  	return 0;
  }
}

