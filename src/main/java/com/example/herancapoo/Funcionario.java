package com.example.herancapoo;

public class Funcionario extends Pessoa{
    // Atributos
    private char setor;
    private boolean trabalhando;

    // Metodos Abstratos
    public void mudarTrabalho(){
        this.trabalhando = true;
    }

    // Metodos Especiais

    public char getSetor() {
        return setor;
    }

    public void setSetor(char setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
