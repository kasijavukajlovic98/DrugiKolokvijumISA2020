package kolokvijum2.app.controller;

import java.util.ArrayList;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kolokvijum2.app.DTO.GostDTO;
import kolokvijum2.app.model.Gost;
import kolokvijum2.app.service.GostService;


@Controller
@RequestMapping(path = "/gost")
public class GostController {
	
	@Autowired
	GostService service;
	ArrayList<GostDTO> lista;
	
	//Dobavi sve
	@RequestMapping(path = "", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<GostDTO>> dobaviSve(){
		ModelMapper mm = new ModelMapper();
		
		lista = new ArrayList<GostDTO>();
		for(Gost x:service.dobaviSve()) {
			lista.add(mm.map(x, GostDTO.class));
		}
		
		return new ResponseEntity<ArrayList<GostDTO>>(lista, HttpStatus.OK);
	}
	
	
	//Dobavi po ID
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<GostDTO> dobaviPoId(@PathVariable("id") Long id){
		ModelMapper mm = new ModelMapper();
		Gost existing = service.dobaviPoId(id);
		
		if(existing == null) {
			return new ResponseEntity<GostDTO>(HttpStatus.NOT_FOUND);
		}
		GostDTO obj = mm.map(existing, GostDTO.class);
		return new ResponseEntity<GostDTO>(obj, HttpStatus.OK);
		
	}
	
	//Dodavanje novog
	@RequestMapping(path = "", method = RequestMethod.POST)
    public ResponseEntity<Gost> dodajNovi(@RequestBody Gost obj) {
        if (service.dobaviPoId(obj.getId()) != null) {
            return new ResponseEntity<Gost>(HttpStatus.CONFLICT);
        }
        service.save(obj);
        return new ResponseEntity<Gost>(HttpStatus.OK);
    }
	
	//Izmena
    @RequestMapping(path = "", method = RequestMethod.PUT)
    public ResponseEntity<Gost> izmeni(@RequestBody Gost obj) {
    	Gost existing = service.dobaviPoId(obj.getId());
        
        if (existing == null) {
            return new ResponseEntity<Gost>(HttpStatus.NOT_FOUND);
        }
        
        existing.setEmail(obj.getEmail());
        existing.setLozinka(obj.getLozinka());
        
        service.save(existing);
        return new ResponseEntity<Gost>(HttpStatus.OK);
    }

    //Brisanje
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> brisanje(@PathVariable("id") Long id) {
    	
        if (service.dobaviPoId(id) == null) {
            return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
        }
        
        service.delete(id);
        return new ResponseEntity<Object>(HttpStatus.OK);
        
    }
}
    