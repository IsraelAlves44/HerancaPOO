package com.example.herancapoo;

public class Aluno extends  Pessoa {
    // Atributos

    private int matr;
    private String curso;



    // Metodos Abstratos
    public void cancelarMatricula(){
        this.matr = 0;
    }

    // Metodos Especiais
    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
