package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Cargaison;

public interface ICargaisonService {

	public List<Cargaison> getAllCargaisons();

	public Cargaison getCargaisonById(String sequ);

	public Cargaison addCargaison(Cargaison newCarg);
}
