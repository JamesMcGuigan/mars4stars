package mars4stars.unused;

/**************************************************************************
 *  FuelPod.java                                                            *
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



// Class FuelPod
// 
public class FuelPod extends Component {
  // Fields
  // 
  private int fuel;
  // Methods
  // Constructors
  // Empty Constructor
  public FuelPod ( ) { }
  // Accessor Methods
  // Get the value of fuel
  // 
  // @return the value of fuel
  private int getFuel (  ) {
    return this.fuel;
  }
  // Set the value of fuel
  // 
  // 
  private void setFuel ( int value  ) {
    this.fuel = value;
  }
  // Operations
}

