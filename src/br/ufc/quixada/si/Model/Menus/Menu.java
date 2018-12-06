package br.ufc.quixada.si.Model.Menus;

import br.ufc.quixada.si.Model.Listas.ListaPessoas;
import br.ufc.quixada.si.Model.Objetos.Cliente;
import br.ufc.quixada.si.Model.Objetos.Pessoa;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public class Menu {

    static Scanner read = new Scanner(in);

    public static void mostrar() throws InputMismatchException {
        do {
            System.out.print("+ Gerenciador de vendas e produtos +" +
                    "\n1: Listar    2: Login    3: Cadastrar   0: Sair" +
                    "\nDigite uma opção: ");

            int entrada = read.nextInt();

            switch(entrada) {
                case 1:
                    System.out.println();
                    ListaPessoas.listar();
                    System.out.println();
                    break;
                case 2:
                    read.nextLine();
                    login();
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    read.nextLine();
                    cadastrar();
                    System.out.println();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Entrada inválida.");
            }
        }
        while(true);
    }

    public static void login() {

        System.out.print("Digite o mome: ");
        String nome   = read.nextLine();
        Pessoa pessoa = ListaPessoas.selecionar(nome);

        if(pessoa != null) {

            System.out.print("Digite a senha: ");
            String senha = read.nextLine();

            if(senha.equals(pessoa.getSenha())) {

                pessoa.menu();

            } else System.out.println("Senha inválida.");

        } else System.out.println("Usuário não encontrado.");
    }

    public static void cadastrar() {

        System.out.print("Digite o mome: ");
        String nome = read.nextLine();

        if((ListaPessoas.selecionar(nome)) == null) {

            System.out.print("Digite a senha: ");
            String senha  = read.nextLine();
            Pessoa pessoa = new Cliente(nome, senha);
            ListaPessoas.inserir(pessoa);
            System.out.println("Cadastrado.");

        } else System.out.println("Nome já cadastrado.");
    }
}
