package br.ufc.quixada.si.Model.Menus;

import br.ufc.quixada.si.Model.Listas.ListaPessoas;
import br.ufc.quixada.si.Model.Objetos.Gerente;
import br.ufc.quixada.si.Model.Objetos.Pessoa;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public class MenuGerente extends MenuPessoa {

    static Scanner read = new Scanner(in);

    public static void mostrar(Gerente gerente) throws InputMismatchException {

        System.out.println("Olá " + gerente.getNome() + ", veja suas opções da conta:");

        do {
            System.out.print("1: Atualizar    2: Deletar    3: Gerente    4: Produtos    0: Voltar" +
                    "\nDigite uma opção: ");
            int entrada = read.nextInt();

            switch(entrada) {
                case 1:
                    atualizar(gerente);
                    break;
                case 2:
                    deletar(gerente);
                    return;
                case 3:
                    read.nextLine();
                    criarGerente();
                    System.out.println();
                    break;
                case 4:
                    MenuProdutos.mostrar();
                    break;
                case 0:
                    return;
                default:
            }

        } while(true);
    }

    public static void criarGerente() {

        System.out.print("Digite o mome: ");
        String nome = read.nextLine();

        if((ListaPessoas.selecionar(nome)) == null) {

            System.out.print("Digite a senha: ");
            String senha  = read.nextLine();
            Pessoa pessoa = new Gerente(nome, senha);
            ListaPessoas.inserir(pessoa);
            System.out.println("Gerente cadastrado.");

        } else System.out.println("Nome já cadastrado.");
    }
}