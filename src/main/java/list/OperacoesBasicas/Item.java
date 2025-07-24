package main.java.list.OperacoesBasicas;

public class Item {
    private final String nome;
    private final double preco;
    private final int quantidade;

    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public String getNome() {
        return nome;
    }

    public String toString(){
        return "\nItem: {\n" +
                "Nome: " + nome +
                "\nPreco: " + preco +
                "\nQuantidade: " + quantidade + "}";
    }
}
