package drugiKolokvijumISA.app.DTO;

import java.util.List;

public class VoziloDTO extends AbstractDTO{
	String registracioniBroj;
	
	List<ParkingKartaDTO>listaKarata;

	public String getRegistracioniBroj() {
		return registracioniBroj;
	}

	public void setRegistracioniBroj(String registracioniBroj) {
		this.registracioniBroj = registracioniBroj;
	}

	public List<ParkingKartaDTO> getListaKarata() {
		return listaKarata;
	}

	public void setListaKarata(List<ParkingKartaDTO> listaKarata) {
		this.listaKarata = listaKarata;
	}
	
	

}
