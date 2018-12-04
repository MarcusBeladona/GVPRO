package br.ufc.quixada.si;

import br.ufc.quixada.si.Entities.Pessoa;
import java.util.HashMap;
import java.util.Map;

public class Contas {

    private static Map<Integer, Pessoa> contasList = new HashMap<>();

    public void adicionar(Pessoa pessoa) {
        // modificar depois para try and catch
        System.out.println(contasList.keySet());
        if(pessoa != null) {
            contasList.put(pessoa.getId(), pessoa);
        }
    }

    public void remover(Pessoa pessoa) {
        contasList.remove(pessoa.getId(), pessoa);
    }

    public void atualizarPessoa(Pessoa pessoaAntiga, Pessoa pessoaNova) {
        if(pessoaNova != null) {
            pessoaNova.setId(pessoaAntiga.getId());
            contasList.put(pessoaNova.getId(), pessoaNova);
        }
    }

    public void atualizarNome(Pessoa pessoa, String nome) {
        if(!nome.equals("")) {
            pessoa.setNome(nome);
            contasList.put(pessoa.getId(), pessoa);
        }
    }

    public void atualizarSenha(Pessoa pessoa, String senha) {
        if(senha.equals("")) {
            pessoa.setSenha(senha);
            contasList.put(pessoa.getId(), pessoa);
        }
    }

    public Pessoa selecionarById(Integer key) {
        return contasList.get(key);
    }

    public Pessoa selecionarByNome(String nome) {
        for(Pessoa p : contasList.values()) {
            if(nome.equals(p.getNome())) {
                return p;
            }
        }
        return null;
    }

    public void listar() {
        for(Pessoa p : contasList.values()) {
            System.out.println(p.toString());
        }
    }

    // Pegar o último id, o keyset do hashmap está ordenado, só percorrer e pegar o último
    // Depois que conseguir, alterar no cadastrar e adicionar + 1 para ir para o próximo Id
    public int getLastId() {
return 0;
    }
}
