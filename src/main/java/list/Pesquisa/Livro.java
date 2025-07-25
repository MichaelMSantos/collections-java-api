package main.java.list.Pesquisa;

public class Livro {
    private final String autor;
    private final int anoPublicacao;
    private final String titulo;



    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
