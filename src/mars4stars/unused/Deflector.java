package mars4stars.unused;

/**************************************************************************
 *  Deflector.java                                                            *
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



// Class Deflector
// 
public class Deflector extends Component {
  // Fields
  // 
  private double percentage = 0.1;
  // Methods
  // Constructors
  // Empty Constructor
  public Deflector ( ) { }
  // Accessor Methods
  // Get the value of percentage
  // 
  // @return the value of percentage
  private double getPercentage (  ) {
    return this.percentage;
  }
  // Set the value of percentage
  // 
  // 
  private void setPercentage ( double value  ) {
    this.percentage = value;
  }
  // Operations
}

