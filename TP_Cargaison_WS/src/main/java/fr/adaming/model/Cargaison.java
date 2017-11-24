package fr.adaming.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Cargaison {
	
	// Attributs
	@Id
	@Column(name="id_c")
	@GeneratedValue(strategy=GenerationType.TABLE)
	protected String reference;
	
	protected double distance;
	protected Date dateLivraison;
	
	@OneToMany(mappedBy="cargaison")
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
