public final class Presidente extends Funcionario {

    private double valorDaCotasDeAcoes;

    public Presidente(String nome, int codigo, double salario,
            double valorDaCotasDeAcoes) {
        super(nome, codigo, salario);
        this.valorDaCotasDeAcoes = valorDaCotasDeAcoes;
    }

    public double getValorDaCotasDeAcoes() {
        return valorDaCotasDeAcoes;
    }

    public void setValorDaCotasDeAcoes(double valorDaCotasDeAcoes) {
        this.valorDaCotasDeAcoes = valorDaCotasDeAcoes;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + this.valorDaCotasDeAcoes;
    }

    @Override
    public String toString() {
        return "Presidente [valorDaCotasDeAcoes " + valorDaCotasDeAcoes + " salario " + getSalario() + ", Nome "
                + getNome() + ", Codigo"
                + getCodigo() + "]";
    }

}