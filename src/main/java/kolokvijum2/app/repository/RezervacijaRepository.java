package kolokvijum2.app.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import kolokvijum2.app.model.Rezervacija;

@Repository
public interface RezervacijaRepository extends CrudRepository<Rezervacija, Long>{

}
