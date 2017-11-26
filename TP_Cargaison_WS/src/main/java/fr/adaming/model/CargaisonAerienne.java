package fr.adaming.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class CargaisonAerienne extends Cargaison implements Serializable{
	
	// Attribut
	private double poidsMax;

	// Constructeur
	public CargaisonAerienne() {
		super();
	}

	public CargaisonAerienne(double poidsMax) {
		super();
		this.poidsMax = poidsMax;
	}

	public CargaisonAerienne(String reference, double distance, Date dateLivraison, double poidsMax) {
		super(reference, distance, dateLivraison);
		this.poidsMax = poidsMax;
	}

	// Getters/Setters
	public double getPoidsMax() {
		return poidsMax;
	}

	public void setPoidsMax(double poidsMax) {
		this.poidsMax = poidsMax;
	}

	@Override
	public String toString() {
		return "CargaisonAerienne [poidsMax=" + poidsMax + ", reference=" + reference + ", distance=" + distance
				+ ", dateLivraison=" + dateLivraison + ", listeMarchandise=" + listeMarchandise + "]";
	}
}
