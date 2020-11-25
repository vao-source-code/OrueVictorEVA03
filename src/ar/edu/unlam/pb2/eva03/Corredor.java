package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor {

	private Integer cantKilometros;
	private Integer distanciaPreferida;

	public Corredor(int i, String string, int j) {

		this.setNumSocio(i);
		this.setNombre(string);
		this.setDistanciaPreferida(j);

	}

	@Override
	public Integer getNumeroDeSocio(){
		return this.numSocio;
	}

	@Override
	public void setNumSocio(Integer num) {
		this.numSocio = num;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantKilometros = km ; 

	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.cantKilometros; 
	}

	@Override
	public Integer getDistanciaPreferida() {
		return this.distanciaPreferida; 
	}

	@Override
	public void setDistanciaPreferida(Integer distancia) {
	this.distanciaPreferida = distancia; 
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public void setNombre(String num) {
		this.nombre = nombre ; 
		
	}

}
