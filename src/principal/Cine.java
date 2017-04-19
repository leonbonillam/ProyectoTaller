package principal;

public class Cine extends Clientes {

	// Attribute
	private String director;

	// Constructor
	public Cine() {
	}

	public Cine(String nombre, double precioUnit, int cantStock,
			boolean disponible, String director) {
		super(nombre, precioUnit, cantStock, disponible);
		this.director = director;
	}

	// Methods
	@Override
	public String toString() {
		return " \n" + super.toString() + "\t Aspectos Que Incluye: "
				+ this.director;
	}

	// Gets and Sets
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
}
