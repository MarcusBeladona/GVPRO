package br.ufc.quixada.si.Model.Objetos;

import br.ufc.quixada.si.Model.Menus.InterfaceMenuPessoa;
import br.ufc.quixada.si.Model.Menus.MenuGerente;

public class Gerente extends Pessoa implements InterfaceMenuPessoa {

    public Gerente(String nome, String senha) {
        super(nome, senha);
    }

    public void menu() {
        System.out.println();
       MenuGerente.mostrar(this);
    }
}
