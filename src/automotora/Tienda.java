package automotora;

public class Tienda {

	private Vendedor vendedor;
	private Cliente cliente;
	private int stock;
	
	
	public Tienda(Vendedor vendedor, Cliente cliente, int stock) {
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.stock = stock;
	}
	
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public int getStock() {
		return stock;
	}
	
	
	public void setVendedor(Vendedor vendedor) {
		this.vendedor=vendedor;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	public String existeStock() {
		Integer stockBBDD = 44;
		String msjStock= "Cantidad de stock es: " + stockBBDD;
		return  msjStock;
	}
	
}
