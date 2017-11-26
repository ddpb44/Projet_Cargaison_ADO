package fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Cargaison;
import fr.adaming.model.CargaisonAerienne;
import fr.adaming.service.ICargaisonService;

@RestController
public class CargaisonRest {

	@Autowired
	private ICargaisonService cargoServ;
	
	@RequestMapping(value="/cargaisons",method=RequestMethod.GET,produces="application/json")
	public  List<Cargaison> getAllCargaison(){
		return cargoServ.getAllCargaisons();
	}
	
	@RequestMapping(value="/cargaison",method=RequestMethod.GET,produces="application/json")
	public Cargaison getCargaisonById(@RequestParam("reference") String sequ){
		return cargoServ.getCargaisonById(sequ);
	}
	
	@RequestMapping(value="/cargaison",method=RequestMethod.POST,produces="application/json",consumes="application/json")
	public Cargaison addCargaison(@RequestBody Cargaison newCarg){
		System.out.println(newCarg);
		return cargoServ.addCargaison(newCarg);
	}
	
}
