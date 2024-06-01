package automotora;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creacion de objetos:
		Vehiculo vehiculoUno = new Vehiculo("rojo", "KSJD12");
		Vehiculo vehiculoDos = new Vehiculo("Verde", "AAAA12");
		Vehiculo vehiculoTres = new Vehiculo("Blanco", "RRRR14");
		
		Cliente clienteUno = new Cliente("222222-1", "Matías", 25);
		Cliente clienteDos = new Cliente("25636222-1", "Alejandro", 46);
		Cliente clienteTres = new Cliente("55533355-5", "Joaquin", 44);
		
		Vendedor vendedorUno = new Vendedor("88888888-9", "Gonzalo", "LosBoldos 152, Viña del mar");
		Vendedor vendedorDos = new Vendedor("11112223-9", "Pedro", "LosBoldos 160, Viña del mar");

		
		Tienda tiendaUno = new Tienda(vendedorUno, clienteUno, 5);
		tiendaUno.setVendedor(vendedorDos);

		//Creacion de carpeta y archivo:
				
		GuardarDirectorio nombreVenta = new GuardarDirectorio("src","ficheros","RegVenta.",".txt");
		nombreVenta.nuevoDirectorio();
		
		//Agregando ventas a arraylist:
		
		LibroVenta ventaUno = new LibroVenta ("VentaTres", "05012020", clienteTres, vehiculoTres);
		LibroVenta ventaDos = new LibroVenta("VentaDos", "04012020", clienteDos, vehiculoDos);
		LibroVenta ventaTres = new LibroVenta ("VentaUno", "01122020", clienteUno, vehiculoUno);
		
		ArrayList<LibroVenta> ventaTest = new ArrayList<>();
		ventaTest.add(ventaUno);
		ventaTest.add(ventaDos);
		ventaTest.add(ventaTres);
		
		List<String> libroVentasTest = new ArrayList<>();
		
		for(int i = 0; i < ventaTest.size();i++) {
			String formatoVenta= String.format("%s, %s, %s, %s", ventaTest.get(i).getVehiculo().getPatente(), ventaTest.get(i).getCliente().edadAString(), ventaTest.get(i).getFechaVenta(), ventaTest.get(i).getNombreVenta());
			libroVentasTest.add(formatoVenta);
			nombreVenta.nuevoArchivo(ventaTest.get(i).getNombreVenta(),ventaTest.get(i).getFechaVenta() ,i);
			nombreVenta.EscrituraArchivo(libroVentasTest, ventaTest.get(i).getNombreVenta(),ventaTest.get(i).getFechaVenta() ,i);
		}	
		
	}	

}
