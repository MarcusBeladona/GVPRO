package br.ufc.quixada.si.Model.Menus;

import br.ufc.quixada.si.Model.Listas.ListaProdutos;
import br.ufc.quixada.si.Model.Objetos.Pedido;
import br.ufc.quixada.si.Model.Objetos.Produto;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public class MenuProdutos {

    private static Scanner read = new Scanner(in);

    public static void mostrar(Pedido pedido) throws InputMismatchException {
        do {
            System.out.print("\nProdutos" +
                    "\n1: Listar    2: Adicionar     3: Remover    0: Voltar" +
                    "\nDigite uma opção: ");
            int entrada = read.nextInt();

            switch(entrada) {
                case 1:
                    pedido.listarProdutos();
                    break;
                case 2:
                    adicionar(pedido);
                    break;
                case 3:
                    remover(pedido);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Entrada inválida.");
            }
        } while(true);
    }

    public static void mostrar() throws InputMismatchException {
        do {
            System.out.print("1: Listar    2: Adicionar    3: Selecionar    0: Voltar" +
                    "\nDigite uma opção: ");
            int entrada = read.nextInt();
            switch(entrada) {
                case 1:
                    ListaProdutos.listar();
                    break;
                case 2:
                    read.nextLine();
                    adicionar();
                    break;
                case 3:
                    read.nextLine();
                    selecionar();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Inválido.");
            }
        } while(true);
    }

    public static void adicionar(Pedido pedido) {
        ListaProdutos.listar();
        read.nextLine();
        System.out.print("Digite o nome de um produto: ");
        String nome = read.nextLine();

        Produto produto = ListaProdutos.selecionar(nome);
        if(produto != null) {
            pedido.adicionarProduto(produto);
        } else System.out.println("Produto não encontrado.");
    }

    public static void remover(Pedido pedido) {

        System.out.print("Digite o nome do produto: ");
        String nome = read.nextLine();

        Produto produto = pedido.selecionarProduto(nome);
        if(produto != null) {
            pedido.removerProduto(produto);
        } else System.out.println("Produto não encontrado.");
    }

    public static void remover(Produto produto) {
        ListaProdutos.remover(produto);
        System.out.println("Produto removido.");
    }

    public static void adicionar() {
        System.out.print("Nome do produto: ");
        String nome = read.nextLine();
        System.out.print("Descrição: ");
        String  descricao = read.nextLine();
        Produto produto   = new Produto(nome, descricao);
        ListaProdutos.inserir(produto);
        System.out.println("Produto adicionado.");
    }

    public static void selecionar() throws InputMismatchException {
        System.out.print("Digite o nome do produto: ");
        String  nome    = read.nextLine();
        Produto produto = ListaProdutos.selecionar(nome);
        if(produto != null) {
            do {
                System.out.println(produto.toString());
                System.out.print("1: Atualizar    2: Remover   0: Voltar");
                int entrada = read.nextInt();
                switch(entrada) {
                    case 1:
                        System.out.println();
                        atualizar(produto);
                        break;
                    case 2:
                        System.out.println();
                        remover(produto);
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Entrada inválida.");
                }
            } while(true);
        }
    }

    public static void atualizar(Produto produto) throws InputMismatchException {
        do {
            System.out.print("1: Nome    2: Descrição    3: Voltar" +
                    "\nDigite uma opção: ");
            int entrada = read.nextInt();
            switch(entrada) {
                case 1:
                    System.out.print("Digite o novo nome: ");
                    String novoNome = read.nextLine();
                    ListaProdutos.atualizarNome(produto, novoNome);
                    System.out.println("Nome atualizado.");
                    break;
                case 2:
                    System.out.print("Digite a nova descrição: ");
                    String novaDescricao = read.nextLine();
                    ListaProdutos.atualizarDescricao(produto, novaDescricao);
                    System.out.println("Descrição atualizada.");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Entrada inválida.");
            }
        } while(true);
    }
}
