package automotora;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo vehiculoUno = new Vehiculo("rojo", "KSJD12");
		System.out.println(vehiculoUno.getPatente());
		vehiculoUno.setPatente("AAAA12");
		System.out.println(vehiculoUno.getPatente());
		
		Taxi taxiUno = new Taxi("Azul", "LAKS45",500);
		System.out.println(String.format("%s, %s, %d", taxiUno.getColor(), taxiUno.getPatente(), taxiUno.getValorPasaje()));
	
		String pagarPasajeTaxiUno = taxiUno.pagarPasaje(800);
		System.out.println(pagarPasajeTaxiUno);
		
		Bus busUno = new Bus("Negro", "ASDA52", 5);
		System.out.println(busUno.getCantidadDeAsientos());
		//System.out.println(busUno.asientosDisponibles());
		
		MiniBus miniBusUno = new MiniBus("Rojo","ZZZZ12", 20, "Turístico");
		//System.out.println(miniBusUno.getTipoViaje());
		miniBusUno.setTipoViaje("Educacional");
		//System.out.println(miniBusUno.getTipoViaje());
		//System.out.println(miniBusUno.getColor());
		//miniBusUno.setColor("Azul");
		//System.out.println(miniBusUno.getColor());
		miniBusUno.imprimeBus();
	
		Persona personaUno = new Persona("111111-1", "Juan");
		System.out.println(personaUno.getNombre());
		personaUno.setNombre("Carlos");
		System.out.println(personaUno.getNombre());
			
		Cliente clienteUno = new Cliente("222222-1", "Matías", 25);
		System.out.println(clienteUno.getRut());
		clienteUno.setRut("55555555-8");
		System.out.println(clienteUno.getRut());
		
		Vendedor vendedorUno = new Vendedor("88888888-9", "Gonzalo", "LosBoldos 152, Viña del mar");
		Vendedor vendedorDos = new Vendedor("11112223-9", "Pedro", "LosBoldos 160, Viña del mar");
		System.out.println(vendedorUno.getDireccion());
		vendedorUno.setDireccion("LosPaltos 156, Viña del mar");
		System.out.println(vendedorUno.getDireccion());
		
		
		Tienda tiendaUno = new Tienda(vendedorUno, clienteUno, 5);
		tiendaUno.setVendedor(vendedorDos);
		System.out.println(tiendaUno.getVendedor().getNombre());
		
		System.out.println(tiendaUno.existeStock());

		
		
		
	}

}
