package br.ufc.quixada.si.poo.model;

public class Produtos {
	private String nome;
	private int codigo;

	public Produtos() {

	}

	public Produtos(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "\nProdutos\nNome: " + this.nome + "\nCódigo: " + this.codigo;
	}

}
