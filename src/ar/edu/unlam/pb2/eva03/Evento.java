package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	public Evento(TipoDeEvento carreraNatacionEnAguasAbiertas) {
		
		this.tipo = carreraNatacionEnAguasAbiertas;
		this.participantes = new HashMap();
		
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDeInscripcion == null) ? 0 : numeroDeInscripcion.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (numeroDeInscripcion == null) {
			if (other.numeroDeInscripcion != null)
				return false;
		} else if (!numeroDeInscripcion.equals(other.numeroDeInscripcion))
			return false;
		return true;
	}


	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	
	
}
