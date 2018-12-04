package br.ufc.quixada.si;

import br.ufc.quixada.si.Entities.Pessoa;
import java.util.Scanner;
import static java.lang.System.in;

public class MenuContas {

    private Scanner read = new Scanner(in);

    public int login(Contas contas) {
        System.out.print("Digite o nome: ");
        String nome = read.nextLine();
        Pessoa conta = contas.selecionarByNome(nome);

        if(conta != null) {
            System.out.print("Digite a senha: ");
            String senha = read.nextLine();
            if(conta.getSenha().equals(senha)) {
                System.out.println("ENTREI!!!");
                return conta.getId();
            } else System.out.println("Senha inválida.");
        } else System.out.println("Pessoa inválida.");
        return 0;
    }

    public void cadastrar(Contas contas) {
        System.out.print("Digite o nome: ");
        String nome = read.nextLine();

        System.out.print("Digite a senha: ");
        String senha = read.nextLine();

        Pessoa conta = new Pessoa(nome,senha);
        contas.adicionar(conta);
    }

    public void listar(Contas contas) {
        System.out.println("Mostrando nome de todos os usuários cadastrados: ");
        contas.listar();
    }
}
