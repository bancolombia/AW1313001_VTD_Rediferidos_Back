package app.demo.domain.holder;

import app.demo.domain.InformacionCreditoActual;
import app.demo.domain.InformacionCreditoRediferido;
import app.demo.domain.InformacionDispositivo;

public class HolderInfoCreditos {

	private InformacionCreditoActual informacionCreditoActual;
	private InformacionCreditoRediferido informacionCreditoRediferido;
	private InformacionDispositivo informacionDispositivo;
	private Long plazoSeleccionado;
	private boolean isChecked;
	
	public HolderInfoCreditos() {
		super();
	}
	
	public InformacionDispositivo getInformacionDispositivo() {
		return informacionDispositivo;
	}
	public void setInformacionDispositivo(InformacionDispositivo informacionDispositivo) {
		this.informacionDispositivo = informacionDispositivo;
	}

	public InformacionCreditoActual getInformacionCreditoActual() {
		return informacionCreditoActual;
	}

	public void setInformacionCreditoActual(InformacionCreditoActual informacionCreditoActual) {
		this.informacionCreditoActual = informacionCreditoActual;
	}

	public boolean isChecked() {
		return isChecked;
	}

	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}

	public Long getPlazoSeleccionado() {
		return plazoSeleccionado;
	}

	public void setPlazoSeleccionado(Long plazoSeleccionado) {
		this.plazoSeleccionado = plazoSeleccionado;
	}

	public InformacionCreditoRediferido getInformacionCreditoRediferido() {
		return informacionCreditoRediferido;
	}

	public void setInformacionCreditoRediferido(InformacionCreditoRediferido informacionCreditoRediferido) {
		this.informacionCreditoRediferido = informacionCreditoRediferido;
	}
}