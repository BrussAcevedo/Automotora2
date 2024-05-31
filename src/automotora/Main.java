package automotora;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creacion de objetos:
		Vehiculo vehiculoUno = new Vehiculo("rojo", "KSJD12");
		Vehiculo vehiculoDos = new Vehiculo("Verde", "AAAA12");
		
		Taxi taxiUno = new Taxi("Azul", "LAKS45",500);
	
		String pagarPasajeTaxiUno = taxiUno.pagarPasaje(800);
		Bus busUno = new Bus("Negro", "ASDA52", 5);
		
		MiniBus miniBusUno = new MiniBus("Rojo","ZZZZ12", 20, "Turístico");
		miniBusUno.imprimeBus();
	
		Persona personaUno = new Persona("111111-1", "Juan");
			
		Cliente clienteUno = new Cliente("222222-1", "Matías", 25);
		
		Vendedor vendedorUno = new Vendedor("88888888-9", "Gonzalo", "LosBoldos 152, Viña del mar");
		Vendedor vendedorDos = new Vendedor("11112223-9", "Pedro", "LosBoldos 160, Viña del mar");
		vendedorUno.setDireccion("LosPaltos 156, Viña del mar");
		
		Tienda tiendaUno = new Tienda(vendedorUno, clienteUno, 5);
		tiendaUno.setVendedor(vendedorDos);

		//Creacion de carpeta y archivo:
		
		Directorio directorioUno = new Directorio("src", "ficheros");
		directorioUno.nuevoDirectorio();
		
		Archivo nombreVenta = new Archivo(directorioUno, "nombre venta", ".txt");
		nombreVenta.nuevoArchivo();
		
		
		
		
	}
	

}
