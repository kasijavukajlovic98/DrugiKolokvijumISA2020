package drugiKolokvijumISA.app.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import drugiKolokvijumISA.app.DTO.VlasnikDTO;
import drugiKolokvijumISA.app.model.VlasnikModel;
import drugiKolokvijumISA.app.service.VlasnikService;

@Controller
@CrossOrigin
@RequestMapping(path = "/vlasnik")
public class VlasnikController extends AbstractController<VlasnikModel, VlasnikDTO, VlasnikService>{

	public VlasnikController(VlasnikService service) {
		super(service, VlasnikDTO.class);
		
	}

	@Override
	public ResponseEntity<ArrayList<VlasnikDTO>> dobaviSve() {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		System.out.println(currentPrincipalName);
		
		ArrayList<VlasnikDTO> lista = new ArrayList<VlasnikDTO>();
		
		for(VlasnikModel x:service.findAll()) {
			if(x.getKorisnickoIme().equals(currentPrincipalName)) {
				lista.add(mm.map(x, VlasnikDTO.class));
			}
			
		}
		return new ResponseEntity<ArrayList<VlasnikDTO>>(lista, HttpStatus.OK);
		
	}
	
	

}
