package automotora;

public class Bus extends Vehiculo {

	private Integer cantidadDeAsientos;
	
	public Bus(String color, String patente, Integer cantidadDeAsientos){
		super(color, patente);
		this.cantidadDeAsientos = cantidadDeAsientos;
	}
	
	public Integer getCantidadDeAsientos() {
		return cantidadDeAsientos;
	}
	
	public void setCantidadDeAsientos(Integer cantidadDeAsientos) {
		this.cantidadDeAsientos = cantidadDeAsientos;
	}
	
	
	public Integer asientosDisponibles() {
		Integer AsientosDisponiblesBBDD = 10;
		
		return AsientosDisponiblesBBDD;
	}
	
}
