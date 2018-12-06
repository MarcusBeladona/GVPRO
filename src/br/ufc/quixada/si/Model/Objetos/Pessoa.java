package br.ufc.quixada.si.Model.Objetos;

import br.ufc.quixada.si.Model.Listas.ListaPessoas;
import br.ufc.quixada.si.Model.Menus.InterfaceMenuPessoa;

public abstract class Pessoa implements InterfaceMenuPessoa {

    private int    id;
    private String nome;
    private String senha;

    public Pessoa() {
    }

    public Pessoa(String nome, String senha) {
        this.id = ListaPessoas.lastID() + 1;
        this.nome = nome;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public void menu() {
    }
}
