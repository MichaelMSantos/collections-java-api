package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private final Map<String, Integer> palavrasMap;

    public ContagemPalavras(){
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!palavrasMap.isEmpty()){
            this.palavrasMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras(){
        for (Map.Entry<String, Integer> entry : this.palavrasMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getKey());
        }
    }

    public void encontrarPalavraMaisFrequente(){
        String palavraFrequente = null;
        int maiorContagem = 0;

        for (Map.Entry<String, Integer> entry : this.palavrasMap.entrySet()){
            if (entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                palavraFrequente = entry.getKey();
            }
        }

        System.out.println("Palavra mais frequente: " + palavraFrequente + "\nContagem: " + maiorContagem);
    }

    public static void main(String[] args){
        ContagemPalavras cp = new ContagemPalavras();

        cp.adicionarPalavra("java", 2);
        cp.adicionarPalavra("codigo", 5);
        cp.adicionarPalavra("teste", 3);

        cp.exibirContagemPalavras();
        cp.encontrarPalavraMaisFrequente();

        cp.removerPalavra("teste");
        cp.exibirContagemPalavras();
    }
}
