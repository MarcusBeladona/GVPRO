package br.ufc.quixada.si.Model.Listas;

import br.ufc.quixada.si.Model.Objetos.Pedido;

import java.util.HashMap;

public class ListaPedidos {

    private HashMap<Integer, Pedido> pedidoHashMap = new HashMap<>();

    public int lastID() {
        int aux = 0;
        for(Pedido p : pedidoHashMap.values()) {
            aux = p.getCodigo();
        }
        return aux;
    }


    public Pedido selecionar(int codigo) {
        for(Pedido p : pedidoHashMap.values()) {
            if(p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    public void atualizar(Pedido pedido, int novoCodigo) {
        pedidoHashMap.get(pedido.getCodigo()).setCodigo(novoCodigo);
    }

    public void inserir(Pedido pedido) {
        pedidoHashMap.put(pedido.getId(), pedido);
    }

    public void remover(Pedido pedido) {
        pedidoHashMap.remove(pedido.getId());
    }

    public void listar() {
        for(Pedido p : pedidoHashMap.values()) {
            System.out.println(p.getId() + " " + p.getCodigo());
        }
    }
}