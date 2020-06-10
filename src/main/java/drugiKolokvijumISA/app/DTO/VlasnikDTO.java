package drugiKolokvijumISA.app.DTO;

import java.util.List;

public class VlasnikDTO extends AbstractDTO{
	String ime, prezime, korisnickoIme, lozinka;
	
	List<VoziloDTO>listaVozila;

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

	public List<VoziloDTO> getListaVozila() {
		return listaVozila;
	}

	public void setListaVozila(List<VoziloDTO> listaVozila) {
		this.listaVozila = listaVozila;
	}
	
	
	
}
