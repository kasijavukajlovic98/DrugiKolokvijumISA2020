package drugiKolokvijumISA.app.service;

import org.springframework.stereotype.Service;

import drugiKolokvijumISA.app.model.VoziloModel;
import drugiKolokvijumISA.app.repository.VoziloRepository;

@Service
public class VoziloService extends AbstractService<VoziloModel, VoziloRepository>{

	public VoziloService(VoziloRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

}
