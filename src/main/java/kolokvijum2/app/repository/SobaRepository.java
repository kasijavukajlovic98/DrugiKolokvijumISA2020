package kolokvijum2.app.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import kolokvijum2.app.model.Soba;

@Repository
public interface SobaRepository extends CrudRepository<Soba, Long>{

}
