package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Cargaison implements Serializable{
	
	// Attributs
	@Id
	@Column(name="id_c")
	@GeneratedValue(strategy=GenerationType.TABLE)
	protected String reference;
	
	protected double distance;
	
	@Temporal(TemporalType.DATE)
	protected Date dateLivraison;
	
	@OneToMany(mappedBy="cargaison",fetch=FetchType.EAGER)
	@JsonIgnore //JSonIgnore utilisé pour empecher la récursion marchandise-cargaison lors de la serialization
	//Donc a prendre en compte dans les methodes telles que get by keyword ou autre -> deux appels
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
	
	public List<Marchandise> getListeMarchandise() {
		return listeMarchandise;
	}
	public void setListeMarchandise(List<Marchandise> listeMarchandise) {
		this.listeMarchandise = listeMarchandise;
	}
	// Methode toString()
	@Override
	public String toString() {
		return "Cargaison [reference=" + reference + ", distance=" + distance + ", dateLivraison=" + dateLivraison
				+ "]";
	}
	
	

}
