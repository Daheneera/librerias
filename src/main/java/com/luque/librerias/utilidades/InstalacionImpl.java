package com.luque.librerias.utilidades;

import java.util.List;




public class InstalacionImpl implements Instalacion{
	
		public enum Tipo {
			Habitacion, ZonaGeneral
		}
		
	
		
		private String nombre;
		private Boolean a_c;
		private Tipo tipoInstalacion;
		private List<String> mobiliario;
		List<IncidenciaImpl> incidencias;
		
		
		
		//Getters & setters
		@Override
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		@Override
		public Boolean getA_c() {
			return a_c;
		}
		public void setA_c(Boolean a_c) {
			this.a_c = a_c;
		}
		@Override
		public List<IncidenciaImpl> getIncidencias() {
			return incidencias;
		}
		public void setIncidencias(List<IncidenciaImpl> incidencias) {
			this.incidencias = incidencias;
		}
		@Override
		public Tipo getTipoInstalación() {
			return tipoInstalacion;
		}
		public void setTipoInstalación(Tipo tipoInstalación) {
			this.tipoInstalacion = tipoInstalación;
		}
		@Override
		public List<String> getMobiliario() {
			return mobiliario;
		}
		public void setMobiliario(List<String> mobiliario) {
			this.mobiliario = mobiliario;
		}
		@Override
		public String toString() {
			return "InstalacionImpl [nombre=" + nombre + ", a_c=" + a_c + ", tipoInstalacion=" + tipoInstalacion
					+ ", mobiliario=" + mobiliario + ", incidencias=" + incidencias + "]";
		}
		
		
		
		
		
}
