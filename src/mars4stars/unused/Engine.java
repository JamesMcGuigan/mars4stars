/**************************************************************************
 *  Engine.java                                                           *
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

import java.util.Arrays;

// Class Engine
// 
public class Engine extends Component {
  // Fields
  // 
  private Arrays vFuelUsage;
  // 
  private int warpSpeed;
  // Methods
  // Constructors
  // Empty Constructor
  public Engine ( ) { }
  // Accessor Methods
  // Get the value of vFuelUsage
  // 
  // @return the value of vFuelUsage
  private Arrays getVFuelUsage (  ) {
    return this.vFuelUsage;
  }
  // Set the value of vFuelUsage
  // 
  // 
  private void setVFuelUsage ( Arrays value  ) {
    this.vFuelUsage = value;
  }
  // Get the value of warpSpeed
  // 
  // @return the value of warpSpeed
  private int getWarpSpeed (  ) {
    return this.warpSpeed;
  }
  // Set the value of warpSpeed
  // 
  // 
  private void setWarpSpeed ( int value  ) {
    this.warpSpeed = value;
  }
  // Operations
  public boolean isWarp10 ( ) {
  	//  TODO Auto-generated method stub
  	return true;
  }
  // 
  // @param warpSpeed 
  // @param distance 
  public int getFuelUsage ( int speed, double distance) {
  	//  TODO Auto-generated method stub
  	return 100;
  }
}

