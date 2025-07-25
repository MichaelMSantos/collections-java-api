package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private final Set<Convidado> convidadoList;

    public ConjuntoConvidados(){
        this.convidadoList = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoList.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoList){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoList.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoList.size();
    }

    public void exibirConvidados(){
        System.out.println("Lista de convidados: " + convidadoList);
    }

    public static void main(String[] args){
        ConjuntoConvidados conjunto = new ConjuntoConvidados();

        conjunto.adicionarConvidado("Nome 1", 1);
        conjunto.adicionarConvidado("Nome 2", 4);
        conjunto.adicionarConvidado("Nome 3", 20);
        conjunto.adicionarConvidado("Nome 1", 9);

        System.out.println("Quantidade de convidados: " + conjunto.contarConvidados());
        conjunto.removerConvidadoPorCodigoConvite(9);
        System.out.println("Quantidade de convidados: " + conjunto.contarConvidados());

        conjunto.exibirConvidados();
    }
}
