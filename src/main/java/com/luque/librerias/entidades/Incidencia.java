package com.luque.librerias.entidades;

import java.time.LocalDate;


public class Incidencia {

		public static enum Estado{
			En_Estudio, Iniciada, Finalizada
		}
		
		public static enum Tipo{
			Fontaneria, Carpinteria, Albañileria, Electricidad, Otros
		}
		
		public static enum Prelacion{
			Urgente, Leve, Rutinaria
		}
	
		
		private Long id;
		private String descripcion;
		private Estado estadoIncidencia;
		private LocalDate fechaAlta;
		private LocalDate fechaInicio;
		private Instalacion instalacion;
		private Tipo tipoIncidencia;
		private Prelacion urgencia;
		
		
		
		//Getters & setters
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public Estado getEstadoIncidencia() {
			return estadoIncidencia;
		}
		public void setEstadoIncidencia(Estado estadoIncidencia) {
			this.estadoIncidencia = estadoIncidencia;
		}
		public LocalDate getFechaAlta() {
			return fechaAlta;
		}
		public void setFechaAlta(LocalDate fechaAlta) {
			this.fechaAlta = fechaAlta;
		}
		public LocalDate getFechaInicio() {
			return fechaInicio;
		}
		public void setFechaInicio(LocalDate fechaInicio) {
			this.fechaInicio = fechaInicio;
		}
		
		public Instalacion getInstalacion() {
			return instalacion;
		}
		public void setInstalacion(Instalacion instalacion) {
			this.instalacion = instalacion;
		}
		public Tipo getTipoIncidencia() {
			return tipoIncidencia;
		}
		public void setTipoIncidencia(Tipo tipoIncidencia) {
			this.tipoIncidencia = tipoIncidencia;
		}
		public Prelacion getUrgencia() {
			return urgencia;
		}
		public void setUrgencia(Prelacion urgencia) {
			this.urgencia = urgencia;
		}
		@Override
		public String toString() {
			return "Incidencia [id=" + id + ", descripcion=" + descripcion + ", estadoIncidencia=" + estadoIncidencia
					+ ", fechaAlta=" + fechaAlta + ", fechaInicio=" + fechaInicio + ", instalacion=" + instalacion
					+ ", tipoIncidencia=" + tipoIncidencia + ", urgencia=" + urgencia + "]";
		}
		
		
		
		
}
