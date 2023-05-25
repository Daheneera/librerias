package com.luque.librerias.entidades;

import java.util.List;




public class Instalacion {
	
		public enum Tipo {
			Habitacion, ZonaGeneral
		}
		
	
		private Long id;
		private String nombre;
		private Boolean a_c;
		private Tipo tipoInstalacion;
		private List<String> mobiliario;
		List<Incidencia> incidencias;
		
		
		
		//Getters & setters
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Boolean getA_c() {
			return a_c;
		}
		public void setA_c(Boolean a_c) {
			this.a_c = a_c;
		}
		public List<Incidencia> getIncidencias() {
			return incidencias;
		}
		public void setIncidencias(List<Incidencia> incidencias) {
			this.incidencias = incidencias;
		}
		
		public Tipo getTipoInstalación() {
			return tipoInstalacion;
		}
		public void setTipoInstalación(Tipo tipoInstalación) {
			this.tipoInstalacion = tipoInstalación;
		}
		
		public List<String> getMobiliario() {
			return mobiliario;
		}
		public void setMobiliario(List<String> mobiliario) {
			this.mobiliario = mobiliario;
		}
		
		@Override
		public String toString() {
			return "Instalacion [id=" + id + ", nombre=" + nombre + ", a_c=" + a_c + ", incidencias=" + incidencias
					+ "]";
		}
		
		
		
		
}
