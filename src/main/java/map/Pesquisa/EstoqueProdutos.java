package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private final Map<Long, Produto> estoqueMap;

    public EstoqueProdutos(){
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println("Lista de produtos em estoque: " + estoqueMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        if (!estoqueMap.isEmpty()){
            for (Produto p : estoqueMap.values()){
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueMap.isEmpty()){
            for (Produto p : estoqueMap.values()){
                if (p.getPreco() >= maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueMap.isEmpty()){
            for (Produto p : estoqueMap.values()){
                if (p.getPreco() <= menorPreco){
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorValorTotal = null;
        double maiorValorTotal = Double.MIN_VALUE;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                double valorTotal = p.getQuantidade() * p.getPreco();
                if (valorTotal > maiorValorTotal) {
                    maiorValorTotal = valorTotal;
                    produtoMaiorValorTotal = p;
                }
            }
        }
        return produtoMaiorValorTotal;
    }

    public static void main(String[] args) {
        EstoqueProdutos e = new EstoqueProdutos();

        e.adicionarProduto(2L, "Produto A", 12, 2);
        e.adicionarProduto(23213L, "Produto B", 2, 6.2);
        e.adicionarProduto(542122L, "Produto C", 6, 5.0);
        e.adicionarProduto(73152L, "Produto D", 5, 4);

        e.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + e.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + e.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + e.obterProdutoMaisBarato());
        System.out.println("Maior valor total: " + e.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
