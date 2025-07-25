package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }
    public void removeritem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for (Item i : itemList){
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Coca-Cola", 4., 2);
        carrinho.adicionarItem("Pepsi", 4.50, 2);
        carrinho.removeritem("Pepsi");
        carrinho.exibirItens();
        System.out.println("Valor total: R$ " + carrinho.calcularValorTotal());
    }
}


