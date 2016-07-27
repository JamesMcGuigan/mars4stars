package mars4stars.unused;

/**************************************************************************
 *  Stack.java                                                            *
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


// Class Stack
// 
public class Stack {
  // Fields
  // 
  private int shipCount;
  // 
  private int damage512ths = 512;
  // 
  private Design design;
  // 
  private int cargoAmount;
  // Methods
  // Constructors
  // Empty Constructor
  public Stack ( ) { }
  // Accessor Methods
  // Get the value of shipCount
  // 
  // @return the value of shipCount
  private int getShipCount (  ) {
    return this.shipCount;
  }
  // Set the value of shipCount
  // 
  // 
  private void setShipCount ( int value  ) {
    this.shipCount = value;
  }
  // Get the value of damage512ths
  // 
  // @return the value of damage512ths
  private int getDamage512ths (  ) {
    return this.damage512ths;
  }
  // Set the value of damage512ths
  // 
  // 
  private void setDamage512ths ( int value  ) {
    this.damage512ths = value;
  }
  // Get the value of design
  // 
  // @return the value of design
  private Design getDesign (  ) {
    return this.design;
  }
  // Set the value of design
  // 
  // 
  private void setDesign ( Design value  ) {
    this.design = value;
  }
  // Get the value of cargoAmount
  // 
  // @return the value of cargoAmount
  private int getCargoAmount (  ) {
    return this.cargoAmount;
  }
  // Set the value of cargoAmount
  // 
  // 
  private void setCargoAmount ( int value  ) {
    this.cargoAmount = value;
  }
  // Operations
}

