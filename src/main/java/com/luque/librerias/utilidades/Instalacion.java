package com.luque.librerias.utilidades;

import java.util.List;

import com.luque.librerias.utilidades.InstalacionImpl.Tipo;

public interface Instalacion {
	public String getNombre();
	
	public Boolean getA_c() ;
	
	public List<IncidenciaImpl> getIncidencias();
	
		
	public Tipo getTipoInstalación() ;
	
	
	public List<String> getMobiliario() ;
	
}
