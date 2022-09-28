package Ex_04_Orientacao_Objetos;

public class Ferramenta extends Item_Loja  {
	
	private String categoria; 
	private int serial;
	
	public int getIdentificador() {
		
		return serial;
	}
	
	public void setSerial(int serial) {
		this.serial = serial;
	}

	public String separar() {
		
		return categoria;
	}

	public void setCategoria(String categoria) {
		
		this.categoria = categoria;
	} 
	
	public double getValor_item() {
		
		return valor_item;
	}

	public void separa(double valor_item, int i) {
		
		this.valor_item = valor_item;
	}
	
}
