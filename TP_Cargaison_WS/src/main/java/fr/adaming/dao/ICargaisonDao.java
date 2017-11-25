package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Cargaison;

public interface ICargaisonDao {

	public List<Cargaison> getAllCargaisons();

	public Cargaison getCargaisonById(String sequ);

	public Cargaison addCargaison(Cargaison newCarg);

}
