package mars4stars.testing;

import java.util.*;
import mars4stars.*;


/**
 * General variable setup for Junit tests in package mars4stars.testing
 * 
 * <br><br>Copyright (C) 2004 - Licenced under the GNU GPL
 * @author James McGuigan
 */
public class Universe {
	/*
	 * @see TestCase#setUp()
	 */
    public Universe() {
        this(true);
	}

    /**
     * Create a new instance of Universe and optionally initalize it
     * @param init
     */
    public Universe(boolean init) {
        if(init) {
	        this.initRace();
	        this.initStack();
	        this.initGrid();
        }
	}
	

    // used for GridTest
    // used for GridSquareTest
    	public Grid grid;
    	public Grid testGrid;
	    public GridSquare testGridSquare;
	    public GridSquare gridSquare;
	    
	public void initGrid() {
	    this.initRace();
	    grid = new Grid(10,10);
	    testGrid = new Grid(0,0);

	    testGridSquare = new GridSquare(3,4,testGrid);
	    Log.ignore(1, "GridSquare.movestack() moving an uninitalized StackBattleStub"); 	    
	    testGridSquare.moveStack(testStack2a, testGridSquare); // will generate error
	    
	    // load testStacks into starting position
	    grid.loadStacks(Collections.singleton(testStack1), grid.getSquare(1,5));
	    grid.loadStacks(Collections.singleton(testStack2), grid.getSquare(9,5));
	}

	
    // used for StackBattleStubTest
	// used for DesignBattleStubTest  
		public WeaponBattleStub testWeapon1;
		public SlotBattleStub testSlot1;
		public RaceInterface testRace1;
		public RaceInterface testRace2;
		public BattleOrders testBattleOrders1;
		public ShipType testShipType;
		public DesignBattleStub testDesign1;
		public ArrayList vTestSlots1;
		public StackBattleStub testStack1;
		public StackBattleStub testStack2;
		public StackBattleStub testStack2a;
		public StackBattleStub testStack2b;
	public void initStack() {
		testWeapon1 = new WeaponBattleStub("Xray",	// name
					       new WeaponType(WeaponType.BEAM), // type
														1,	// range
														16,	// power
														9);	// init
		testSlot1 = new SlotBattleStub(testWeapon1, 5);		// Slot has 5 Xray 
		vTestSlots1 = new ArrayList();			// Design has 3 slots of Xrays
			vTestSlots1.add(testSlot1);
			vTestSlots1.add(testSlot1);
			vTestSlots1.add(testSlot1);			
		testRace1 = new RaceBattleStub("Test RaceBattleStub 1");		
		testRace2 = new RaceBattleStub("Test RaceBattleStub 1");
		testBattleOrders1 = new BattleOrders();
		testDesign1 = new 	DesignBattleStub("Test Design",	// name
												50,			// shields
												100,		// armour
												0.15,		// jamming
												0.3,		// compBonus
												8,			// init
												0.1,		// capBouns
												0.9,		// defBonus
												25,			// cost
												1.5,		// battleSpeed
						new ShipType(ShipType.FREIGHTER),	// hullType 
												testRace1,	// race builder
												vTestSlots1);//Slots
		
		testStack1 = new StackBattleStub(256,				// armour512ths
										10,					// shipCount
										false,				// canRegenShields
										testRace1,			// race owner
										testDesign1,		// desgin
										testBattleOrders1);	// battleOrders

		testStack2 = new StackBattleStub(512,				// armour512ths
										1,					// shipCount
										true,				// canRegenShields
										testRace2,			// race owner
										testDesign1,		// design
										testBattleOrders1);	// battleOrders

		testStack2a = new StackBattleStub(512,				// armour512ths
										1,					// shipCount
										true,				// canRegenShields
										testRace2,			// race owner
										testDesign1,		// design
										testBattleOrders1);	// battleOrders

		testStack2b = new StackBattleStub(512,				// armour512ths
										1,					// shipCount
										true,				// canRegenShields
										testRace2,			// race owner
										testDesign1,		// design
										testBattleOrders1);	// battleOrders
	}

    // used for RaceBattleStubTest  
	    public RaceBattleStub nullRace; 
	    public RaceBattleStub xindi;
	    public RaceBattleStub federation;
	    public RaceBattleStub tribbles;
	    public HashSet raceSet;
	public void initRace() {
	    nullRace   = new RaceBattleStub(null);
	    xindi      = new RaceBattleStub("Xindi");
	    federation = new RaceBattleStub("Federation");
	    tribbles   = new RaceBattleStub("Tribbles");
	    raceSet    = new HashSet();
	    	raceSet.add(nullRace); 
	    	raceSet.add(xindi); 
	    	raceSet.add(federation);
	    	raceSet.add(tribbles);
	    
	    xindi.set(federation, RaceInterface.ENEMY, true);
	    xindi.set(tribbles,   RaceInterface.FRIEND, true);
	    xindi.set(nullRace,   RaceInterface.NEUTRAL, true);
	
	    federation.set(tribbles, RaceInterface.FRIEND, true);
	    federation.set(nullRace, RaceInterface.NEUTRAL, true);
	    
	    nullRace.set(tribbles, RaceInterface.NEUTRAL);
	}	

}
