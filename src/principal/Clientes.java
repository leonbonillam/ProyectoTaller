package principal;

public abstract class Clientes {

	// Attributes
	private String nombre;
	private double precioUnit;
	private int cantStock;
	private boolean disponible = false;
	public static int dimesionArray;

	// Constructors
	public Clientes() {
	}

	public Clientes(String nombre, double precioUnit, int cantStock,
			boolean disponible) {
		this.nombre = nombre;
		this.precioUnit = precioUnit;
		this.cantStock = cantStock;
		this.disponible = disponible;

		dimesionArray++;
						
	}

	// Methods
	@Override
	public String toString() {
		return "\t Nombre: " + this.getNombre() + "\n" + "\t Precio de paquete: "
				+ this.getPrecioUnit() + " $\n" + "\t Disponibilad: "
				+ this.getCantStock() + "\n";
	}

	// Get and Set
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioUnit() {
		return this.precioUnit;
	}

	public void setPrecioUnit(double precioUnit) {
		this.precioUnit = precioUnit;
	}

	public int getCantStock() {
		return this.cantStock;
	}

	public void setCantStock(int cantStock) {
		this.cantStock = cantStock;
	}

	public boolean isDisponible() {
		if (getCantStock() > 0)
			this.disponible = true;
		return this.disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
