package com.example.herancapoo;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    // Metodos Abstratos

    public void fazerAniversario(){
        this.idade++;
    }

    // Nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    // Idade
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    // Sexo
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    @Override
    public  String toString(){
        return "Pessoa(" + "nome: " + nome + ", idade: " + idade + ", sexo: " + sexo + ")";
    }
}
