package kolokvijum2.app.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kolokvijum2.app.model.Gost;
import kolokvijum2.app.repository.GostRepository;


@Service
public class GostService {
	
	@Autowired
	GostRepository repo;
	
	public Iterable<Gost> dobaviSve(){
		return repo.findAll();
	}
	
	public Gost dobaviPoId(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public void save(Gost obj) {
		repo.save(obj);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}

}
