package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEvento {
    private final Map<LocalDate, Evento> eventoMap;

    public AgendaEvento(){ this.eventoMap = new HashMap<>(); }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate proximaData;
        LocalDate dataAtual = LocalDate.now();
        Evento proximoEvento;

        for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Proximo evento: " + proximoEvento+ " - Aconceterá em: " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args){
        AgendaEvento a = new AgendaEvento();
        a.adicionarEvento(LocalDate.now(), "Teste", "Roblox");
        a.adicionarEvento(LocalDate.parse("2025-10-21"), "Teste2", "Free");

        a.exibirAgenda();

        a.obterProximoEvento();
    }
}
