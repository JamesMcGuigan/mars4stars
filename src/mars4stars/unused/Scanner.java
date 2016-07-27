package mars4stars.unused;

/**************************************************************************
 *  Scanner.java                                                            *
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



// Class Scanner
// 
public class Scanner extends Component {
  // Fields
  // 
  private int range;
  // 
  private int penRange;
  // Methods
  // Constructors
  // Empty Constructor
  public Scanner ( ) { }
  // Accessor Methods
  // Get the value of range
  // 
  // @return the value of range
  private int getRange (  ) {
    return this.range;
  }
  // Set the value of range
  // 
  // 
  private void setRange ( int value  ) {
    this.range = value;
  }
  // Get the value of penRange
  // 
  // @return the value of penRange
  private int getPenRange (  ) {
    return this.penRange;
  }
  // Set the value of penRange
  // 
  // 
  private void setPenRange ( int value  ) {
    this.penRange = value;
  }
  // Operations
}

