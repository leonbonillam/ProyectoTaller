package principal;

public class Videojuego extends Clientes {

	// Attributes
	private String tematica;

	// Constructors
	public Videojuego() {
	}

	public Videojuego(String nombre, double precioUnit, int cantStock,
			boolean disponible, String tematica) {
		super(nombre, precioUnit, cantStock, disponible);
		this.tematica = tematica;
	}

	// Methods
	@Override
	public String toString() {
		return " \n" + super.toString() + "\t Aspectos que incluye:  "
				+ this.tematica;
	}

	// Gets and Sets
	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
}
