package mars4stars.unused;

/**************************************************************************
 *  MineLayer.java                                                            *
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


// Class MineLayer
// 
public class MineLayer extends Component {
  // Fields
  // 
  private String type;
  // 
  private int mines;
  // Methods
  // Constructors
  // Empty Constructor
  public MineLayer ( ) { }
  // Accessor Methods
  // Get the value of type
  // 
  // @return the value of type
  private String getType (  ) {
    return this.type;
  }
  // Set the value of type
  // 
  // 
  private void setType ( String value  ) {
    this.type = value;
  }
  // Get the value of mines
  // 
  // @return the value of mines
  private int getMines (  ) {
    return this.mines;
  }
  // Set the value of mines
  // 
  // 
  private void setMines ( int value  ) {
    this.mines = value;
  }
  // Operations
}

