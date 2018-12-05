package br.ifpb.ads.bd2.modelos;

public class Telefone {

	public String numero;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Telefone() {
		super();
	}

	public Telefone(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefone: numero= " + numero;
	}

}
