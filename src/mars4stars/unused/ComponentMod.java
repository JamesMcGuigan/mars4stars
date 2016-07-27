package mars4stars.unused;

/**************************************************************************
 *  ComponentMod.java                                                            *
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



// Class ComponentMod
// 
public class ComponentMod implements ComponentModInterface {
  // Fields
  // Methods
  // Constructors
  // Empty Constructor
  public ComponentMod ( ) { }
  // Accessor Methods
  // Operations

/* (non-Javadoc)
 * @see ComponentModInterface#getArmourDP(int, Armour)
 */
public int getArmourDP(int returnValue, Armour component) {
	// TODO Auto-generated method stub
	return 0;
}

/* (non-Javadoc)
 * @see ComponentModInterface#getShieldDP(int, Shield)
 */
public void getShieldDP(int returnValue, Shield component) {
	// TODO Auto-generated method stub
	
}

/* (non-Javadoc)
 * @see ComponentModInterface#getCapasitorPercentage(double, Capasitor)
 */
public double getCapasitorPercentage(double returnValue, Capasitor component) {
	// TODO Auto-generated method stub
	return 0;
}

/* (non-Javadoc)
 * @see ComponentModInterface#getDeflectorPercentage(double, Deflector)
 */
public double getDeflectorPercentage(double returnValue, Deflector component) {
	// TODO Auto-generated method stub
	return 0;
}

/* (non-Javadoc)
 * @see ComponentModInterface#getComputerInit(int, Computer)
 */
public int getComputerInit(int returnValue, Computer component) {
	// TODO Auto-generated method stub
	return 0;
}

/* (non-Javadoc)
 * @see ComponentModInterface#getComputerPercentage(double, Computer)
 */
public double getComputerPercentage(double returnValue, Computer component) {
	// TODO Auto-generated method stub
	return 0;
}

/* (non-Javadoc)
 * @see ComponentModInterface#getJammerPercentage(double, Jammer)
 */
public double getJammerPercentage(double returnValue, Jammer component) {
	// TODO Auto-generated method stub
	return 0;
}

/* (non-Javadoc)
 * @see ComponentModInterface#getEngineWarpUsage(int, Engine, int, double)
 */
public int getEngineWarpUsage(int returnValue, Engine component, int warpSpeed, double distance) {
	// TODO Auto-generated method stub
	return 0;
}

/* (non-Javadoc)
 * @see ComponentModInterface#getJetBonus(double, ManeuveringJet)
 */
public double getJetBonus(double returnValue, ManeuveringJet component) {
	// TODO Auto-generated method stub
	return 0;
}

/* (non-Javadoc)
 * @see ComponentModInterface#getScannerRange(int, Scanner)
 */
public int getScannerRange(int returnValue, Scanner component) {
	// TODO Auto-generated method stub
	return 0;
}
/* (non-Javadoc)
 * @see ComponentModInterface#canUseComponent(boolean, Component)
 */
public boolean canUseComponent(boolean returnValue, Component component) {
	// TODO Auto-generated method stub
	return false;
}
/* (non-Javadoc)
 * @see ComponentModInterface#isEngineWarp10(boolean, Engine)
 */
public boolean isEngineWarp10(boolean returnValue, Engine component) {
	// TODO Auto-generated method stub
	return false;
}
}

