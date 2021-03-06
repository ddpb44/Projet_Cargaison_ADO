package fr.adaming.model;

public class Marchandise {

	// Attributs
	private long numero;

	private String nom;
	private double poids;
	private double volume;
	
	private Cargaison cargaison;

	public Cargaison getCargaison() {
		return cargaison;
	}

	public void setCargaison(Cargaison cargaison) {
		this.cargaison = cargaison;
	}

	// Constructeurs
	public Marchandise() {
		super();
	}

	public Marchandise(String nom, double poids, double volume) {
		super();
		this.nom = nom;
		this.poids = poids;
		this.volume = volume;
	}

	public Marchandise(long numero, String nom, double poids, double volume) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.poids = poids;
		this.volume = volume;
	}

	// Getters/Setters
	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	// M�thode toString()
	@Override
	public String toString() {
		return "Marchandise [numero=" + numero + ", nom=" + nom + ", poids=" + poids + ", volume=" + volume + "]";
	}

}
