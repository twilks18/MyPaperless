package com.mypaperlesslabnotebook;

import junit.framework.TestCase;
import com.mypaperlessnotebook.models.Experiment;

public class ExperimentTest extends TestCase {
	
		private Experiment e1;
		
		
	public void setup(){
		e1 = new Experiment("A1","B1","C1","D1","E1");

	}
	

	public void testExperiment() {
		setup();
		assertEquals("A1",e1.getTitle());
		assertEquals("D1",e1.getConclusion());
		assertEquals("E1",e1.getObservation());
		assertEquals("B1",e1.getProcedure());
		assertEquals("C1",e1.getPurpose());
			
	}
	public void testSetTitle() {
		setup();
		e1.setTitle("AB");
		assertEquals("AB",e1.getTitle());
	}


	public void testSetProcedure() {
		setup();
		e1.setProcedure("Do this");
		assertEquals("Do this", e1.getProcedure());
	}

	
	public void testSetPurpose() {
		setup();
		e1.setPurpose("Because I want to.");
		assertEquals("Because I want to.",e1.getPurpose());
	}

	
	public void testSetConclusion() {
		setup();
		e1.setConclusion("It all worked out.");
		assertEquals("It all worked out.", e1.getConclusion());
	}


	public void testSetObservation() {
		setup();
		e1.setObservation("I saw it happen.");
		assertEquals("I saw it happen.", e1.getObservation());
	}
	
	public void testAddMaterials() {
		setup();
		assertEquals(0,e1.getMaterials().size());
		e1.addMaterials("pencil");
		assertEquals(1,e1.getMaterials().size());
		e1.addMaterials("paper");
		assertEquals(2,e1.getMaterials().size());
		assertEquals(0, e1.getMaterials().indexOf("pencil"));
		assertEquals(1, e1.getMaterials().indexOf("paper"));
		
		
	}


	public void testRemoveMaterials() {
		setup();
		assertEquals(0,e1.getMaterials().size());
		e1.addMaterials("pencil");
		e1.addMaterials("paper");
		assertEquals(2,e1.getMaterials().size());
		e1.removeMaterials("pencil");
		assertEquals(1,e1.getMaterials().size());
		assertEquals(0,e1.getMaterials().indexOf("paper"));
		
		
	}
	
	public void testAddChemical() {
		setup();
		assertEquals(0,e1.getChemical().size());
		e1.addChemical("Nitrogen");
		assertEquals(1,e1.getChemical().size());
		e1.addChemical("Ethanol");
		assertEquals(2,e1.getChemical().size());
		assertEquals(0,e1.getChemical().indexOf("Nitrogen"));
		assertEquals(1,e1.getChemical().indexOf("Ethanol"));
	}

	
	public void testRemoveChemical() {
		setup();
		assertEquals(0,e1.getChemical().size());
		e1.addChemical("Nitrogen");
		assertEquals(1,e1.getChemical().size());
		e1.addChemical("Ethanol");
		assertEquals(2,e1.getChemical().size());
		e1.removeChemical("Nitrogen");
		assertEquals(1,e1.getChemical().size());
		assertEquals(0,e1.getChemical().indexOf("Ethanol"));
	}

}
