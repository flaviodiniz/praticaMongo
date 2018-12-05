package br.ifpb.ads.bd2.modelos;

public class Pessoa {

	public String id;
	public String nome;
	public String segundoNome;
	public Telefone telefone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Pessoa(String nome, String segundoNome, String id, Telefone telefone) {
		this.id = id;
		this.nome = nome;
		this.segundoNome = segundoNome;
		this.telefone = telefone;
	}

	public Pessoa() {
		super();
	}

	@Override
	public String toString() {
		return "Pessoa: id= " + id + ", nome= " + nome + ", segundoNome= " + segundoNome + ", telefone= " + telefone;
	}

}
