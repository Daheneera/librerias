package com.luque.librerias.utilidades;

import java.time.LocalDate;

import com.luque.librerias.utilidades.IncidenciaImpl.Estado;
import com.luque.librerias.utilidades.IncidenciaImpl.Prelacion;
import com.luque.librerias.utilidades.IncidenciaImpl.Tipo;

public interface Incidencia {
	
	
	public String getDescripcion();
	

	public Estado getEstadoIncidencia();


	public LocalDate getFechaAlta();
	
	
	public LocalDate getFechaInicio();
		
	
	public InstalacionImpl getInstalacion();
	
	
	public Tipo getTipoIncidencia() ;
	
	
	public Prelacion getUrgencia();
}
