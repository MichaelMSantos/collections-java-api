package main.java.set.Pesquisa.ListaTarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private final Set<Tarefa> tarefaList;

    public ListaTarefas(){
        this.tarefaList = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        for (Tarefa t: tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover = t;
                break;
            }
        }
        tarefaList.remove(tarefaParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefaList);
    }

    public int contarTarefas(){
        return tarefaList.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t: tarefaList){
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t: tarefaList){
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao){
        Tarefa tarefaParaConcluir = null;
        for (Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao) && !t.isConcluida()) {
                t.setConcluida(true);
                tarefaParaConcluir = t;
                break;
            }
        }
        return tarefaParaConcluir;
    }

    public Tarefa marcarTarefaPendente(String descricao){
        Tarefa tarefaParaMarcar = null;
        for (Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao) && t.isConcluida()) {
                t.setConcluida(false);
                tarefaParaMarcar = t;
                break;
            }
        }
        return tarefaParaMarcar;
    }

    public void limparListaTarefas(){
        tarefaList.clear();
    }

    public static void main(String[] args){
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 2");

        lista.exibirTarefas();

        lista.removerTarefa("Tarefa 2");

        System.out.println("Quantidade de tarefas: " + lista.contarTarefas());

        System.out.println("Tarefas concluidas: " + lista.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + lista.obterTarefasPendentes());

        lista.marcarTarefaConcluida("Tarefa 1");

      //  System.out.println("Tarefas concluidas: " + lista.obterTarefasConcluidas());
      //  System.out.println("Tarefas pendentes: " + lista.obterTarefasPendentes());

        lista.marcarTarefaPendente("Tarefa 2");
        lista.limparListaTarefas();

        System.out.println("Quantidade de tarefas: " + lista.contarTarefas());

    }
}
