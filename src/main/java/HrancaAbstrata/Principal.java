package HrancaAbstrata;

public class Principal {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Bolsista b1 = new Bolsista();
        Tecnico c1 = new Tecnico();

        v1.setNome("Rogerio");
        v1.setIdade(25);
        v1.setSexo('M');

        a1.setNome("Ana");
        a1.setIdade(24);
        a1.setSexo('F');
        a1.setMatricula(545665);
        a1.PagarMensalidade();

        System.out.println(v1.toString());
        System.out.println(a1.toString());




    }
}
