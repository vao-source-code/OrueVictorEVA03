package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements INadador{

	

	

	private String estiloPreferido;

	public Nadador(int i, String string, String string2) {
		this.setNumSocio(i);
		this.setNombre(string);
		this.setEstiloPreferido(string2);
	}

	@Override
	public Integer getNumeroDeSocio() {
		return this.numSocio;
	}

	@Override
	public void setNumSocio(Integer num) {
		this.numSocio = num;
		
	}

	@Override
	public String getNombre() {
		return this.nombre; 
	}

	@Override
	public void setNombre(String num) {
		this.nombre = num; 
	}

	@Override
	public String getEstiloPreferido() {
	return 	this.estiloPreferido ; 
	}

	@Override
	public void setEstiloPreferido(String estilo) {
		this.estiloPreferido = estilo ; 
		
	}



}
