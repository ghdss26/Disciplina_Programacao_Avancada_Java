package Ex_07_Orientacao_Objetos;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Item {
	
	private Integer codigo;
	private String nome;
	private String descricao;
	
	
	private Set<Modelo> modelos = new HashSet<>();
	
	public Item() {
		
		
	}

	public Item(Integer codigo, String nome, String descricao, Set<Modelo> modelos) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.modelos = modelos;
	}

	public Integer getCodigo() {
		
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		
		this.codigo = codigo;
	}

	public String getNome() {
		
		return nome;
	}

	public void setNome(String nome) {
		
		this.nome = nome;
	}

	public String getDescricao() {
		
		return descricao;
	}

	public void setDescricao(String descricao) {
		
		this.descricao = descricao;
	}

	public Set<Modelo> getModelos() {
		
		return modelos;
	}

	public void setModelos(Set<Modelo> modelos) {
		
		this.modelos = modelos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, descricao, modelos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(modelos, other.modelos) && Objects.equals(nome, other.nome);
	}
	
	
}
