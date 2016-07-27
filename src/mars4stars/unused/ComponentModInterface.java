package mars4stars.unused;

/**************************************************************************
 *  ComponentModInterface.java                                                            *
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



// Interface ComponentModInterface
// 
abstract public interface ComponentModInterface {
  // Methods
  // Constructors
  // Accessor Methods
  // Operations
  // 
  // @param returnValue 
  // @param component 
  public boolean canUseComponent ( boolean returnValue, Component component);
    
  
  // 
  // @param returnValue 
  // @param component 
  public int getArmourDP ( int returnValue, Armour component);
    
  
  // 
  // @param returnValue 
  // @param component 
  public void getShieldDP ( int returnValue, Shield component);
    
  
  // 
  // @param returnValue 
  // @param component 
  public double getCapasitorPercentage ( double returnValue, Capasitor component);
    
  
  // 
  // @param returnValue 
  // @param component 
  public double getDeflectorPercentage ( double returnValue, Deflector component);
    
  
  // 
  // @param returnValue 
  // @param component 
  public int getComputerInit ( int returnValue, Computer component);
    
  
  // 
  // @param returnValue 
  // @param component 
  public double getComputerPercentage ( double returnValue, Computer component);
    
  
  // 
  // @param returnValue 
  // @param component 
  public double getJammerPercentage ( double returnValue, Jammer component);
    
  
  // 
  // @param returnValue 
  // @param component 
  public boolean isEngineWarp10 ( boolean returnValue, Engine component);
    
  
  // 
  // @param returnValue 
  // @param component 
  // @param warpSpeed 
  // @param distance 
  public int getEngineWarpUsage ( int returnValue, Engine component, int warpSpeed, double distance);
    
  
  // 
  // @param returnValue 
  // @param component 
  public double getJetBonus ( double returnValue, ManeuveringJet component);
    
  
  // 
  // @param returnValue 
  // @param component 
  public int getScannerRange ( int returnValue, Scanner component);
    
  
}

