package main.java.list.OperacoesBasicas;

public class Tarefa {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String toString(){
        return descricao;
    }
}
