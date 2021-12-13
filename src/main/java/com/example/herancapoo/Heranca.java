package com.example.herancapoo;

public class Heranca {
    public static void main(String[] args) {
        // Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");


        p1.setIdade(35);
        p2.setCurso("informatica");
        p2.setIdade(40);
        p3.setIdade(50);
        p4.setIdade(19);
        p3.setSalario(8000);

        p1.setSexo("Masculino");
        p2.setSexo("Feminino");
        p3.setSexo("Masculino");
        p4.setSexo("Feminino");

        p3.ReceberAum(550.20f);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
