import javax.swing.JOptionPane;

public class MediaAritmetica{
    public static void main(String[] args) {

       double nota1 = Double.valueOf(JOptionPane.showInputDialog(null, "Digite a primeira nota"));
       double nota2 = Double.valueOf(JOptionPane.showInputDialog(null, "Digite a primeira nota"));
       double nota3 = Double.valueOf(JOptionPane.showInputDialog(null, "Digite a primeira nota"));

       double mediaAritmetica = (nota1 + nota2 + nota3) / 3;

       JOptionPane.showMessageDialog(null, "A nota do aluno é " + mediaAritmetica);
    }
}