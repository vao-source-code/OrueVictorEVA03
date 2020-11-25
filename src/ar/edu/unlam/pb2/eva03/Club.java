package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	public Club(String string) {
		
		this.nombre = nombre ; 
		this.socios = new HashSet();
		this.competencias = new HashMap (); 
	}
	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	
	public void agregarDeportista(Deportista deportista) {
	
		this.socios.add(deportista);
		
		
	}

	public Integer getCantidadSocios() {
	
		return this.socios.size();
	}


	public void crearEvento(TipoDeEvento carreraNatacionEnAguasAbiertas, String string) {
		
		
		Evento evento = new Evento (carreraNatacionEnAguasAbiertas) ;
		
		this.competencias.put(string , evento);
		
	}


	public Object inscribirEnEvento(String string, Deportista celeste)  {
		
	 
		String evento =  devolvemeEltipoDeEvento(string); 
		if ( evento != null) {
			
		
			
			
		}
		
		
	}

	private String devolvemeEltipoDeEvento(String string) {
		for (Entry<String, Evento> e : this.competencias.entrySet()) {
		       String key = e.getKey();
		       if ((key).equalsIgnoreCase(string))
               {
                   return key;
               }
		}
		
		return null ; 
	}
	
}
