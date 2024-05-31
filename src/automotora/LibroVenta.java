package automotora;

public class LibroVenta {

	private String nombreVenta;
	private String fechaVenta;
	
	public void LibroVente(String nombreVenta, String fechaVenta) {
		this.nombreVenta = nombreVenta;
		this.fechaVenta = fechaVenta; //Ejemplo “01102020”
		
	}
	
	public String getNombreVenta() {
		return nombreVenta;
	}
	
	public String getFechaVenta() {
		return this.fechaVenta;
	}
	
	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
		
	}
	
	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
	public void guardarVenta() {
		
	}
	
}
