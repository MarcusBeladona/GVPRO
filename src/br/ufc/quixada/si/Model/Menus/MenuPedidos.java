package br.ufc.quixada.si.Model.Menus;

import br.ufc.quixada.si.Model.Objetos.Cliente;
import br.ufc.quixada.si.Model.Objetos.Pedido;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public class MenuPedidos {

    private static Scanner read = new Scanner(in);

    public static void mostrar(Cliente cliente) throws InputMismatchException {
        do {
            System.out.print("\nPedidos" +
                    "\n1: Adicionar    2: Selecionar    3: Listar    0: Voltar" +
                    "\nDigite uma opção: ");
            int entrada = read.nextInt();

            switch(entrada) {
                case 1:
                    adicionar(cliente);
                    break;
                case 2:
                    selecionar(cliente);
                    break;
                case 3:
                    cliente.listaPedidos.listar();
                    break;
                case 0:
                    return;
                default:
            }
        } while(true);
    }

    public static void adicionar(Cliente cliente) {

        System.out.print("Digite o código: ");
        int codigo = read.nextInt();

        Pedido pedido = new Pedido(cliente, codigo);
        cliente.listaPedidos.inserir(pedido);
        System.out.println("Pedido adicionado.");
    }

    public static void selecionar(Cliente cliente) throws InputMismatchException {
        System.out.print("Digite o código do pedido: ");
        int    codigo = read.nextInt();
        Pedido pedido = cliente.listaPedidos.selecionar(codigo);
        if(pedido != null) {
            System.out.print("1: Atualizar    2: Remover    3: Produtos    0: Voltar" +
                    "\nDigite uma opção: ");
            int entrada = read.nextInt();
            switch(entrada) {
                case 1: {
                    System.out.print("Digite o novo código: ");
                    int novoCodigo = read.nextInt();
                    cliente.listaPedidos.atualizar(pedido, novoCodigo);
                    System.out.println("Atualizado.");
                }
                break;
                case 2: {
                    cliente.listaPedidos.remover(pedido);
                    System.out.println("Pedido removido.");
                }
                return;
                case 3:
                    MenuProdutos.mostrar(pedido);
                    break;
                case 0:
                    return;
                    default:
                        System.out.println("Entrada inválida.");
            }
        } else System.out.println("Pedido não encontrado.");
    }
}
