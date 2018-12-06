package br.ufc.quixada.si.Model.Menus;

import br.ufc.quixada.si.Model.Listas.ListaPessoas;
import br.ufc.quixada.si.Model.Objetos.Pessoa;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public abstract class MenuPessoa {

    static Scanner read = new Scanner(in);

    public static void atualizar(Pessoa pessoa) throws InputMismatchException {

        do {
            System.out.print("O que deseja atualizar?" +
                    "\n1: Nome    2: Senha    0: Voltar" +
                    "\nDigite uma opção: ");
            int entrada = read.nextInt();

            switch(entrada) {
                case 1: {
                    read.nextLine();
                    System.out.print("Digite o novo nome: ");
                    String nome = read.nextLine();
                    if(ListaPessoas.selecionar(nome) == null) {
                        ListaPessoas.atualizarNome(pessoa, nome);
                        System.out.println("Nome atualizado.");
                    } else System.out.println("Nome já cadastrado.");
                    System.out.println();
                }
                break;
                case 2: {
                    read.nextLine();
                    System.out.print("Digite a nova senha: ");
                    String senha = read.nextLine();
                    ListaPessoas.atualizarSenha(pessoa, senha);
                    System.out.println("Senha atualizada.");
                }
                break;
                case 0:
                    return;
                default:
                    System.out.println("Entrada inválida.");
            }
        } while(true);
    }

    public static void deletar(Pessoa pessoa) {
        ListaPessoas.remover(pessoa);
        System.out.println("Conta removida.");
    }
}