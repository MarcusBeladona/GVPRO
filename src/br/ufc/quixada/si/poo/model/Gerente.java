package br.ufc.quixada.si.poo.model;

public class Gerente extends Usuario {
	private String numDeInscricao;

	public Gerente() {

	}

	public Gerente(String nome, String email, String senha, String numDeInscricao) {
		super(nome, email, senha);
		this.numDeInscricao = numDeInscricao;
	}

	public String getNumDeInscricao() {
		return numDeInscricao;
	}

	public void setNumDeInscricao(String numDeInscricao) {
		this.numDeInscricao = numDeInscricao;
	}

	@Override
	public String toString() {
		return "\nCategoria: Gerente\nNúmero de Inscricao: " + this.numDeInscricao;
	}

}
