package drugiKolokvijumISA.app.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import drugiKolokvijumISA.app.model.VlasnikModel;
import drugiKolokvijumISA.app.repository.VlasnikRepository;

@Service
public class VlasnikService extends AbstractService<VlasnikModel, VlasnikRepository>implements UserDetailsService{

	public VlasnikService(VlasnikRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		VlasnikModel vlasnik = repository.nadjiPoKorisnickomImenu(username);
		return new User(vlasnik.getKorisnickoIme(), vlasnik.getLozinka(), new ArrayList());
	}

}
