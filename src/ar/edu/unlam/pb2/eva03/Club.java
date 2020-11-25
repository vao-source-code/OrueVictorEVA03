package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
	
}
