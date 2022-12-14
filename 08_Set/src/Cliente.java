
public class Cliente {
	private String nombre;
	private String nif;
	private String telefono;
	
	public Cliente(String nombre, String nif, String telefono) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		
		if(obj!=null && obj instanceof Cliente) {
			sonIguales = this.nif.equals(((Cliente) obj).getNif());
		}
		
		return sonIguales;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}

	

}
