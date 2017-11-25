package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.ICargaisonDao;
import fr.adaming.model.Cargaison;

@Service
@Transactional
public class CargaisonServiceImpl implements ICargaisonService {

	@Autowired
	private ICargaisonDao cargoDao;
	
	@Override
	public List<Cargaison> getAllCargaisons() {
		return cargoDao.getAllCargaisons();
	}

	@Override
	public Cargaison getCargaisonById(String sequ) {
		return cargoDao.getCargaisonById(sequ);
	}

	@Override
	public Cargaison addCargaison(Cargaison newCarg) {
		return cargoDao.addCargaison(newCarg);
	}

}
