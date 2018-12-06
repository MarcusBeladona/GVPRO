package br.ufc.quixada.si.Model.Menus;

import br.ufc.quixada.si.Model.Objetos.Cliente;

import java.util.Scanner;

import static java.lang.System.in;

public class MenuCliente extends MenuPessoa {

    static Scanner read = new Scanner(in);

    public static void mostrar(Cliente cliente) {
        do {

            System.out.print("Olá " + cliente.getNome() + ", veja suas opções da conta:" +
                    "\n1: Atualizar    2: Deletar    3: Pedidos    0: Voltar" +
                    "\nDigite uma opção: ");
            int entrada = read.nextInt();

            switch(entrada) {
                case 1:
                    atualizar(cliente);
                    break;
                case 2:
                    deletar(cliente);
                    return;
                case 3:
                    MenuPedidos.mostrar(cliente);
                    break;
                case 0:
                    return;
                default:
            }

        } while(true);
    }
}
