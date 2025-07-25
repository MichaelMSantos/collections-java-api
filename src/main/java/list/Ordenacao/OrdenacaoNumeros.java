package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private final List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordenacaoAsc = new ArrayList<>(numeros);
        Collections.sort(ordenacaoAsc);
        return ordenacaoAsc;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordenacaoDesc = new ArrayList<>(numeros);
        Collections.sort(ordenacaoDesc, Collections.reverseOrder());
        return ordenacaoDesc;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();

        ordenacao.adicionarNumero(2);
        ordenacao.adicionarNumero(9);
        ordenacao.adicionarNumero(5);
        ordenacao.adicionarNumero(3);

        System.out.println("Ordenação Ascendente: " + ordenacao.ordenarAscendente());
        System.out.println("Ordenação Descendente: " + ordenacao.ordenarDescendente());
    }
}
