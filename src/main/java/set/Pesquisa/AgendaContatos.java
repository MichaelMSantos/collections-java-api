package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private final Set<Contato> contatoList;

    public AgendaContatos(){
        this.contatoList = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoList.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println("Agenda de contatos: " + contatoList);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c: contatoList){
            if (c.getNome().equalsIgnoreCase(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        for (Contato c: contatoList) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args){
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Jula", 123456789);
        agenda.adicionarContato("Fulano 1", 22231232);
        agenda.adicionarContato("Fulano 2", 29388192);

        agenda.exibirContatos();

        System.out.println("Contatos encontrados com a pesquisa: " + agenda.pesquisarPorNome("Jula"));

        agenda.atualizarNumeroContato("Fulano 1", 10293102);
        // Exibir contato atualizado
        agenda.exibirContatos();
    }
}
