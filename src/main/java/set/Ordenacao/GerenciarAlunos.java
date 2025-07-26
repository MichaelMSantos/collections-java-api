package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciarAlunos {
    private final Set<Aluno> alunosList;

    public GerenciarAlunos(){
        this.alunosList = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        this.alunosList.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        for (Aluno a: alunosList) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                break;
            } else {
                System.out.println("O aluno com matricula " + matricula + " não está no sistema.");
            }
        }
        alunosList.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        return new TreeSet<>(alunosList);
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosList);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println("Lista de alunos: " + alunosList);
    }

    public static void main(String[] args){
        GerenciarAlunos g = new GerenciarAlunos();

        g.adicionarAluno("Aluno 2", 39123891L, 2);
        g.adicionarAluno("Aluno 1", 201313901L, 10.);
        g.adicionarAluno("Aluno 3", 130123101L, 7.);

        g.removerAluno(39123891L);

        System.out.println(g.exibirAlunosPorNome());

        System.out.println("Alunos por nota: " + g.exibirAlunosPorNota());

        g.exibirAlunos();

    }

}
