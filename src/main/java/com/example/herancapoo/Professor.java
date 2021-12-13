package com.example.herancapoo;

public class Professor extends  Pessoa{
    // Atributos

    private char especialidade;
    private float salario;

    // Metodos Abstratos
    public  void ReceberAum(float aum){
        this.salario += aum;
    }

    // Metodos Especiais

    public char getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(char especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
