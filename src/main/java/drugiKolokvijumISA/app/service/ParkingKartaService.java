package drugiKolokvijumISA.app.service;

import org.springframework.stereotype.Service;

import drugiKolokvijumISA.app.model.ParkingKartaModel;
import drugiKolokvijumISA.app.repository.ParkingKartaRepository;

@Service
public class ParkingKartaService extends AbstractService<ParkingKartaModel, ParkingKartaRepository>{

	public ParkingKartaService(ParkingKartaRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

}
