package br.ufc.quixada.si.Model.Objetos;

import java.util.HashMap;

public class Pedido {

    private int                       id;
    private int                       codigo;
    private HashMap<Integer, Produto> produtoHashMap = new HashMap<>();

    public Pedido(Cliente cliente, int codigo) {
        this.id = cliente.listaPedidos.lastID() + 1;
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", codigo=" + codigo +
                '}';
    }

    public void adicionarProduto(Produto produto) {
        produtoHashMap.put(produto.getId(), produto);
    }

    public void removerProduto(Produto produto) {
        produtoHashMap.remove(produto.getId());
    }

    public Produto selecionarProduto(String nome) {
        for(Produto p : produtoHashMap.values()) {
            if(p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }

    public void listarProdutos() {
        for(Produto p : produtoHashMap.values()) {
            System.out.println(p.getId() + " " + p.getNome() + " " + p.getDescricao());
        }
    }
}
