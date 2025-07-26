package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private final Set<Produto> produtoList;

    public CadastroProdutos(){
        this.produtoList = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoList.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        return new TreeSet<>(produtoList);
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoList);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto(12321321, "Coca", 3.99, 2);
        cadastro.adicionarProduto(83123103, "Cheetos", 2.99, 6);
        cadastro.adicionarProduto(549231321, "Doritos", 6.99, 4);

        System.out.println(cadastro.exibirProdutosPorNome());
        System.out.println("///");
        System.out.println(cadastro.exibirProdutosPorPreco());
    }
}
