package mars4stars.unused;

/**************************************************************************
 *  CargoPod.java                                                            *
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


// Class CargoPod
// 
public class CargoPod extends Component {
  // Fields
  // 
  private int cargo;
  // Methods
  // Constructors
  // Empty Constructor
  public CargoPod ( ) { }
  // Accessor Methods
  // Get the value of cargo
  // 
  // @return the value of cargo
  private int getCargo (  ) {
    return this.cargo;
  }
  // Set the value of cargo
  // 
  // 
  private void setCargo ( int value  ) {
    this.cargo = value;
  }
  // Operations
}

