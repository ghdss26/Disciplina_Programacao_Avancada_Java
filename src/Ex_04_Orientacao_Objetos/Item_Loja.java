package Ex_04_Orientacao_Objetos;

public class Item_Loja {
	
	private int codigo_item; 
	private String nome_item;
	private String descricao_item;
	protected double valor_item; 

	public void setCodigo_item(int codigo_item) {
		
		this.codigo_item = codigo_item;
	}
	
	public int getidentificador() {
		
		return codigo_item;
	}

	public String getNome_item() {
		
		return nome_item;
	}

	public void setNome_item(String nome_item) {
		
		this.nome_item = nome_item;
	}

	public String getDescricao_item() {
		
		return descricao_item;
	}

	public void setDescricao_item(String descricao_item) {
		
		this.descricao_item = descricao_item;
	}

	
	
}
