package com.luque.librerias.utilidades;

import java.util.List;



public class Habitacion extends InstalacionImpl implements conHuesped{
	
	private Boolean telefono;
	private Boolean tv;
	private Integer numCamas;
	
	
	//Getters & setters
	@Override
	public Boolean getTelefono() {
		return telefono;
	}
	public void setTelefono(Boolean telefono) {
		this.telefono = telefono;
	}
	@Override
	public Boolean getTv() {
		return tv;
	}
	public void setTv(Boolean tv) {
		this.tv = tv;
	}
	@Override
	public Integer getNumCamas() {
		return numCamas;
	}
	public void setNumCamas(Integer numCamas) {
		this.numCamas = numCamas;
	}
	@Override
	public String toString() {
		return "Habitacion [telefono=" + telefono + ", tv=" + tv + ", numCamas=" + numCamas + "]";
	}

	

	
}
