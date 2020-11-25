package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;

public class Ciclista  extends Deportista implements ICiclista  {

	private TipoDeBicicleta tipoDeBicicleta;
	

	public Ciclista(int i, String string, String string2) {
		this.setNumSocio(i);
		this.setNombre(string);
		this.setTipoDeBicicleta(string2);
		
	}

	@Override
	public String getTipoDeBicicleta() {
	return tipoDeBicicleta.name();
	}

	@Override
	public void setTipoDeBicicleta(String tipoDeBicicleta) {
		
		tipoDeBicicleta = tipoDeBicicleta.toUpperCase();
		
		if ( tipoDeBicicleta.equals(TipoDeBicicleta.BMX.name())) {
			this.tipoDeBicicleta = TipoDeBicicleta.BMX;
		}
		if ( tipoDeBicicleta.equals(TipoDeBicicleta.MOUNTAIN.name())) {
			this.tipoDeBicicleta = TipoDeBicicleta.MOUNTAIN;
		}
		
		if ( tipoDeBicicleta.equals(TipoDeBicicleta.TRIA.name())) {
			this.tipoDeBicicleta = TipoDeBicicleta.TRIA;
		}
		if ( tipoDeBicicleta.equals(TipoDeBicicleta.RUTA.name())) {
			this.tipoDeBicicleta = TipoDeBicicleta.RUTA;
		}
		
		
		
	}

	@Override
	public Integer getNumeroDeSocio()  {
	return this.numSocio ; 
	}

	@Override
	public void setNumSocio( Integer num)  {
		this.numSocio = num ; 
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public void setNombre(String num) {
		this.nombre = num;
		
	}

}
