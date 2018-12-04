package br.ufc.quixada.si;

import java.util.Scanner;

import static java.lang.System.in;

public class MenuCliente {

    Scanner read = new Scanner(in);

    public void atualizarConta(Contas contas, int id) {
        System.out.println("1: Alterar nome    2: Alterar senha");
        int entrada = read.nextInt();

        switch(entrada) {
            case 1: {
                read.nextLine();
                System.out.print("Digite o novo nome: ");
                String nome = read.nextLine();
                contas.atualizarNome(contas.selecionarById(id), nome);
                break;
            }
            case 2: {
                System.out.print("Digite a nova senha: ");
                String senha = read.nextLine();
                contas.atualizarSenha(contas.selecionarById(id), senha);
                break;
            }
            default:
                System.out.print("Entrada inválida.");
        }
    }
}
