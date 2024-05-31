package automotora;

public class Taxi extends Vehiculo{
	private Integer valorPasaje;
	
	public Taxi(String color, String patente, int valorPasaje) {
	super(color, patente);
		this.valorPasaje = valorPasaje;
	}
	
	
	public int getValorPasaje () {
		return valorPasaje;
	}
	
	public void setValorpasaje(Integer valorPasaje) {
		this.valorPasaje = valorPasaje;
		
	}
	
	public String pagarPasaje(Integer monto) {
		String respuesta;
		if (monto > this.valorPasaje) {
			int vuelto = monto - this.valorPasaje;
			respuesta = "Vuelto:" + vuelto;
		}else {
			respuesta = "Devolver Pasaje Original";
		}
		return respuesta;
	}
}
