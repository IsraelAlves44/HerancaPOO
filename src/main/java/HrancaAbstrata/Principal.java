package HrancaAbstrata;

public class Principal {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();

        v1.setNome("Rogerio");
        v1.setIdade(22);

        a1.setNome("Ana");
        a1.setMatricula(48564);
        a1.setIdade(50);
        b1.setMatricula(87585465);
        b1.setSexo('M');
        b1.PagarMensalidade();
        System.out.println(v1.toString());
        System.out.println(a1.toString());
    }
}
