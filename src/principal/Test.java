package principal;

import leer.Leer;


public class Test {

	public static void main(String[] args) {
		

		System.out
                        
                        
                        
				.println("\n\n\n\n\n\n\n\n\t  \\ Bienvenido al Salón de Fiestas VAKARELLI \\"
                                        + " \n\t∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞\n"
                                        + " \t          ∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞-∞\n"
                                        + " \t                ∞-∞-∞-∞-∞-∞-∞-∞-∞\n\n"
						+ "\tEstá ingresando a la base de datos para contratación de paquetes:\n"
						+ "\t\t....\n"		
						+ "\t   \n"
						+ "\t\t ");

		boolean continuar = true;
		int lecturaProducto, lecturaCantidad; // Variables para seleccionar el	paquete
		Clientes disco1 = new Musica("\t Paquete Básico", 650.53, 10, true, "Precio accesible");
		Clientes disco2 = new Musica("\t Paquete Medio", 923.2, 20, true, "Tiene servicio de manteleria, mesas, sillas y cristaleria, ");
		Clientes cine1 = new Cine("\t Paquete Alto", 1330.2, 5, true, "Paquete Medio + Comida y sonido");
		Clientes juego1 = new Videojuego("\t Paquete Plus", 2235.11, 4, false,
				"Paquete Alto + Inflables, Fotos y Adornos");

		
		Clientes catalogo[] = new Clientes[Clientes.dimesionArray];
	
		Gestion gestion = new Gestion();

		catalogo[0] = disco1;
		catalogo[1] = disco2;
		catalogo[2] = cine1;
		catalogo[3] = juego1;

		do {
			System.out.println("\n\nIntroduzca la opción que desea realizar:\n\n"
					+ "\t 1 -> Mostrar Paquetes\n" 
                                        + "\t 2 -> Vender Paquetes\n"
					+ "\t 3 -> Mostrar Carrito\n"
					+ "\t 0 -> SALIR\n"
                                        + "\n\t OPCIÓN # : \n");
			switch (Leer.datoInt()) {
			case 1:
				gestion.mostrarProductos(catalogo);
                             	break;
			case 2:
				System.out.println("¿Qué paquete desea comprar?\n");
				gestion.mostrarNombreProductos(catalogo);
				lecturaProducto = Leer.datoInt();
				System.out.println("Cantidad que desea comprar: \n");
				lecturaCantidad = Leer.datoInt();
				// Se carga el producto y la cantidad solicitada por el usuario
				gestion.comprarProducto(catalogo, lecturaProducto,
						lecturaCantidad);
				break;
			case 3:
				System.out.println(gestion.mostrarCaja() + " $");
				break;
                
                            
                            case 9999:
				System.out.println(" :* ");
				break;
                            
                        default:
				// Se sale del programa
				continuar = false;
			}

		} while (continuar);

		System.out.println("-ø-ø-ø-ø- Gracias por escoger el Salón de Fiestas VAKARELLI  -ø-ø-ø-ø-\n\n");

                
                
                
	}

}
