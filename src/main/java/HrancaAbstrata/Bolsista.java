package HrancaAbstrata;

public class Bolsista extends Aluno{
    private int bolsa;

    public void RenovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    @Override
    public void PagarMensalidade(){
        System.out.println(this.getNome() + " eh bolsista, pagamento facilitado");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }


}
