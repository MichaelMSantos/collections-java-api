package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private final List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args){
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.60);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 23, 1.90);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 22, 1.80);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 21, 1.70);

        System.out.println("Ordenação por idade: " + ordenacaoPessoas.ordenarPorIdade());
        System.out.println("Ordenação por altura: " + ordenacaoPessoas.ordenarPorAltura());

    }
}
