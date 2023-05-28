package com.luque.librerias.utilidades;

import java.time.LocalDate;


public class IncidenciaImpl implements Incidencia{

		public static enum Estado{
			En_Estudio, Iniciada, Finalizada
		}
		
		public static enum Tipo{
			Fontaneria, Carpinteria, Albañileria, Electricidad, Otros
		}
		
		public static enum Prelacion{
			Urgente, Leve, Rutinaria
		}
	
		
		private String descripcion;
		private Estado estadoIncidencia;
		private LocalDate fechaAlta;
		private LocalDate fechaInicio;
		private InstalacionImpl instalacion;
		private Tipo tipoIncidencia;
		private Prelacion urgencia;
		
		
		
		//Getters & setters
		@Override
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		@Override
		public Estado getEstadoIncidencia() {
			return estadoIncidencia;
		}
		public void setEstadoIncidencia(Estado estadoIncidencia) {
			this.estadoIncidencia = estadoIncidencia;
		}
		@Override
		public LocalDate getFechaAlta() {
			return fechaAlta;
		}
		public void setFechaAlta(LocalDate fechaAlta) {
			this.fechaAlta = fechaAlta;
		}
		@Override
		public LocalDate getFechaInicio() {
			return fechaInicio;
		}
		public void setFechaInicio(LocalDate fechaInicio) {
			this.fechaInicio = fechaInicio;
		}
		@Override
		public InstalacionImpl getInstalacion() {
			return instalacion;
		}
		public void setInstalacion(InstalacionImpl instalacion) {
			this.instalacion = instalacion;
		}
		@Override
		public Tipo getTipoIncidencia() {
			return tipoIncidencia;
		}
		public void setTipoIncidencia(Tipo tipoIncidencia) {
			this.tipoIncidencia = tipoIncidencia;
		}
		@Override
		public Prelacion getUrgencia() {
			return urgencia;
		}
		public void setUrgencia(Prelacion urgencia) {
			this.urgencia = urgencia;
		}
		@Override
		public String toString() {
			return "IncidenciaImpl [descripcion=" + descripcion + ", estadoIncidencia=" + estadoIncidencia
					+ ", fechaAlta=" + fechaAlta + ", fechaInicio=" + fechaInicio + ", instalacion=" + instalacion
					+ ", tipoIncidencia=" + tipoIncidencia + ", urgencia=" + urgencia + "]";
		}
		
		
		
		
		
		
}
