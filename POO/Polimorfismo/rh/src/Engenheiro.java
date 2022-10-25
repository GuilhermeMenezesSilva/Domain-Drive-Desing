public class Engenheiro extends Funcionario {

    private String departamento;
    private int crea;

    public Engenheiro(int codigo, String nome, double salario,
            String departamento, int crea) {
        super(nome, codigo, salario);
        this.departamento = departamento;
        this.crea = crea;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCrea() {
        return crea;
    }

    public void setCrea(int crea) {
        this.crea = crea;
    }

    @Override
    public double getSalario() {
        return (super.getSalario() + super.getSalario() * 0.5);
    }

    @Override
    public String toString() {
        return "Engenheiro [departamento " + departamento + ", crea " + crea + ", Nome " + getNome()
                + ", Codigo " + getCodigo() + ", Salario bonus " + getSalario() + "]";
    }

}