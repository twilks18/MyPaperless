package com.mypaperlessnotebook.models;

import java.util.ArrayList;
import java.util.Date;

public class Experiment {
	private String title;
	private String procedure;
	private String purpose;
	private String conclusion;
	private String observation;
	Date created;
	ArrayList<String> materials;
	ArrayList<String> chemical;
	
	public Experiment(String title, String procedure, String purpose, String conclusion, String observation) {
		
		this.title = title;
		this.procedure = procedure;
		this.purpose = purpose;
		this.conclusion = conclusion;
		this.observation = observation;
		this.created = new Date();
		materials = new ArrayList<String>();
		chemical = new ArrayList<String>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProcedure() {
		return procedure;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public Date getDate() {
		return created;
	}

	public void setDate(Date date) {
		this.created  = date;
	}

	public ArrayList<String> getMaterials() {
		return materials;
	}
	
	public void addMaterials(String materials){
		this.materials.add(materials);
	}
	
	public void removeMaterials(String materials){
		this.materials.remove(materials);
	}

	public ArrayList<String> getChemical() {
		return chemical;
	}
	
	public void addChemical(String chemical){
		this.chemical.add(chemical);
	}
	
	public void removeChemical(String chemical){
		this.chemical.remove(chemical);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Experiment e1 =  new Experiment("A1","B1","C1","D1","E1");
		System.out.println(e1.getTitle());
		
		e1.addMaterials("pencil");
		System.out.println(e1.getMaterials());
		
		e1.addMaterials("paper");
		System.out.println(e1.getMaterials());
		System.out.println(e1.getMaterials().size());
		System.out.println(e1.getMaterials().indexOf("paper"));
		

	}
	
	
	
	
	
	

}
