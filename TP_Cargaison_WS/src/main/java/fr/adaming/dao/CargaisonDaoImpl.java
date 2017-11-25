package fr.adaming.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Cargaison;

@Repository
public class CargaisonDaoImpl implements ICargaisonDao {

	@Autowired
	private SessionFactory sf;
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public List<Cargaison> getAllCargaisons() {
		
		String req = "FROM Cargaison";
		return sf.getCurrentSession().createQuery(req).list();
	}

	@Override
	public Cargaison getCargaisonById(String sequ) {
		return (Cargaison) sf.getCurrentSession().get(Cargaison.class, sequ);
	}

	@Override
	public Cargaison addCargaison(Cargaison newCarg) {
		return (Cargaison) sf.getCurrentSession().save(newCarg);
	}

}
