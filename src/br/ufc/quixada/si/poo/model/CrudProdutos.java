package br.ufc.quixada.si.poo.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CrudProdutos {

	static int opcao = 0;
	static int pesquisaCodigo = 0;
	public Scanner reader = new Scanner(System.in);
	static Map<Integer, Produtos> mapListaProdutos = new HashMap<Integer, Produtos>();

	public void menuProdutos() {
		do {
			System.out.printf("------- MENU PRODUTO -------\n" + "[ 1 ] Adicionar Produtos\n"
					+ "[ 2 ] Atualizar Informações\n" + "[ 3 ] Listar Produtos\n" + "[ 4 ] Excluir Produtos\n"
					+ "[ 5 ] Menu Inicial\n" + "\nOpção Desejada: ");

			opcao = reader.nextInt();
			reader.nextLine();

			switch (opcao) {
			case 1:
				adicionarProdutos();
				break;
			case 2:
				atualizarProdutos();
				break;
			case 3:
				listarProdutos();
				break;
			case 4:
				excluirProdutos();
				break;
			case 5:
				// Voltar ao Menu Principal;
				break;
			default:
				System.out.println("Opção Inválida!Tente novamente.");
			}

			System.out.printf("\n\n");

		} while (opcao != 5);

	}

	public void adicionarProdutos() {

		do {
			Produtos novoProduto = new Produtos();

			System.out.print("\n\n------- CADASTRO DE PRODUTOS -------" + "\nNome do Produto: ");
			novoProduto.setNome(reader.nextLine());
			System.out.print("Código: ");
			novoProduto.setCodigo(reader.nextInt());

			Integer key = novoProduto.getCodigo();
			mapListaProdutos.put(key, novoProduto);

			System.out.print("\nCadastro realizado com sucesso!" + "\n\nDeseja cadastrar outro produtro?\n"
					+ "[ 1 ] Sim\n" + "[ 2 ] Não\n" + "- ");
			opcao = reader.nextInt();
			reader.nextLine();

		} while (opcao != 2);

	}

	public void atualizarProdutos() {
		System.out.print("\n\n------- Pesquisar Produto -------" + "\n[ 1 ] Atualizar por Código"
				+ "\n[ 2 ] Atualizar por Nome" + "\n- ");
		opcao = reader.nextInt();
		reader.nextLine();

		switch (opcao) {
		case 1:

		}
	}

	public void alterarNome() {
		System.out.print("\nInforme o Código do produto que deseja alterar: ");
		String pesquisaCodigo = reader.nextLine();

		if (mapListaProdutos.containsKey(pesquisaCodigo)) {
			System.out.println("Deseja Atualizar o Código de " + mapListaProdutos.get(pesquisaCodigo) + "\n[ 1 ] Sim"
					+ "\n[ 2 ] Não");

			opcao = reader.nextInt();
			reader.nextLine();
			if (opcao == 1) {
				System.out.print("Informe o novo nome: ");
				String novoNome = reader.nextLine();
			}
		}
	}

	public void listarProdutos() {
		System.out.print("\n\n------- PESQUISAR PRODUTO -------" + "\n[ 1 ] Pesquisar por Código"
				+ "\n[ 2 ] Listar todos" + "\n- ");
		opcao = reader.nextInt();
		reader.nextLine();

		if (opcao == 1) {
			System.out.print("\n\nPESQUISA POR CÓDIGO" + "\nCódigo: ");
			pesquisaCodigo = reader.nextInt();

			if (mapListaProdutos.containsKey(pesquisaCodigo)) {
				System.out.println(mapListaProdutos.get(pesquisaCodigo));
			}
		} else if (opcao == 2) {
			System.out.println(mapListaProdutos);
		}

	}

	public void excluirProdutos() {
		System.out.print("------- REMOVER PRODUTO -------" + "\nInforme o Código do produto que deseja remover: ");
		pesquisaCodigo = reader.nextInt();

		if (mapListaProdutos.containsKey(pesquisaCodigo)) {
			System.out.print("\nDeseja excluir o aluno(a): " + mapListaProdutos.get(pesquisaCodigo)
					+ "\n[ 1 ] Sim\n[ 2 ] Não\n- ");

			opcao = reader.nextInt();
			reader.nextLine();

			if (opcao == 1) {
				mapListaProdutos.remove(pesquisaCodigo);
			} else {
				System.out.println("Operação cancelada com sucesso!");
			}
		} else {
			System.err.println("\nAluno não existe");
		}

	}

}
