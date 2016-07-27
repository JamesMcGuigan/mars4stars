package mars4stars.unused;

/**************************************************************************
 *  Cost.java                                                            *
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



// Class Cost
// 
public class Cost {
  // Fields
  // Items cost in Ironium
  private int iron;
  // Items cost in Boranium
  private int bora;
  // Items cost in Germanium
  private int germ;
  // Items cost in Resources
  private int res;
  // 
  private int mass;
  // Methods
  // Constructors
  // Empty Constructor
  public Cost ( ) { }
  // Accessor Methods
  // Items cost in Ironium
  private int getIron (  ) {
    return this.iron;
  }
  // Items cost in Ironium
  private void setIron ( int value  ) {
    this.iron = value;
  }
  // Items cost in Boranium
  private int getBora (  ) {
    return this.bora;
  }
  // Items cost in Boranium
  private void setBora ( int value  ) {
    this.bora = value;
  }
  // Items cost in Germanium
  private int getGerm (  ) {
    return this.germ;
  }
  // Items cost in Germanium
  private void setGerm ( int value  ) {
    this.germ = value;
  }
  // Items cost in Resources
  private int getRes (  ) {
    return this.res;
  }
  // Items cost in Resources
  private void setRes ( int value  ) {
    this.res = value;
  }
  // Get the value of mass
  // 
  // @return the value of mass
  private int getMass (  ) {
    return this.mass;
  }
  // Set the value of mass
  // 
  // 
  private void setMass ( int value  ) {
    this.mass = value;
  }
  // Operations
  // 
  // @param haveTech 
  // @param needTech 
  public Cost CalculateMiniaturization ( Tech haveTech, Tech needTech) {
  	//  TODO Auto-generated method stub
  	return null;
  }
}

