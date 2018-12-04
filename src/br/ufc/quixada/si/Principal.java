package br.ufc.quixada.si;

public class Principal {

    public static void main(String[] args) {

        ListaPessoas listaPessoas = new ListaPessoas();

        Pessoa pessoa1 = new Cliente("João","233");
        listaPessoas.adicionar(pessoa1);
        Pessoa pessoa2 = new Gerente("Emson", "434");
        listaPessoas.adicionar(pessoa2);
        Pessoa pessoa3 = new Cliente("Jack", "3214");
        listaPessoas.adicionar(pessoa3);

        MenuInicial menuInicial = new MenuInicial();
        menuInicial.mostrar();
    }
}