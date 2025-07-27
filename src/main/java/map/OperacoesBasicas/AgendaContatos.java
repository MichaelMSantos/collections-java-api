package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private final Map<String, Integer> agendaMap;

    public AgendaContatos(){
        this.agendaMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
    agendaMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(!agendaMap.isEmpty()){
            agendaMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaMap.isEmpty()){
            numeroPorNome = agendaMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args){
        AgendaContatos a = new AgendaContatos();
        a.adicionarContato("Fulano 1", 1234567);
        a.adicionarContato("Fulano 2", 2391312);

        System.out.println("Pesquisa numero por nome: " + a.pesquisarPorNome("Fulano 2"));

        a.removerContato("Fulano 1");

        a.exibirContatos();
    }
}
