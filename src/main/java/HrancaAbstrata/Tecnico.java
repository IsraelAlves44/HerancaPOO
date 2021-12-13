package HrancaAbstrata;

public class Tecnico extends Aluno {
    private int registro;


    // Metodos Abstratos

    public void registroProfissional(){


    }
    public void praticar(){
        System.out.println(this.getNome() + "Esta praticando");
    }

    // Metodos Especiais
    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "registro=" + registro +
                '}';
    }
}
