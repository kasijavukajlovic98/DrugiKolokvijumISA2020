package drugiKolokvijumISA.app.DTO;

import java.time.LocalDateTime;

public class ParkingKartaDTO extends AbstractDTO{
	Long parkingMestro;
	LocalDateTime pocetakVazenja;
	LocalDateTime krajVazenja;
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
	
	

}
