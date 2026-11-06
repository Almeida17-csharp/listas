package br.edu.fatecpg.java.lista.model;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int ciclo;

    public Aluno(String curso, int matricula, String nome, int ciclo) {
        super();
        this.curso = curso;
        this.matricula = matricula;
        this.nome = nome;
        this.ciclo = ciclo;
    }

    public int getMatricula() {return matricula;}
    public void setMatricula(int matricula) {this.matricula = matricula;}
    public int getCiclo() {return ciclo;}
    public void setCiclo(int ciclo) {this.ciclo = ciclo;}
    public String getCurso() {return curso;}
    public void setCurso(String curso) {this.curso = curso;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    @Override
    public String toString() {
        return "Aluno[" + "matricula=" + matricula + ", nome='"
                + nome + '\'' + ", curso='" + curso + '\'' + ", ciclo=" + ciclo + ']';
    }
}
