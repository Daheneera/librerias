package com.luque.librerias.utilidades;





public class ZonaGeneral extends InstalacionImpl implements sinHuesped{
	
	private Integer aforo;
	
	@Override
	public Integer getAforo() {
		return aforo;
	}

	public void setAforo(Integer aforo) {
		this.aforo = aforo;
	}

	@Override
	public String toString() {
		return "ZonaGeneral [aforo=" + aforo + "]";
	}
	
	
}
