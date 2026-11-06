package br.edu.fatecpg.java.lista.controller;

import br.edu.fatecpg.java.lista.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoController {
    private List<Aluno> listaAlunos;

    public AlunoController() {
        listaAlunos = new ArrayList<>();
    }

    public void setAluno(Aluno a) {
        listaAlunos.add(a);
    }

    public Aluno getAluno(int index) {
        return listaAlunos.get(index);
    }

    public String listarAlunos() {
        StringBuilder sb = new StringBuilder();
        for (Aluno a : listaAlunos) {
            sb.append(a.toString()+"\n");
        }
        return sb.toString();
    }

    public void deletarAluno(int index) {
        try {
            listaAlunos.remove(index);
            System.out.println("Aluno deletado!");
        } catch (Exception e){
            System.out.println("Aluno não encontrado!");
        }
    }

    public void passarSemestre() {
        for (Aluno a : listaAlunos) {
            a.setCiclo(a.getCiclo() + 1);
        }
        System.out.println("O semestre se passou!");
    }

    public Object buscarAluno(int mat) {
        for (Aluno a : listaAlunos) {
            if (a.getMatricula() == mat) {
                return a;
            }
        }
        return "Aluno não encontrado!";
    }

    public void limparLista() {
        listaAlunos.clear();
        System.out.println("Lista limpa!");
    }
}
