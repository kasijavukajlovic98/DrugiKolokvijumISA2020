package drugiKolokvijumISA.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class VoziloModel extends AbstractModel{
	String registracioniBroj;
	
	@ManyToMany(mappedBy = "listaVozila")
	List<VlasnikModel>listaVlasnika;
	
	
	@ManyToMany
	@JoinTable(name = "vozilaIParkingKarte", joinColumns = @JoinColumn(name="vozilo_id"), inverseJoinColumns = @JoinColumn(name="parking_karta_id"))
	List<ParkingKartaModel>listaKarata;

	public VoziloModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VoziloModel(String registracioniBroj, List<VlasnikModel> listaVlasnika,
			List<ParkingKartaModel> listaKarata) {
		super();
		this.registracioniBroj = registracioniBroj;
		this.listaVlasnika = listaVlasnika;
		this.listaKarata = listaKarata;
	}

	public String getRegistracioniBroj() {
		return registracioniBroj;
	}

	public void setRegistracioniBroj(String registracioniBroj) {
		this.registracioniBroj = registracioniBroj;
	}

	public List<VlasnikModel> getListaVlasnika() {
		return listaVlasnika;
	}

	public void setListaVlasnika(List<VlasnikModel> listaVlasnika) {
		this.listaVlasnika = listaVlasnika;
	}

	public List<ParkingKartaModel> getListaKarata() {
		return listaKarata;
	}

	public void setListaKarata(List<ParkingKartaModel> listaKarata) {
		this.listaKarata = listaKarata;
	}

	

	
	
	

}
