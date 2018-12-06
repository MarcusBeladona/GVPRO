package br.ufc.quixada.si.Model.Listas;

import br.ufc.quixada.si.Model.Objetos.Pessoa;

import java.util.HashMap;

public class ListaPessoas {

    private static HashMap<Integer, Pessoa> pessoaHashMap = new HashMap<>();

    public static int lastID() {
        int aux = 0;
        for(Pessoa p : pessoaHashMap.values()) {
            aux = p.getId();
        }
        return aux;
    }

    public static void atualizarNome(Pessoa pessoa, String nome) {
        pessoaHashMap.get(pessoa.getId()).setNome(nome);
    }

    public static void atualizarSenha(Pessoa pessoa, String senha) {
        pessoaHashMap.get(pessoa.getId()).setSenha(senha);
    }

    public static void remover(Pessoa pessoa) {
        pessoaHashMap.remove(pessoa.getId());
    }

    public static void inserir(Pessoa pessoa) {
        pessoaHashMap.put(pessoa.getId(), pessoa);
    }

    public static Pessoa selecionar(String nome) {
        for(Pessoa p : pessoaHashMap.values()) {
            if(nome.equals(p.getNome())) {
                return p;
            }
        }
        return null;
    }

    public static void listar() {
        for(Pessoa p : pessoaHashMap.values()) {
            System.out.println(p.getId() + " " + p.getNome());
        }
    }
}
