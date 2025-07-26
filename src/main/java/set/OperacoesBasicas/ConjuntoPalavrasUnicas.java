package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private final Set<String> conjuntoList;

    public ConjuntoPalavrasUnicas(){
        this.conjuntoList = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        if (conjuntoList.contains(palavra)) {
            System.out.println("Erro: Essa palavra já existe no conjunto");
        } else {
            conjuntoList.add(palavra);
        }
    }

    public void removerPalavra(String palavra){
        if (conjuntoList.contains(palavra)) {
            conjuntoList.remove(palavra);
        } else {
            System.out.println("Essa palavra não existe no conjunto");
        }
    }

    public void verificarPalavra(String palavra) {
        if (conjuntoList.contains(palavra)) {
            System.out.println("A palavra: " + palavra + " está presente no conjunto" );
        } else {
            System.out.println("A palavra: " + palavra + " não está presente no conjunto" );
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println("Palaras Unicas: " + conjuntoList);
    }

    public static void main(String[] args){
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("J");
        conjunto.adicionarPalavra("L");
        conjunto.adicionarPalavra("B");

        conjunto.removerPalavra("B");

        conjunto.verificarPalavra("B");

        conjunto.exibirPalavrasUnicas();
    }
}
