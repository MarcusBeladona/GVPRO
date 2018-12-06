package br.ufc.quixada.si.Model.Objetos;

import br.ufc.quixada.si.Model.Listas.ListaPedidos;
import br.ufc.quixada.si.Model.Menus.MenuCliente;

public class Cliente extends Pessoa {

    public ListaPedidos listaPedidos = new ListaPedidos();

    public Cliente(String nome, String senha) {
        super(nome, senha);
    }

    public void menu() {
        System.out.println();
        MenuCliente.mostrar(this);
    }
}
