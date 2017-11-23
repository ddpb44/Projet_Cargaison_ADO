package fr.adaming.model;

import java.sql.Date;
import java.util.List;


public abstract class Cargaison {
	
	// Attributs
	protected String reference;
	
	protected double distance;
	protected Date dateLivraison;
	
	protected List<Marchandise> listeMarchandise;
	
	// Constructeurs
	public Cargaison() {
		super();
	}
	public Cargaison(double distance, Date dateLivraison) {
		super();
		this.distance = distance;
		this.dateLivraison = dateLivraison;
	}
	public Cargaison(String reference, double distance, Date dateLivraison) {
		super();
		this.reference = reference;
		this.distance = distance;
		this.dateLivraison = dateLivraison;
	}
	
	// Getters/Setters
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public Date getDateLivraison() {
		return dateLivraison;
	}
	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	
	// Methode toString()
	@Override
	public String toString() {
		return "Cargaison [reference=" + reference + ", distance=" + distance + ", dateLivraison=" + dateLivraison
				+ "]";
	}
	
	

}
