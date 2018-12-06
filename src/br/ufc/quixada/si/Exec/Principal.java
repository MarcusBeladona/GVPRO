package br.ufc.quixada.si.Exec;

import br.ufc.quixada.si.Model.Objetos.Cliente;
import br.ufc.quixada.si.Model.Objetos.Gerente;
import br.ufc.quixada.si.Model.Objetos.Pessoa;
import br.ufc.quixada.si.Model.Listas.ListaPessoas;
import br.ufc.quixada.si.Model.Menus.Menu;

public class Principal {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Cliente("Jão", "KY");
        ListaPessoas.inserir(pessoa1);

        Pessoa pessoa2 = new Gerente("Anna", "HJ");
        ListaPessoas.inserir(pessoa2);

        Pessoa pessoa3 = new Cliente("Han", "23");
        ListaPessoas.inserir(pessoa3);

        ListaPessoas.remover(pessoa2);

        ListaPessoas.atualizarNome(pessoa1, "Kelly");

        ListaPessoas.inserir(new Gerente("Solo", "122"));

        ListaPessoas.listar();

        Menu.mostrar();
    }
}
