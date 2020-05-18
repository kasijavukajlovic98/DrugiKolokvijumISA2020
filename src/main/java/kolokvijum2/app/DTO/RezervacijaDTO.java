package kolokvijum2.app.DTO;

import java.time.LocalDateTime;

public class RezervacijaDTO {
	
	Long id;
	LocalDateTime odKad;
	LocalDateTime doKad;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getOdKad() {
		return odKad;
	}
	public void setOdKad(LocalDateTime odKad) {
		this.odKad = odKad;
	}
	public LocalDateTime getDoKad() {
		return doKad;
	}
	public void setDoKad(LocalDateTime doKad) {
		this.doKad = doKad;
	}
	
	
	
	
	
	

}
