package drugiKolokvijumISA.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import drugiKolokvijumISA.app.DTO.ParkingKartaDTO;
import drugiKolokvijumISA.app.model.ParkingKartaModel;
import drugiKolokvijumISA.app.service.ParkingKartaService;

@Controller
@CrossOrigin
@RequestMapping(path = "/karta")
public class ParkingKartaController extends AbstractController<ParkingKartaModel, ParkingKartaDTO, ParkingKartaService>{

	public ParkingKartaController(ParkingKartaService service) {
		super(service, ParkingKartaDTO.class);
		
	}

}
