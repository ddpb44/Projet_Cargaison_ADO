package fr.adaming.model;

import javax.persistence.Entity;

@Entity
public class CargaisonAerienne extends Cargaison{
	
	// Attribut
	private double poidsMax;

	// Constructeur
	public CargaisonAerienne(double poidsMax) {
		super();
		this.poidsMax = poidsMax;
	}

	// Getters/Setters
	public double getPoidsMax() {
		return poidsMax;
	}

	public void setPoidsMax(double poidsMax) {
		this.poidsMax = poidsMax;
	}
	
	

}
