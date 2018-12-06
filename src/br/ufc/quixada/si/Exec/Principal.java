package br.ufc.quixada.si.Exec;

import br.ufc.quixada.si.Model.Listas.ListaPessoas;
import br.ufc.quixada.si.Model.Listas.ListaProdutos;
import br.ufc.quixada.si.Model.Menus.Menu;
import br.ufc.quixada.si.Model.Objetos.Cliente;
import br.ufc.quixada.si.Model.Objetos.Gerente;
import br.ufc.quixada.si.Model.Objetos.Pedido;
import br.ufc.quixada.si.Model.Objetos.Produto;

import java.util.InputMismatchException;

public class Principal {

    public static void main(String[] args) {

        try {
            montador();
            Menu.mostrar();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida, tente novamente.");
        } catch (NullPointerException e) {
            System.out.println("Objeto retornou nulo.");
        }
    }

    public static void montador() throws NullPointerException {

        ListaPessoas.inserir(new Cliente("João", "KY"));
        ListaPessoas.inserir(new Cliente("Anna", "HJ"));
        ListaPessoas.inserir(new Gerente("adm", "adm"));
        ListaPessoas.inserir(new Gerente("Solo", "122"));

        ListaProdutos.inserir(new Produto("Água", "H²O."));
        ListaProdutos.inserir(new Produto("Sal", "Faz-se saguadim."));
        ListaProdutos.inserir(new Produto("Pizza", "Do tipo portuguesa."));

        Cliente pessoa = new Cliente("Erika", "samba");
        ListaPessoas.inserir(pessoa);

        Pedido pedido = new Pedido(pessoa, 23);
        pedido.adicionarProduto(ListaProdutos.selecionar("Sal"));
        pessoa.listaPedidos.inserir(pedido);

    }
}
