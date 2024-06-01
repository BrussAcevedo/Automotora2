package automotora;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creacion de objetos:
		Vehiculo vehiculoUno = new Vehiculo("rojo", "KSJD12");
		Vehiculo vehiculoDos = new Vehiculo("Verde", "AAAA12");
			
		Cliente clienteUno = new Cliente("222222-1", "Matías", 25);
		Cliente clienteDos = new Cliente("25636222-1", "Alejandro", 46);
		
		Vendedor vendedorUno = new Vendedor("88888888-9", "Gonzalo", "LosBoldos 152, Viña del mar");
		Vendedor vendedorDos = new Vendedor("11112223-9", "Pedro", "LosBoldos 160, Viña del mar");
		vendedorUno.setDireccion("LosPaltos 156, Viña del mar");
		
		Tienda tiendaUno = new Tienda(vendedorUno, clienteUno, 5);
		tiendaUno.setVendedor(vendedorDos);

		//Creacion de carpeta y archivo:
				
		GuardarDirectorio nombreVenta = new GuardarDirectorio("src","ficheros","nombreVenta",".txt");
		nombreVenta.nuevoDirectorio();
		nombreVenta.nuevoArchivo();
		
		//Agregando ventas a arraylist:
		
		LibroVenta venta1 = new LibroVenta("VentaUno", "01122020", clienteUno, vehiculoUno);
		LibroVenta venta2 = new LibroVenta("VentaDos", "04132020", clienteDos, vehiculoDos);
		
		String formatoVenta1= String.format("%s, %s, %s, %s", venta1.getVehiculo().getPatente(), venta1.getCliente().edadAString(), venta1.getFechaVenta(), venta1.getNombreVenta());
		String formatoVenta2= String.format("%s, %s, %s, %s", venta2.getVehiculo().getPatente(), venta2.getCliente().edadAString(), venta2.getFechaVenta(), venta2.getNombreVenta());
		
		List<String> libroVentas = new ArrayList<>();

		libroVentas.add(formatoVenta1);
		libroVentas.add(formatoVenta2);

		nombreVenta.EscrituraArchivo(libroVentas);
		
	}
	

}
