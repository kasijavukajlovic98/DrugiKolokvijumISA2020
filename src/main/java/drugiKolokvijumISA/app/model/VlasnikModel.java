package drugiKolokvijumISA.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class VlasnikModel extends AbstractModel{
	String ime, prezime, korisnickoIme, lozinka;
	
	
	@ManyToMany
	@JoinTable(name = "vlasnikIVozilo", joinColumns = @JoinColumn(name="vlasnik_id"), inverseJoinColumns = @JoinColumn(name="vozilo_id"))
	List<VoziloModel>listaVozila;

	public VlasnikModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VlasnikModel(String ime, String prezime, String korisnickoIme, String lozinka,
			List<VoziloModel> listaVozila) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
		this.listaVozila = listaVozila;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public List<VoziloModel> getListaVozila() {
		return listaVozila;
	}

	public void setListaVozila(List<VoziloModel> listaVozila) {
		this.listaVozila = listaVozila;
	}

	
	
	

}
