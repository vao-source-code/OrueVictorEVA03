package ar.edu.unlam.pb2.eva03;

public abstract class Deportista {

	protected Integer numSocio;
	protected String nombre; 

	public abstract Integer getNumeroDeSocio () ;
	
	/**
	 * @param num
	 */
	public abstract void setNumSocio( Integer num);  
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((numSocio == null) ? 0 : numSocio.hashCode());
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
		Deportista other = (Deportista) obj;
		
		if (numSocio == null) {
			if (other.numSocio != null)
				return false;
		} else if (!numSocio.equals(other.numSocio))
			return false;
		return true;
	}

	public abstract String getNombre () ;
	
	public abstract void setNombre (String num);  
	
	
}
