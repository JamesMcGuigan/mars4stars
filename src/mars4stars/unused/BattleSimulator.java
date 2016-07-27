/**************************************************************************
 *  BattleSimulator.java                                                            *
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
import java.util.List;

import mars4stars.Grid;

// Class BattleSimulator
// Is responsible for simulating the action for a Battle Event
// 
// creates Grid
// creates StackBattleStub
// runs generateSlotFiringOrder
// runs generateStackMovementOrder
// runs generateValidTargetList on 
// loads StackBattleStub on Grid
public class BattleSimulator {
  // Fields
  // The current round of the battle - a round ends when all ships have moved and shot
  private int round = 0;
  // 
  private int phase = 0;
  // 
  private List vStackMovementOrder;
  // 
  private List vSlotFiringOrder;
  // 
  private Grid grid;
  // 
  private List vStackBattleStub;
  // 
  private List vSlotBattleStub;
  // 
  private List vShot;
  // 
  private boolean energyDampenerPresent;
  // Methods
  // Constructors
  // Empty Constructor
  public BattleSimulator ( ) { }
  // Accessor Methods
  // The current round of the battle - a round ends when all ships have moved and shot
  private int getRound (  ) {
    return this.round;
  }
  // The current round of the battle - a round ends when all ships have moved and shot
  private void setRound ( int value  ) {
    this.round = value;
  }
  // Get the value of phase
  // 
  // @return the value of phase
  private int getPhase (  ) {
    return this.phase;
  }
  // Set the value of phase
  // 
  // 
  private void setPhase ( int value  ) {
    this.phase = value;
  }
  // Get the value of vStackMovementOrder
  // 
  // @return the value of vStackMovementOrder
  private List getVStackMovementOrder (  ) {
    return this.vStackMovementOrder;
  }
  // Set the value of vStackMovementOrder
  // 
  // 
  private void setVStackMovementOrder ( List value  ) {
    this.vStackMovementOrder = value;
  }
  // Get the value of vSlotFiringOrder
  // 
  // @return the value of vSlotFiringOrder
  private List getVSlotFiringOrder (  ) {
    return this.vSlotFiringOrder;
  }
  // Set the value of vSlotFiringOrder
  // 
  // 
  private void setVSlotFiringOrder ( List value  ) {
    this.vSlotFiringOrder = value;
  }
  // Get the value of grid
  // 
  // @return the value of grid
  private Grid getGrid (  ) {
    return this.grid;
  }
  // Set the value of grid
  // 
  // 
  private void setGrid ( Grid value  ) {
    this.grid = value;
  }
  // Get the value of vStackBattleStub
  // 
  // @return the value of vStackBattleStub
  private List getVStackBattleStub (  ) {
    return this.vStackBattleStub;
  }
  // Set the value of vStackBattleStub
  // 
  // 
  private void setVStackBattleStub ( List value  ) {
    this.vStackBattleStub = value;
  }
  // Get the value of vSlotBattleStub
  // 
  // @return the value of vSlotBattleStub
  private List getVSlotBattleStub (  ) {
    return this.vSlotBattleStub;
  }
  // Set the value of vSlotBattleStub
  // 
  // 
  private void setVSlotBattleStub ( List value  ) {
    this.vSlotBattleStub = value;
  }
  // Get the value of vShot
  // 
  // @return the value of vShot
  private List getVShot (  ) {
    return this.vShot;
  }
  // Set the value of vShot
  // 
  // 
  private void setVShot ( List value  ) {
    this.vShot = value;
  }
  // Get the value of energyDampenerPresent
  // 
  // @return the value of energyDampenerPresent
  private boolean getEnergyDampenerPresent (  ) {
    return this.energyDampenerPresent;
  }
  // Set the value of energyDampenerPresent
  // 
  // 
  private void setEnergyDampenerPresent ( boolean value  ) {
    this.energyDampenerPresent = value;
  }
  // Operations
  // @return List of BattleFrame
  // @param vFleet 
  // @param x 
  // @param y 
  // @param z 
  public List runSimulator ( List vFleet, int x, int y, int z) {
  	//  TODO Auto-generated method stub
  	return null;
  }
  public void generateSlotFiringOrder ( ) {
    
  }
  public void generateStackMovementOrder ( ) {
    
  }
  public Set getRacesPresent ( ) {
  	//  TODO Auto-generated method stub
  	return null;    
  }
  public Set racesRemaining ( ) {
  	//  TODO Auto-generated method stub
  	return null;    
  }
}

