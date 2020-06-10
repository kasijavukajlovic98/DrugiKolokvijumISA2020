package drugiKolokvijumISA.app.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class ParkingKartaModel extends AbstractModel{
	Long parkingMestro;
	LocalDateTime pocetakVazenja;
	LocalDateTime krajVazenja;
	
	@ManyToMany(mappedBy = "listaKarata")
	List<VoziloModel>listaVozila;
	

	public ParkingKartaModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ParkingKartaModel(Long parkingMestro, LocalDateTime pocetakVazenja, LocalDateTime krajVazenja,
			List<VoziloModel> listaVozila) {
		super();
		this.parkingMestro = parkingMestro;
		this.pocetakVazenja = pocetakVazenja;
		this.krajVazenja = krajVazenja;
		this.listaVozila = listaVozila;
	}


	public Long getParkingMestro() {
		return parkingMestro;
	}


	public void setParkingMestro(Long parkingMestro) {
		this.parkingMestro = parkingMestro;
	}


	public LocalDateTime getPocetakVazenja() {
		return pocetakVazenja;
	}


	public void setPocetakVazenja(LocalDateTime pocetakVazenja) {
		this.pocetakVazenja = pocetakVazenja;
	}


	public LocalDateTime getKrajVazenja() {
		return krajVazenja;
	}


	public void setKrajVazenja(LocalDateTime krajVazenja) {
		this.krajVazenja = krajVazenja;
	}


	public List<VoziloModel> getListaVozila() {
		return listaVozila;
	}


	public void setListaVozila(List<VoziloModel> listaVozila) {
		this.listaVozila = listaVozila;
	}
	
	
	

}
