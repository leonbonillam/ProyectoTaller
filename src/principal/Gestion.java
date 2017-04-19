package principal;

public class Gestion {

	// Attributes
	private Clientes productos[] = null;
	private double caja;

	// Constructors
	public Gestion() {   
	}

	public Gestion(Clientes[] productos) {
		this.productos = productos;
	}

	// Methods
	public Clientes[] cargarProductos() {

		return productos;
	}

	public void mostrarProductos(Clientes[] productos) {
		for (int i = 0; i < productos.length; i++) {
			System.out.print(productos[i] + "\n\t\t  §-§-§-§-§-§-§-§\n");
		}
	}

	public void mostrarNombreProductos(Clientes[] productos) {
		for (int i = 0; i < productos.length; i++) {
			System.out.println(i + 1 + " " + productos[i].getNombre() + "\n");
		}
		System.out.println("\n-_-_-_-_-_-_-_-_-_-_-\n");
	}

	public double comprarProducto(Clientes[] productos, int num,
			int cantidadUnidades) {
		if (productos[num - 1].isDisponible()) {
			if (productos[num - 1].getCantStock() >= cantidadUnidades) {
				System.out.println("-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽\n"
                                        + "\n -▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽-▽\n"
                                        + "\n La compra se ha realizado con éxito y se ha añadido a su carrito. \n"
                                        + " \n Sera redireccionado al menú principal ...\n\n\n GRACIAS !! \n\n\n");
				productos[num - 1].setCantStock(productos[num - 1]
						.getCantStock() - cantidadUnidades);
				return caja += cantidadUnidades
						* productos[num - 1].getPrecioUnit();
			} else {
				System.out.println("Sin Disponibilidad");
			}
		} else {
			System.out.println("Sin Disponibilidad");
		}
		return caja;
	}

	public double mostrarCaja() {
		System.out.print("El total de su carrito es de :  ");
		caja = Math.round(caja * 100);
		return caja / 100;
	}
}
