package drugiKolokvijumISA.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import drugiKolokvijumISA.app.model.AbstractModel;





@Repository
public interface InheritInterface <E extends AbstractModel> extends CrudRepository<E, Long>{

}
