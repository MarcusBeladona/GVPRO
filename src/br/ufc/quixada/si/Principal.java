package br.ufc.quixada.si;

import br.ufc.quixada.si.Entities.Cliente;
import br.ufc.quixada.si.Entities.Pessoa;

public class Principal {

    public static void main(String[] args) {

        MenuContas menuContas = new MenuContas();
        MenuCliente menuCliente = new MenuCliente();

        Contas contas = new Contas();
        Pessoa conta1 = new Pessoa(3, "João", "32221");
        Pessoa conta2 = new Pessoa(2, "Débora", "32221");

        Pessoa conta3 = new Cliente("Erica", "3424");

        contas.adicionar(conta1);
        contas.adicionar(conta2);

        //contas.atualizarPessoa(conta2, conta3);

        //contas.remover(conta1);

        //contas.atualizarNome(contas.selecionarByNome("Erica"), "XYZ");

        menuContas.listar(contas);

        /*int id_logado = menuContas.login(contas);
        menuContas.cadastrar(contas);
        menuContas.listar(contas);

        menuCliente.atualizarConta(contas, id_logado);
        menuContas.listar(contas);*/

        contas.getLastId();
    }
}
