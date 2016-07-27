/**************************************************************************
 *  Component.java                                                            *
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

import java.util.Set;

// Class Component
// 
public class Component extends ComponentMod {
  // Fields
  // 
  protected String name;
  // 
  protected Icon icon;
  // 
  protected Set sType;
  // 
  protected int idCode;
  // 
  protected Component subComponent;
  // 
  private ComponentViewer componentViewer;
  // Methods
  // Constructors
  // Empty Constructor
  public Component ( ) { }
  // Accessor Methods
  // Get the value of name
  // 
  // @return the value of name
  protected String getName (  ) {
    return this.name;
  }
  // Set the value of name
  // 
  // 
  protected void setName ( String value  ) {
    this.name = value;
  }
  // Get the value of icon
  // 
  // @return the value of icon
  protected Icon getIcon (  ) {
    return this.icon;
  }
  // Set the value of icon
  // 
  // 
  protected void setIcon ( Icon value  ) {
    this.icon = value;
  }
  // Get the value of sType
  // 
  // @return the value of sType
  protected Set getSType (  ) {
    return this.sType;
  }
  // Set the value of sType
  // 
  // 
  protected void setSType ( Set value  ) {
    this.sType = value;
  }
  // Get the value of idCode
  // 
  // @return the value of idCode
  protected int getIdCode (  ) {
    return this.idCode;
  }
  // Set the value of idCode
  // 
  // 
  protected void setIdCode ( int value  ) {
    this.idCode = value;
  }
  // Get the value of subComponent
  // 
  // @return the value of subComponent
  protected Component getSubComponent (  ) {
    return this.subComponent;
  }
  // Set the value of subComponent
  // 
  // 
  protected void setSubComponent ( Component value  ) {
    this.subComponent = value;
  }
  // Get the value of componentViewer
  // 
  // @return the value of componentViewer
  private ComponentViewer getComponentViewer (  ) {
    return this.componentViewer;
  }
  // Set the value of componentViewer
  // 
  // 
  private void setComponentViewer ( ComponentViewer value  ) {
    this.componentViewer = value;
  }
  // Operations
  // 
  // @param design 
  public boolean canBeUsed ( Design design) {
  	//  TODO Auto-generated method stub
  	return true;    
  }
}

