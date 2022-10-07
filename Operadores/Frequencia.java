import javax.swing.JOptionPane;

public class Frequencia{
    public static void main(String[] args) {

        double aulas = Double.valueOf(JOptionPane.showInputDialog(null, "Quantas aulas foram ministradas? "));
        double presenca = Double.valueOf(JOptionPane.showInputDialog(null, "Quantas aulas o aluno compareu?"));

        double frequencia = (presenca/aulas) * 100;

        JOptionPane.showMessageDialog(null, "A frequência do aluno é de: " + frequencia +"%");
    }
}