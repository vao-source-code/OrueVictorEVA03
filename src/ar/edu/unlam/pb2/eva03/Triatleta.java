package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta  extends Deportista implements ICiclista , ICorredor , INadador{

	private String estiloPreferido;
	private Integer cantKilometros;
	private Integer distanciaPreferida;
	private TipoDeBicicleta tipoBicicleta;
	
	public Triatleta(int i, String nombre, String tipodeNatacion, TipoDeBicicleta tria) {
		this.setNumSocio(i);
		this.setNombre(nombre);
		this.setEstiloPreferido(tipodeNatacion);
		this.setTipoDeBicicleta(tria.name());
	}

	@Override
	public Integer getNumeroDeSocio() {
		// TODO Auto-generated method stub
		return this.numSocio;
	}

	@Override
	public void setNumSocio(Integer num) {
		// TODO Auto-generated method stub
		this.numSocio = num; 
		
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public void setNombre(String num) {
		// TODO Auto-generated method stub
		this.nombre = num;
	}

	@Override
	public String getEstiloPreferido() {
		// TODO Auto-generated method stub
		return this.estiloPreferido ; 
	}

	@Override
	public void setEstiloPreferido(String estilo) {
		// TODO Auto-generated method stub
		this.estiloPreferido = estilo; 
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		// TODO Auto-generated method stub
		this.cantKilometros = km; 
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return this.cantKilometros; 
	}

	@Override
	public Integer getDistanciaPreferida() {
		return this.distanciaPreferida ; 
	}

	@Override
	public void setDistanciaPreferida(Integer distancia) {
		// TODO Auto-generated method stub
		this.distanciaPreferida = distancia; 
		
	}

	@Override
	public String getTipoDeBicicleta() {
		// TODO Auto-generated method stub
		return this.tipoBicicleta.name(); 
	}

	@Override
	public void setTipoDeBicicleta(String tipoDeBicicleta) {
		// TODO Auto-generated method stub
		
tipoDeBicicleta = tipoDeBicicleta.toUpperCase();
		
		if ( tipoDeBicicleta.equals(TipoDeBicicleta.BMX.name())) {
			this.tipoBicicleta = TipoDeBicicleta.BMX;
		}
		if ( tipoDeBicicleta.equals(TipoDeBicicleta.MOUNTAIN.name())) {
			this.tipoBicicleta = TipoDeBicicleta.MOUNTAIN;
		}
		
		if ( tipoDeBicicleta.equals(TipoDeBicicleta.TRIA.name())) {
			this.tipoBicicleta = TipoDeBicicleta.TRIA;
		}
		if ( tipoDeBicicleta.equals(TipoDeBicicleta.RUTA.name())) {
			this.tipoBicicleta = TipoDeBicicleta.RUTA;
		}
		
	}

}
