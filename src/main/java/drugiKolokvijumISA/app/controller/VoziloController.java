package drugiKolokvijumISA.app.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import drugiKolokvijumISA.app.DTO.VoziloDTO;
import drugiKolokvijumISA.app.model.VoziloModel;
import drugiKolokvijumISA.app.security.JwtUtil;
import drugiKolokvijumISA.app.service.VoziloService;

@Controller
@CrossOrigin
@RequestMapping(path = "/vozilo")
public class VoziloController extends AbstractController<VoziloModel, VoziloDTO, VoziloService>{
		
	
	public VoziloController(VoziloService service) {
		super(service, VoziloDTO.class);
		
	}

	
	
	

}
