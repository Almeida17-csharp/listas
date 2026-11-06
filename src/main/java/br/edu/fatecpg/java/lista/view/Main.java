package br.edu.fatecpg.java.lista.view;

import br.edu.fatecpg.java.lista.controller.AlunoController;
import br.edu.fatecpg.java.lista.model.Aluno;

public class Main {
    public static void main(String[] args) {
        AlunoController ac = new AlunoController();

        ac.setAluno(new Aluno("DSM", 10, "Ale", 5));
        ac.setAluno(new Aluno("ADS", 20, "Aline", 6));
        ac.setAluno(new Aluno("DSM", 30, "Ana", 1));
        ac.setAluno(new Aluno("COMEX", 40, "Maria", 2));

        System.out.println("Mostrando aluno: ");
        System.out.println(ac.getAluno(2));
        System.out.println("\n");

        System.out.println("Listando alunos: ");
        System.out.println(ac.listarAlunos());

        System.out.println("Buscando aluno: ");
        System.out.println(ac.buscarAluno(20));
        System.out.println("\n");

        System.out.println("Deletando aluno: ");
        ac.deletarAluno(1);
        System.out.println("\n");

        System.out.println("Listando alunos: ");
        System.out.println(ac.listarAlunos());

        System.out.println("Passando o semestre: ");
        ac.passarSemestre();
        System.out.println("\n");

        System.out.println("Limpando a lista: ");
        ac.limparLista();
        System.out.println("\n");
    }
}