package automotora;

public class LibroVenta {

	private String nombreVenta;
	private String fechaVenta;
	private Cliente cliente;
	private Vehiculo vehiculo;

	public LibroVenta(String nombreVenta, String fechaVenta, Cliente cliente, Vehiculo vehiculo) {
		this.nombreVenta = nombreVenta;
		this.fechaVenta = fechaVenta;
		this.cliente = cliente;
		this.vehiculo = vehiculo;

	}

	public String getNombreVenta() {
		return nombreVenta;
	}

	public String getFechaVenta() {
		String formato = "\\d{8}";
		if (fechaVenta.matches(formato)) {
			return this.fechaVenta;
		} else {
			System.out.println(
					"Formato fecha de venta: " + this.nombreVenta + " (No válido. formato: Ejemplo “01102020”)");
			return "FormatError";
		}

	}

	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;

	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;

	}

	public void guardarVenta() {

	}

	public Cliente getCliente() {
		return cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}
