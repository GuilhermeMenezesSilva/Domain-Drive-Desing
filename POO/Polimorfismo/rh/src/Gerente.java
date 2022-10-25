public class Gerente extends Funcionario {

    private String area;
    private double bonus;

    public Gerente(String nome, int codigo, double salario, String area, double bonus) {
        super(nome, codigo, salario);
        this.area = area;
        this.bonus = bonus;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + this.bonus;
    }

    @Override
    public String toString() {
        return "Gerente [area " + area + ", bonus " + bonus + ", Nome " + getNome() + ", Codigo"
                + getCodigo() + "]";
    }
}