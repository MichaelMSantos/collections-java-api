package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private final List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : numeros){
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        if(!numeros.isEmpty()){
            for (Integer numero: numeros){
                if (numero >= maior){
                    maior = numero;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for (Integer numero: numeros){
                if(numero <= menor) {
                    menor = numero;
                }
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(this.numeros);
        }
    }

    public static void main(String[] args){
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(2);
        soma.adicionarNumero(6);
        soma.adicionarNumero(1);
        soma.adicionarNumero(10);

        soma.exibirNumeros();
        System.out.println("Soma dos números: " + soma.calcularSoma());
        System.out.println("Maior número: " +soma.encontrarMaiorNumero());
        System.out.println("Menor número: " + soma.encontrarMenorNumero());
    }
}
