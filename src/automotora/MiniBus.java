package automotora;

public class MiniBus extends Bus{

	private String tipoViaje;
	
	public MiniBus(String color, String patente, Integer cantidadDeAsientos, String tipoViaje) {
		super(color, patente, cantidadDeAsientos);
		this.tipoViaje = tipoViaje;
	}
	
	
	public String getTipoViaje() {
		return tipoViaje;
	}
	
	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}
	
	public void imprimeBus() {
		System.out.println("Color del vehículo: " +this.getColor());
		System.out.println("Patente del vehículo: " +this.getPatente());
		System.out.println("Tipo de viaje: "+this.tipoViaje);
		System.out.println("Cantidad de Asientos: "+this.getCantidadDeAsientos());
	
		
	}

	
}

