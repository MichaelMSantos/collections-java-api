package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private final List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2024);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2025);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 1", 2024);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2020);



        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2024));
    }
}
