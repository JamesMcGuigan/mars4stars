package mars4stars.unused;

/**************************************************************************
 *  Computer.java                                                            *
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



// Class Computer
// 
public class Computer extends Component {
  // Fields
  // 
  private int init;
  // 
  private int percentage;
  // Methods
  // Constructors
  // Empty Constructor
  public Computer ( ) { }
  // Accessor Methods
  // Get the value of init
  // 
  // @return the value of init
  private int getInit (  ) {
    return this.init;
  }
  // Set the value of init
  // 
  // 
  private void setInit ( int value  ) {
    this.init = value;
  }
  // Get the value of percentage
  // 
  // @return the value of percentage
  private int getPercentage (  ) {
    return this.percentage;
  }
  // Set the value of percentage
  // 
  // 
  private void setPercentage ( int value  ) {
    this.percentage = value;
  }
  // Operations
}

