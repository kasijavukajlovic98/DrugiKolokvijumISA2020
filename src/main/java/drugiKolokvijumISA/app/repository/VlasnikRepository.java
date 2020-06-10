package drugiKolokvijumISA.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import drugiKolokvijumISA.app.model.VlasnikModel;

@Repository
public interface VlasnikRepository extends InheritInterface<VlasnikModel>{

	@Query
	("SELECT k FROM VlasnikModel k WHERE k.korisnickoIme=:username")
	public VlasnikModel nadjiPoKorisnickomImenu(@PathVariable("username")String username);
}
