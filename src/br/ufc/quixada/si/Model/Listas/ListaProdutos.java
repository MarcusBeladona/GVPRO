package br.ufc.quixada.si.Model.Listas;

import br.ufc.quixada.si.Model.Objetos.Produto;

import java.util.HashMap;

public class ListaProdutos {

    private static HashMap<Integer, Produto> produtoHashMap = new HashMap<>();

    public static int lastID() {
        int aux = 0;
        for(Produto p : produtoHashMap.values()) {
            aux = p.getId();
        }
        return aux;
    }

    public static Produto selecionar(String nome) {
        for(Produto p : produtoHashMap.values()) {
            if(nome.equals(p.getNome())) {
                return p;
            }
        }
        return null;
    }

    public static void atualizarNome(Produto produto, String novoNome) {
        produtoHashMap.get(produto.getId()).setNome(novoNome);
    }

    public static void atualizarDescricao(Produto produto, String novDescricao) {
        produtoHashMap.get(produto.getId()).setDescricao(novDescricao);
    }

    public static void inserir(Produto produto) {
        produtoHashMap.put(produto.getId(), produto);
    }

    public static void remover(Produto produto) {
        produtoHashMap.remove(produto.getId());
    }

    public static void listar() {
        for(Produto p : produtoHashMap.values()) {
            System.out.printf("%-5d %-10s %-20s\n",p.getId(),p.getNome(),p.getDescricao());
        }
    }
}