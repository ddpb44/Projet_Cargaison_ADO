package fr.adaming.model;

import javax.persistence.Entity;

@Entity
public class CargaisonRoutiere extends Cargaison{
	
	// Attributs
	private double temperature;

	// Constructeurs
	public CargaisonRoutiere() {
		super();
	}

	public CargaisonRoutiere(double temperature) {
		super();
		this.temperature = temperature;
	}

	// Getters/Setters
	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "CargaisonRoutiere [temperature=" + temperature + ", reference=" + reference + ", distance=" + distance
				+ ", dateLivraison=" + dateLivraison + ", listeMarchandise=" + listeMarchandise + "]";
	}
}
